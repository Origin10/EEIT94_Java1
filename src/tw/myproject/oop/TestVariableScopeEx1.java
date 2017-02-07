package tw.myproject.oop;

public class TestVariableScopeEx1 {

	int a=1;  //instance variable
	static int b=2;   //static variable
	
	public void f1(int c){  //local variable
		int d=4;  //local variable
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
	}
	
	public static void f2(int e){  //local variable
		//System.out.println("a1=" + a);  //compile error
		System.out.println("b1=" + b);
//		System.out.println("c1=" + c);    //compile error
//		System.out.println("d1=" + d);   //compile error
		System.out.println("e1=" + e);
	}
	
	public static void main(String[] args) {
		TestVariableScopeEx1 scope = new TestVariableScopeEx1();
		scope.f1(3);
		TestVariableScopeEx1.f2(5);
		System.out.println("finished");
	}

}
