package tw.myproject.oop.exception;

public class TestExceptionEx3 {
	
	public void divide(int x, int y) throws ArithmeticException, Exception{
		System.out.println("x/y=" +(x/y));
	}

	public static void main(String[] args) { //throws ArithmeticException, Exception
		TestExceptionEx3 except = new TestExceptionEx3();
		try {
			except.divide(6, 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
