package tw.myproject.hw;

public class TestRandomNumSortHw {

	public static void main(String[] args) {

		int[] NumArray = new int[43];
		for (int i = 0; i < 100000; i++) {
			int Rnum = (int) ((Math.random() * 42) + 1);
			NumArray[Rnum] = NumArray[Rnum] + 1;
		}

		for (int k = 0; k <= 42; k++) {
			System.out.println("Num:[" + k + "]= " + NumArray[k]);	
		}

		for (int i = 0; i < NumArray.length - 1; i++) {
		for (int j = i + 1; j < NumArray.length; j++) {
			int temp = 0; int temp2 =0;
			if (NumArray[i] < NumArray[j]) {
				temp = NumArray[i];
				NumArray[i] = NumArray[j];
				NumArray[j] = temp;
				
				
			}
		}
	}for (int x = 0; x < 42; x++) {
		System.out.println("[" + x + "]= " + NumArray[x]);
	}
	}
}