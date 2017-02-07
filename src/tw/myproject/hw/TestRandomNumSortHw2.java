package tw.myproject.hw;

public class TestRandomNumSortHw2 {
	int[] count = new int[42];

	public void createLotteryNum() {
		for (int i = 0; i <= 100000; i++) {
			int ranNum = (int) (Math.random() * 42 + 1);
			count[ranNum - 1] = count[ranNum - 1] + 1;
		}
		for(int j=1;j<=42;j++){}
	}

	public static void main(String[] args) {

	}

}
