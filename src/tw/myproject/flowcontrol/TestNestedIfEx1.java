package tw.myproject.flowcontrol;

public class TestNestedIfEx1 {

	public static void main(String[] args) {
		int level = 30;

		if (level >= 5) {
			System.out.println("stick.");
			if (level >= 10) {
				System.out.println("short sword.");
				if (level >= 25) {
					System.out.println("pistal.");
				}
			}
		}

		System.out.println("play game.");

	}

}
