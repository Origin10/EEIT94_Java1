package tw.myproject.oop.polymorphism;

public class CallTestPolymorphismEx2 {
	
	public void processAction(Mammal m){  //Mammal m = oddie; -> Mammal m = new Dog();
		m.play();                         //Mammal m = garField; -> Mammal m = new Cat();
		m.happy();
		
		if(m instanceof Dog){//判斷 m 的原型別
			Dog d1 = (Dog)m;//還原 m 的原型別
			d1.biteBall();
		}
		
		if(m instanceof Cat){
			Cat c1 = (Cat)m;
			c1.jumpAway();
		}
	}

	public static void main(String[] args) {
        Dog oddie = new Dog();
        Cat garField = new Cat();
        CallTestPolymorphismEx2 poly2 = new CallTestPolymorphismEx2();
        poly2.processAction(oddie);
        poly2.processAction(garField);

	}

}