package tw.myproject.type;

public class TestFinalEx1 {

	public static void main(String[] args) {
		double logE = 2.71828;
		final double pi = 3.14;
        
		logE = 100;
		//pi=6.28;
		
		System.out.println("logE=" + logE);
		System.out.println("pi=" + pi);
	}

}
