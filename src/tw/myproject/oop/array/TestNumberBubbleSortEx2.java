package tw.myproject.oop.array;

import java.util.Arrays;

public class TestNumberBubbleSortEx2 {
	int[] data = { 3, 8, 7, 42, 5 };

	public void numberSort1() {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				int temp = 0;
				if (data[i] < data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}

	public void numberSort2() {
		while (true) {
			int count=0;
			
			for (int i = 0; i < data.length - 1; i++) {
				int temp = 0;
				if (data[i] < data[i + 1]) {
					temp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp;
					count++;
				}
			}
			
			if(count==0){
				break;
			}
		}
	}
	
	public void numberSort3(){
		Arrays.sort(data);
	}

	public void printResult() {
		for (int k = 0; k < data.length; k++) {
			System.out.println("data[" + k + "]=" + data[k]);
		}
	}

	public static void main(String[] args) {
		TestNumberBubbleSortEx2 sort = new TestNumberBubbleSortEx2();
		// sort.numberSort1();
		//sort.numberSort2();
		sort.numberSort3();
		sort.printResult();
		
		
	}

}
