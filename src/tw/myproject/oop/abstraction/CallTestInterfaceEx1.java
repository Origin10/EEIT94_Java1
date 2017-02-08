package tw.myproject.oop.abstraction;

interface Flyer{
	public void takeoff();
	public void fly();
	public void land();
}

class Creature{
	public void eat(){
		System.out.println("Eating Human.");
	}
}

class Airplane implements Flyer{

	@Override
	public void takeoff() {
		System.out.println("Airplane takes off");
	}

	@Override
	public void fly() {
		System.out.println("Airplane fly");
	}

	@Override
	public void land() {
		System.out.println("Airplane land");
	}
}

class Bird extends Creature implements Flyer{

	@Override
	public void takeoff() {
		System.out.println("Bird takes off");
		
	}

	@Override
	public void fly() {
		System.out.println("Bird flys");
		
	}

	@Override
	public void land() {
		System.out.println("Bird lands");
		
	}
	@Override
	public void eat() {
		System.out.println("Bird eats");
	}
	
}

public class CallTestInterfaceEx1 {

	public static void main(String[] args) {
		Bird hungryBird = new Bird();
		//Flyer hungryBird = new Bird(); §ä¤£¨ìeat()
		hungryBird.eat();
	}

}
