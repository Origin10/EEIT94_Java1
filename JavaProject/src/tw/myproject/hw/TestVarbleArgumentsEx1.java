package tw.myproject.hw;

public class TestVarbleArgumentsEx1 {

	public void sum(int... a){
		int total=0;
		for(int num: a){
			total=total+num;
		}System.out.println("total:" + total);
	}
	
	public static void main(String[] args) {
		TestVarbleArgumentsEx1 varArgs = new TestVarbleArgumentsEx1();
		varArgs.sum(1,2,3,4,5,6,7,8,9,10);
	}

}
