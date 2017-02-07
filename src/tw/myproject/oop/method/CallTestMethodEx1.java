package tw.myproject.oop.method;

public class CallTestMethodEx1 {
	
	public void sayHello(){  //worker
		System.out.println("Hola");
	}

	public static void main(String[] args) {
		CallTestMethodEx1 test2 = new CallTestMethodEx1();
		test2.sayHello();  //caller
		System.out.println("finished");
	}

}
