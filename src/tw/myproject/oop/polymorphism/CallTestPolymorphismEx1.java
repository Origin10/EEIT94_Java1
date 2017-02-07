package tw.myproject.oop.polymorphism;

class Mammal {
	public void play() {
		System.out.println("play");
	}

	public void happy() {
		System.out.println("happy");
	}
}

class Dog extends Mammal {
	// 案右鍵選擇scours可以選擇自動產生override
	@Override
	public void play() {
		System.out.println("Dog style play");
	}

	@Override
	public void happy() {
		System.out.println("Dog style happy");
	}
	public void biteBall(){
		System.out.println("Bite Ball!!!!");
	}
}

class Cat extends Mammal{

	@Override
	public void play() {
		System.out.println("Catg style play");
	}

	@Override
	public void happy() {
		System.out.println("Catg style play");
	}
	public void jumpAway(){
		System.out.println("Feiyanzoubi");		
	}
	
}

public class CallTestPolymorphismEx1 {

	public static void main(String[] args) {
		Dog snoopy = new Dog();
		Mammal m1 = new Mammal();
		m1 = snoopy;
		// 上面三行等於下面
		Mammal m2 = new Dog();
		
		m1.play();
		m1.happy();

		m2.play();
		m2.happy();
		
		if(m2 instanceof Dog){
			Dog d1=(Dog)m1;
			d1.biteBall();
		}else{
			System.out.println("I'm a cat. Mew~");
		}
		
		 m2 = new Cat();
		
		if(m2 instanceof Cat){
			Cat c1=(Cat)m1;
			c1.jumpAway();
		}else{
			System.out.println("I'm Dog. Mew~");
		}

	}

}
