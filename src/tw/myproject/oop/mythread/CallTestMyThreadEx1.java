package tw.myproject.oop.mythread;

class MyThreadEx1 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			System.out.println("i=" + i);
		}
	}
	
}

public class CallTestMyThreadEx1 {

	public static void main(String[] args) {
		MyThreadEx1 test1 = new MyThreadEx1();
		
		Thread thread1 = new Thread(test1);
		Thread thread2 = new Thread(test1);
		
		thread1.start();
		thread2.start();
		
		System.out.println("finished");
	}

}
