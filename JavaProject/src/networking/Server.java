package networking;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
//		System.out.println("Server");
		ServerSocket Ssocket = new ServerSocket(9995);
		Socket socket = Ssocket.accept();
		
		/*
		 * 測試用程式
		 */
		
//		InputStream in = socket.getInputStream();
//		int data = in.read();
//		System.out.println(data);
		
								   //↓InuptStream為其父類別，亦為IO接收值
		InputStream sgis = socket.getInputStream();
		//↓InputStreamReader(多載成Reader)
		Reader isr = new InputStreamReader(sgis);
		BufferedReader br = new BufferedReader(isr);
		
		String result = br.readLine();
		
		System.out.println(result);
		
		socket.close();
		
		Socket socket2 = new Socket("localhost",10005);
		
		result +="Hi, I'm server~";
		
		PrintStream out = new PrintStream(socket2.getOutputStream(),true);
		//true 是打開Auto Flush()
		out.println(result);
		
		out.close();
		socket2.close();

	}

}
