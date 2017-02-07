package tw.myproject.oop.overload;

public class TestOverloadEx1 {

	public void plus(int x1, int y1){
		System.out.println("x1+y1=" + (x1+y1));
	}
	
	public void plus(double x2, double y2){
		System.out.println("x2+y2=" + (x2+y2));
	}
	
	public static void main(String[] args) {
		TestOverloadEx1 overload = new TestOverloadEx1();
		overload.plus('a', 5);
	}

}
