package tw.myproject.oop.nestedclass;

class A{
	class B{
		public void sayHi(){
			System.out.println("Hola");//4.
		}
	}
	
	public void callB(){//2.
		B b1 = new B();
		b1.sayHi();//3.
	}
	
}


public class CallTestNestedClassesEx1 {

	public static void main(String[] args) {
		//不能直接 new B
		A a1 = new A();
		a1.callB(); //1.
		System.out.println("Finshed.");//5.
		
		//如果要new B(不常用)
		
		A.B b2 = a1.new B();
		b2.sayHi();
	}

}
