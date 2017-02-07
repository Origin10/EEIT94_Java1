package tw.myproject.oop;

public class CallTestConstructorEx1 {

	public CallTestConstructorEx1(String name){
		System.out.println("I am constrcutor:" + name);
	}
	
	public void sayHello(){
		System.out.println("Buenas Tardes.");
	}
	
	public static void main(String[] args) {
		CallTestConstructorEx1 test1 = new CallTestConstructorEx1("mary");
		test1.sayHello();
		
		//anonymous object
		new CallTestConstructorEx1("judy").sayHello();  
		
		System.out.println("finished");
		
		int i=1;
		i=i+1;
		System.out.println("i=" + i);
		System.out.println("1+1=" + (1+1));
	}

}
