package tw.myproject.hw;

public class TestRandomNumSortHw {

	public static void main(String[] args) {

		int[] Counter = new int[42];
		int[] ArrayNum = new int[42];
		
		for (int i = 0; i < 100000; i++) {
			int Rnum = (int) ((Math.random() * 42) + 1);
			Counter[Rnum-1] = Counter[Rnum-1] + 1;//ArrayError
		}

		for (int k = 0; k <= 41; k++) {
			System.out.println("Num:[" + k + "]= " + Counter[k]);	
		}
		
		for(int j=1;j<=42;j++){
			ArrayNum[j-1]=j;
		}

		for (int i = 0; i < Counter.length - 1; i++) {
		for (int j = i + 1; j < Counter.length; j++) {
			int temp = 0; int temp2 =0;
			if (Counter[i] < Counter[j]) {
				temp = Counter[i];
				Counter[i] = Counter[j];
				Counter[j] = temp;
				
				temp2 = ArrayNum[i];
				ArrayNum[i] = ArrayNum[j];
				ArrayNum[j] = temp2;
				
				//這段程式把 ArrayNum 和Counter一起分類了
			}
		}
	}for (int x = 0; x < 42; x++) {
		System.out.println("NO. "+ArrayNum[x]+":" + Counter[x]);
	}
	}
}