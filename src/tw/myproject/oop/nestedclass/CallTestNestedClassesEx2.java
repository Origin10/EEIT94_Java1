package tw.myproject.oop.nestedclass;

class C{
	int a =1;
	static int b=2;//ClassD �i�s���Ҧ�static member
	
	static class D{
		public void action(){
			//System.out.println("a="+a); //compile error
			System.out.println("b="+b);
		}
	}
	
}

public class CallTestNestedClassesEx2 {

	public static void main(String[] args) {
		C.D d1 = new C.D();
		d1.action();

	}

}
