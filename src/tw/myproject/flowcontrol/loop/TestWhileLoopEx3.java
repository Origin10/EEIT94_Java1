package tw.myproject.flowcontrol.loop;

public class TestWhileLoopEx3 {

	public static void main(String[] args) {
		long sum = 0;
		int i = 1;
		while (i <= 100000) {
			sum = sum + i;
			i++;
		}
		System.out.println("sum=" + sum);
	}

}
