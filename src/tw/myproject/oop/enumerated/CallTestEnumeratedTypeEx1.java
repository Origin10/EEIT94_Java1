package tw.myproject.oop.enumerated;

enum Poker{
	spade, heart, diamond, club//這裡是物件分別會再給序號
}

public class CallTestEnumeratedTypeEx1 {

	public static void main(String[] args) {
		Poker suit = Poker.spade;
		switch(suit){
		case spade:
			System.out.println(Poker.spade);
			break;
		case heart:
			System.out.println(Poker.heart);
			break;
		case diamond:
			System.out.println(Poker.diamond);
			break;
		case club:
			System.out.println(Poker.club);
			break;
		}
		
	}

}
