package tw.myproject.oop.array;

public class TestStringClassEx2 {

	public static void main(String[] args) {
		String str1 = "abc";
		boolean flag1 = str1.matches("[a-z]{3}");
		System.out.println("str1.matches(\"[a-z]{3}\")=" + flag1);
		
		String str2 = "a1234b56789";
		boolean flag2 = str2.matches(".*[a-z0-9&&[^bc]]");
		System.out.println("str2.matches(\"[a-z]{3}\")=" + flag2);
		System.out.println("str2.matches('.*[a-zA-Z0-9&&[^bc]]')=" + str2.matches(".*[a-zA-Z0-9&&[^bc]]"));
	    System.out.println("str2.matches('.*[a-zA-Z0-9&&[^bc]]{10}')=" + str2.matches(".*[a-zA-Z0-9&&[^bc]]{10}"));
	}

}
