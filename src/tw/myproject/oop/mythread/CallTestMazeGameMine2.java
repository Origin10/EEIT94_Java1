package tw.myproject.oop.mythread;

class MazeGame2 {
	private int x = 0, y = 0;

	public void setPosi(int x, int y) {
		synchronized (this) {
			this.x = x;
			this.y = y;
			this.notify();
		}
	}

	public void checkExit() {
		synchronized (this) {
			try {
				this.wait();
				if (x == 0 && y == 0) {
					System.exit(-1);
				}
			} catch (InterruptedException e) {

			}
		}

	}

}

class Hero2 implements Runnable {//

	private MazeGame2 core;

	public Hero2(MazeGame2 core) {
		this.core = core;
	}
	@Override
	public void run() {
		while (true) {
			int x = (int) ((Math.random() * 2 + 1) - 2);
			int y = (int) ((Math.random() * 2 + 1) - 2);

//			int x = (int) (Math.random());
//			int y = 0;
//			if (x == 1) {
//				y = 0;
//			}else{
//				y = 1;
//			}
//			
			core.setPosi(x, y);

			try {
				Thread.sleep((int) (Math.random() * 800));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class CallTestMazeGameMine2 {

	public static void main(String[] args) {
		MazeGame core = new MazeGame();

		Hero hero = new Hero(core);
		Thread thread1 = new Thread(hero);
		thread1.start();

	}

}
