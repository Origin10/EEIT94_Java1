package tw.myproject.oop.mythread;

class MyThreadEx2 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName() + " i=" + i);
			
			//System.out.print(Thread.currentThread().getName() + " ");
			//System.out.println("i=" + i);
		}
	}	
}

public class CallTestMyThreadEx2 {

	public static void main(String[] args) {
		MyThreadEx2 test1 = new MyThreadEx2();
		
		Thread thread1 = new Thread(test1,"kitty");
		Thread thread2 = new Thread(test1,"superman");
		
		thread1.start();
		thread2.start();
		
		System.out.println("finished");
	}

}
