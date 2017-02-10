package tw.myproject.oop.mythread;

class Role {// «Ê¸Ë
	private int hp = 100;
	private int exp = 0;
	private int level = 1;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}

class MazeGame {
	private int x = 5, y = 5;

	public void setPosi(Role role, int x, int y) {
		synchronized (this) {
			this.x = x;
			this.y = y;
			System.out.println("hp:" + role.getHp() + " x:" + x + " y:" + y);
			this.notify();
		}
	}

	public void checkExit() {
		synchronized (this) {
			try {
				this.wait();
				if (x == 0 && y == 0) {
					System.out.println("Hero Saved.");
					System.exit(-1);
				}
			} catch (InterruptedException e) {

			}
		}
	}
}

class Hero extends Role implements Runnable {

	private MazeGame core;

	public Hero(MazeGame core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {
			
			int x = (int) (Math.random() *3-1);
			int y = (int) (Math.random() *3-1);
			core.setPosi(this, x+=x, y+=y);
			
			System.out.println(x);
			System.out.println(y);
			

			try {
				Thread.sleep((int) (Math.random() * 800));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class MazeGameCoreCheck implements Runnable {

	private MazeGame core;

	public MazeGameCoreCheck(MazeGame core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {
			core.checkExit();
			try {
				Thread.sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class CallTestMazeGame {

	public static void main(String[] args) {
		MazeGame core = new MazeGame();

		Hero hero = new Hero(core);
		Thread thread1 = new Thread(hero);
		thread1.start();

		MazeGameCoreCheck check = new MazeGameCoreCheck(core);
		Thread thread2 = new Thread(check);
		thread2.start();
	}

}
