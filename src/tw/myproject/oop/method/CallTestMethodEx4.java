package tw.myproject.oop.method;

class Worker {
	public boolean produce() {
		System.out.println("Produce my Drink");
		return false;
	}
}

public class CallTestMethodEx4 {

	public static void main(String[] args) {
		Worker worker = new Worker();
		boolean status = worker.produce();

		if (status) {
			System.out.println("drink.");
		} else {
			System.out.println("feel sad.");
		}
	}

}
