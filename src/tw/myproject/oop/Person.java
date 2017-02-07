package tw.myproject.oop;

public class Person {

	public static void main(String[] args) {
		Shirt myShirt = new Shirt();
		
		myShirt.price = 3000;
		myShirt.size = 'M';
		
		System.out.println("myShirt.price=" + myShirt.price);
		System.out.println("myShirt.size=" + myShirt.size);
		
		myShirt.showInfo();
	}

}
