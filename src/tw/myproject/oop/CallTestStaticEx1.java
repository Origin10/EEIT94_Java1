package tw.myproject.oop;

class Vehicle{
	
	public static int speed = 350;
	
	public static void goForward(){
		System.out.println("Go Forward.");
	}
}

public class CallTestStaticEx1 {

	public static void main(String[] args) {
		Vehicle.goForward();
		System.out.println("Speed:" + Vehicle.speed);
	}

}
