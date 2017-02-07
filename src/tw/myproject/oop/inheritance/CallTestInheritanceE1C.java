package tw.myproject.oop.inheritance;


class Parent{
	String name = "John";
	
	public Parent(){		
	}
	
	public Parent(String name){
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("hi," + name);
	}
}

class Child extends Parent{
	
	public Child(){
		super("larry");
	}
	
	public void sayGoodBye(){
		super.name = "maren";
		//super.sayHello();
		System.out.println("goodbye, " + name);
	}
}



public class CallTestInheritanceE1C {

	public static void main(String[] args) {
		Child child1 = new Child();
		child1.name = "mike";
		child1.sayHello();
		child1.sayGoodBye();
	}
}
