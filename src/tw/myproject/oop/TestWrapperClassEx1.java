package tw.myproject.oop;

public class TestWrapperClassEx1 {

	public static void main(String[] args) {
		String Snum="12345";
		System.out.println(Snum+"+1="+(Snum+1)) ;

		//包覆類別
		Integer i1 = new Integer(Snum);
		int value1 = i1.intValue();
		System.out.println("value1+1=" + (value1+1));
		
		int value2 = Integer.parseInt(Snum);
		System.out.println("value2+1=" + (value2+1));
		
	}

}
