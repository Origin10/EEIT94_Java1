package tw.myproject.oop.abstraction;

public class CallTestAbstractClassEx2 {

	public void processAction(Company corp) {
		corp.calFuel();
		corp.calDistance();

	}

	public static void main(String[] args) {
		CallTestAbstractClassEx2 abs = new CallTestAbstractClassEx2();
		abs.processAction(new Truck());//�P�@package
		abs.processAction(new Ship());//�P�@package
	}

}
