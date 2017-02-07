package tw.myproject.flowcontrol.loop;

public class TestDiceGameEx1 {

	public static void main(String[] args) {

		int yourLuckyNumber = 1;

		while (true) {
			int diceNumber = (int) (Math.random() * 6 + 1);
			System.out.println("diceNumber=" + diceNumber);

			if (yourLuckyNumber == diceNumber) {
				System.out.println("You Win !!");
				break;
			} else {
				System.out.println("Try Again.");
			}
		}

	}

}
