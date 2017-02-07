package tw.myproject.oop.method;

class Human{
	public void sayHi(){
		System.out.println("Hola3");
		sayGoodBye();
	}
	
	public void sayGoodBye(){
		System.out.println("Adios");
		//sayHi();  //Runtime Error
	}
}

public class CallTestMethodEx2 {

	public static void main(String[] args) {
		Human mike = new Human();
		//mike.sayGoodBye();
		mike.sayHi();		
		System.out.println("finished");
	}

}
