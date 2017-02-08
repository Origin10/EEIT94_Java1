package tw.myproject.oop.exception;

public class TestExceptionEx2 {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6};
		
		try{
			for(int i =0;i<=6; i++){
				System.out.println("data["+i+"]=" + data[i]);
			}
		}catch (ArithmeticException e){
			System.out.println("e1=" + e);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("e2=" + e);
			System.exit(-1);
		}finally{//finally 是最後一定要做，除非程式已經跳出
			System.out.println("run here.");
		}

	}

}
