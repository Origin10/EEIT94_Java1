package tw.myproject.flowcontrol.loop;

public class TestWhileLoopEx1 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {
			System.out.println("hello " + i);
			i++;
		}
		System.out.println("finished");
	}

}
