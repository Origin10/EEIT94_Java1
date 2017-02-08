package tw.myproject.oop.enumerated;
//附錄的NIO2會用到
enum GameType{
	FP, RPG("Medal of Honor"), simulate; //三個物件
	
	private String name = "Travian";
	
	private GameType(){
		System.out.println("name=" + name);//初始化印兩次FP simulate
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
			System.out.println(type + ":" + type.ordinal());//順序
			type.play();
		}//GameType type(設定變數): games(印出game物件裡的東西)
	}

}
