package tw.myproject.oop.exception;

public class TestExceptionEx1 {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6};
		
		try{
			for(int i =0;i<=6; i++){
				System.out.println("data["+i+"]=" + data[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e){
			//System.out.println("hi");
//			System.out.println("e1="+e);
			e.printStackTrace();//¦L¥X°O¾ÐÅé°ïÅ|
		}

	}

}
