package tw.myproject.oop.exception;

public class TestAssertionEx1 {

	public static void main(String[] args) {
		int a=7,b=0;
		assert b!=0:"b="+b;
		
		//語法 assert boolean(b!=0):message("b="+b)
		
		//使用方法command line 
		//1.java -ea xxxclass
		//2.java -enableassertions xxxclass
		
		//Exception in thread "main" java.lang.AssertionError: b=0
		
		System.out.println("a/b"+(a/b));

	}

}
