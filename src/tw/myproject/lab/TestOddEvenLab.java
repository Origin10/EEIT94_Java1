package tw.myproject.lab;

public class TestOddEvenLab {

	public static void main(String[] args) {
		int num = -42;

		if (num >= 0) {
			System.out.println(num + " is positive.");
			if (num % 2 == 0) {
				System.out.println(num + " is even.");
			} else {
				System.out.println(num + " is odd.");
			}
		} else {
			System.out.println(num + " is negative.");
			if (num % 2 == 0) {
				System.out.println(num + " is even.");
			} else {
				System.out.println(num + " is odd.");
			}
		}

	}

}
