package tw.myproject.hw;

public class TestTriangleHw {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int k = 1; k <= 10; k++) {
			for (int m = 1; m <= 11-k; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
