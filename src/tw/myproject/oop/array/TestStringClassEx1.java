package tw.myproject.oop.array;

public class TestStringClassEx1 {

	public static void main(String[] args) {
		String data = "abcdefghij";

		System.out.println("data.charAt(5)=" + data.charAt(5));
		System.out.println("data.substring(3, 5)=" + data.substring(3, 5));
		System.out.println("data.startsWith('ab')=" + data.startsWith("ab"));
		System.out.println("data.endsWith('ab')=" + data.endsWith("ab"));
		System.out.println("data.indexOf('cd')=" + data.indexOf("cd"));
	}

}