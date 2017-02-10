package tw.myproject.oop.mythread;

class MyThreadEx4 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName() + " i=" + i);
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}	
}

public class CallTestMyThreadEx4 {

	public static void main(String[] args) {
		MyThreadEx4 test1 = new MyThreadEx4();
		
		Thread thread1 = new Thread(test1,"kitty");
		Thread thread2 = new Thread(test1,"superman");
		
		thread1.start();
		thread2.start();
		
		try{
			thread2.join();//等superMan死掉再執行finished
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("finished");
	}

}
