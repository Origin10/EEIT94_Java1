package tw.myproject.flowcontrol.loop;

public class TestBreakNContinueWithLabel {

	public static void main(String[] args) {

		point: 
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 2 && j == 3) {
					//break point;
					continue point;//point後面一定要接回圈
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}

	}

}
