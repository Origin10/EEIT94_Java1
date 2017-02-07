package tw.myproject.oop;

class Car{
	int price = 20000;
	char size = 'L';
}

public class CallTestReferenceEx1 {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.price = 30000;
		myCar.size = 'M';
		
		Car yourCar = new Car();
		yourCar.price = 50000;
		yourCar.size = 'S';
		
		System.out.println("myCar=" + myCar);
		System.out.println("yourCar=" + yourCar);
		
		System.out.println("myCar.price=" + myCar.price);
		System.out.println("myCar.size=" + myCar.size);
		
		System.out.println("yourCar.price=" + yourCar.price);
		System.out.println("yourCar.size=" + yourCar.size);
		
		yourCar=myCar;
		
		yourCar.price = 40000;
		yourCar.size = 'X';
		
		System.out.println("myCar_1=" + myCar);
		System.out.println("yourCar_1=" + yourCar);
		
		System.out.println("myCar.price_1=" + myCar.price);
		System.out.println("myCar.size_1=" + myCar.size);
	}

}
