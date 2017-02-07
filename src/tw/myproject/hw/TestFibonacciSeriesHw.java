package tw.myproject.hw;

public class TestFibonacciSeriesHw {

	public long f(int n) { // recursive method
		if ((n - 1) == 0 || (n - 1) == 1) {
			return (n - 1);
		}

		return f(n - 1) + f(n - 2);
	}

	public static void main(String[] args) {
		TestFibonacciSeriesHw fibo = new TestFibonacciSeriesHw();
		
		for (int i = 1; i <= 48; i++) {
			long num = fibo.f(i);
			System.out.println("num" + i + "=" + num);
		}
	}

}
