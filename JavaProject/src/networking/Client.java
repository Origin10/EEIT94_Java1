package networking;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Client {

	public static void main(String[] args) throws Exception, IOException  {
//		System.out.println("Client");
		Socket socket = new Socket("localhost",9995);
		//準備出去的
		
		
		/*
		 * 測試用程式
		 */
		
//		OutputStream out= socket.getOutputStream();
//		out.write(1000);

		
		PrintStream out = new PrintStream(socket.getOutputStream(),true);
		//true 是打開Auto Flush()
		out.println("I'm a Client. ");
				
		out.close();
		socket.close();
		
		ServerSocket Ssocket = new ServerSocket(10005);
		Socket socket2 = Ssocket.accept();
		
	  //↓這裡不能用多型的Reader 因為他沒有readLine()
		BufferedReader clientBr =new BufferedReader(new InputStreamReader(socket2.getInputStream()));
		String cAnswer = clientBr.readLine();
		
		System.out.println(cAnswer);
		
		socket2.close();
		Ssocket.close();
	}

}
