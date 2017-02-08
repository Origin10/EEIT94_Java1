package tw.myproject.oop.exception;

class MyOwnException extends Exception{
	private String server = "blade";
	private int port = 80;
	private String msg = "info";
	
	public MyOwnException(String server, int port, String msg) {
		this.server = server;
		this.port = port;
		this.msg = msg;
	}//建構子在這裡用來幫助初始劃設定值。
	
	public void showDetails(){
		System.out.println("server"+server);
		System.out.println("port"+port);
		System.out.println("msg"+msg);
	}
}

public class CallTestMyOwnExceptionEx1 {

	public static void main(String[] args) {
		int code = 123456;
		if(code%2==0){
			try{
				throw new MyOwnException("deepblue",1234,"Hack Attack");
			}catch(MyOwnException e){
				e.showDetails();
			}
		}

	}

}
