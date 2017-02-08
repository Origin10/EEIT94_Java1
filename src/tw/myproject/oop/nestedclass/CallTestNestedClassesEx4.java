package tw.myproject.oop.nestedclass;

abstract class SmartPhone {
	public abstract void dial();

	public abstract void speak();

	public abstract void hangoff();
}

class HMC extends SmartPhone {

	@Override
	public void dial() {
		System.out.println("dial");
	}

	@Override
	public void speak() {
		System.out.println("speak");
	}

	@Override
	public void hangoff() {
		System.out.println("hangoff");
	}

}

public class CallTestNestedClassesEx4 {

	public static void main(String[] args) {
		// HMC hero = new HMC();
		// hero.dial();
		// hero.speak();
		// hero.hangoff();

		// anonymous nested class

		new SmartPhone() {

			@Override
			public void dial() {
				System.out.println("dial2");
			}

			@Override
			public void speak() {
				System.out.println("speak2");
			}

			@Override
			public void hangoff() {
				System.out.println("hangoff2");
			}

		}.dial();
	}

}
