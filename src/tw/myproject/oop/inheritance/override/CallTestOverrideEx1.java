package tw.myproject.oop.inheritance.override;

class Animal{
	public void eat(){
		System.out.println("eats food");
	}
}

class Tiger extends Animal{
	@Override
	public void eat(){
		System.out.println("I want to drink your blood .");
	}
	
	public void eat(String meat){
		System.out.println("I want to eat your own family's" +meat+'.');
	}//Override �@�w�u���public; O�j�g
}

public class CallTestOverrideEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger jumpTiger = new Tiger();
		jumpTiger.eat();
	}

}
