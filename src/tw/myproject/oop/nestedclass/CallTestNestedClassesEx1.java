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
		//���ઽ�� new B
		A a1 = new A();
		a1.callB(); //1.
		System.out.println("Finshed.");//5.
		
		//�p�G�nnew B(���`��)
		
		A.B b2 = a1.new B();
		b2.sayHi();
	}

}
