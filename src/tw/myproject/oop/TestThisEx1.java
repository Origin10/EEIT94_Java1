package tw.myproject.oop;

public class TestThisEx1 {

	int lat = 25, logt = 126;  //instance variable

	public void showPosition(int lat, int logt) {  //local variable
		this.lat = lat;
		this.logt = logt;
		//System.out.println("this=" + this);
	}

	public static void main(String[] args) {
		TestThisEx1 test1 = new TestThisEx1();
		//System.out.println("test1=" + test1);
		test1.showPosition(30, 110);
		System.out.println("test1.lat=" + test1.lat);
		System.out.println("test1.logt=" + test1.logt);
	}

}
