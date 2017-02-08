package tw.myproject.oop.abstraction;

abstract class Company{
	public abstract void calFuel();
	public abstract void calDistance();
}

class Truck extends Company{

	@Override
	public void calFuel() {
		System.out.println("Truck calculates Fuel");
	}

	@Override
	public void calDistance() {
		System.out.println("Truck calculates Distance");
	}
	
}


class Ship extends Company{

	@Override
	public void calFuel() {
		System.out.println("Ship calculates Fuel");
		
	}

	@Override
	public void calDistance() {
		System.out.println("Ship calculates Distancel");
		
	}
	
}



public class CalltestAbstractCalssEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
