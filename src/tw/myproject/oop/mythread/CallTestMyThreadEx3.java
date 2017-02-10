package tw.myproject.oop.mythread;

class MyThreadEx3 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName() + " i=" + i);
			
			try{
				Thread.sleep(1000);//µ¥«Ý¤@¬í
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}	
}

public class CallTestMyThreadEx3 {

	public static void main(String[] args) {
		MyThreadEx3 test1 = new MyThreadEx3();
		
		Thread thread1 = new Thread(test1,"kitty");
		Thread thread2 = new Thread(test1,"superman");
		
		thread1.start();
		thread2.start();
		
		System.out.println("finished");
	}

}
