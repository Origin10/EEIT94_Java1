package tw.myproject.oop;

class Car{
	public String brand= "III";
	public void showInfo(){
		System.out.println("My brand:"+brand);
	}
}


public class TestEqualsEx1 {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Car();
		
		System.out.println("(myCar==yourCar)="+(myCar==yourCar));
		System.out.println("(myCar.equals(yourCar))="+(myCar.equals(yourCar)));

		yourCar=myCar;
		
		System.out.println("(myCar==yourCar)="+(myCar==yourCar));
		System.out.println("(myCar.equals(yourCar))="+(myCar.equals(yourCar)));
	}

}
