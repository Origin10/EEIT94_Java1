package tw.myproject.hw;

public class TestSquareRootsHw {

	public static void main(String[] args) {
        int a=1, b=3, c=1;
        double root1=0, root2=0;
        
        int judge = b*b-4*a*c;
        
        if(judge>=0){
        	System.out.println("Has Real Roots");
        	
        	root1=(-b+Math.sqrt(judge))/(2*a);
        	root2=(-b-Math.sqrt(judge))/(2*a);
        	
        	System.out.println("root1=" + root1);
        	System.out.println("root2=" + root2);
        	
        }else{
        	System.out.println("no Real Roots");
        }
	}

}
