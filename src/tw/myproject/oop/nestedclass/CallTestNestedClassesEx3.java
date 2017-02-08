package tw.myproject.oop.nestedclass;

class E{
	public void execInner(){//F1 function1
		int index=6;
		class F{//宣告在內部
			public void play(){
				System.out.println("Play Tomb Raider :"+index);
			}
		}
		F f1 = new F();
		f1.play();
	}
}



public class CallTestNestedClassesEx3 {

	public static void main(String[] args) {
		E e1 = new E();
		e1.execInner();

	}

}
