package tw.myproject.oop;

public class TestThisInvokeEx1 {

	public TestThisInvokeEx1(){
		this(6);
		System.out.println("TestThisInvokeEx1()");
	}
	
	public TestThisInvokeEx1(int value){
		//this();  //maybe compile error
		System.out.println("TestThisInvokeEx1(int):" + value);
	}
	
	public static void main(String[] args) {
		//TestThisInvokeEx1 invoke = new TestThisInvokeEx1();
		System.out.println("finished");
	}

}
