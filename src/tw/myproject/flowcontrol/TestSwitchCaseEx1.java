package tw.myproject.flowcontrol;

public class TestSwitchCaseEx1 {

	public static void main(String[] args) {
		int favorFood = 2;
		
		switch(favorFood){
		   case 1:
			   System.out.println("fried chicken");
			   break;
		   case 2:
			   System.out.println("pasta.");
			   //break;
		   case 3:
			   System.out.println("sandwitch");
			   break;
		   default:
			   System.out.println("steak.");
			   break;
		}
        
		System.out.println("happy, Horray.");
	}

}
