package tw.myproject.hw;

public class TestLotteryStatisticsHw {
	int[] count = new int[42];//count[0]~count[41]
	int[] number = new int[42];

	public void createLotteryNumber() {
		for (int i=1;i<=100000;i++) {
			int rNum = (int) (Math.random() * 42) + 1;
			//System.out.println("rNum=" + rNum);
			count[rNum-1] = count[rNum-1] + 1;
		}
		
		for(int j=1;j<=42;j++){
			number[j-1]=j;
		}
	}
	
	public void numberSort(){
		for(int m=0;m<count.length-1;m++){
			for(int n=m+1;n<count.length;n++){
				int temp1=0, temp2=0;
				
				if(count[m]<count[n]){
					temp1 = count[m];
					count[m] = count[n];
					count[n] = temp1;
					
					temp2 = number[m];
					number[m] = number[n];
					number[n] = temp2;
				}
			}
		}
	}
	
	public void printResult(){
		for(int k=0;k<count.length;k++){
			System.out.println(number[k] + ":" + count[k]);
		}
	}

	public static void main(String[] args) {
		TestLotteryStatisticsHw statistic = new TestLotteryStatisticsHw();
		statistic.createLotteryNumber();
		statistic.printResult();
		statistic.numberSort();
		statistic.printResult();
	}

}
