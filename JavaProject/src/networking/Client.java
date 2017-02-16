package networking;


import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;


public class Client {

	public static void main(String[] args) throws Exception, IOException  {
//		System.out.println("Client");
		Socket socket = new Socket("localhost",9995);
		
		/*
		 * 測試用程式
		 */
		
//		OutputStream out= socket.getOutputStream();
//		out.write(1000);

		/*
		 * Client output	
		 */
		
		PrintStream out = new PrintStream(socket.getOutputStream(),true);
		//true 是打開Auto Flush()
		out.println("I'm a string.");
		
		
		
		out.close();
		socket.close();

	}

}
