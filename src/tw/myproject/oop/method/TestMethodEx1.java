package tw.myproject.oop.method;

public class TestMethodEx1 {

	public int f(int x){
		return 2*x+1;
	}
	
	public static void main(String[] args) {
		TestMethodEx1 test1 = new TestMethodEx1();
		int y = test1.f(5);
		System.out.println("y=" + y);
	}
}
