package tw.myproject.oop.enumerated;
//������NIO2�|�Ψ�
enum GameType{
	FP, RPG("Medal of Honor"), simulate; //�T�Ӫ���
	
	private String name = "Travian";
	
	private GameType(){
		System.out.println("name=" + name);//��l�ƦL�⦸FP simulate
	}
	
	private GameType(String name){
		this.name = name;
	}
	
	public void play(){
		System.out.println("Play Game:" + name);
	}
}

public class CallTestEnumeratedTypeEx2 {

	public static void main(String[] args) {
		GameType[] games = GameType.values();
		
		for(GameType type: games){
			System.out.println(type + ":" + type.ordinal());//����
			type.play();
		}//GameType type(�]�w�ܼ�): games(�L�Xgame����̪��F��)
	}

}
