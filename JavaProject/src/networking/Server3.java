package networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {
	public static void main(String[] args) throws Exception {
		System.out.println("Server");
		ServerSocket serverSocket = new ServerSocket(9993);
		Socket socket = serverSocket.accept();

		PrintStream out = new PrintStream(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		
		String line = in.readLine();		//2
		while(line!=null) {
			System.out.println(line);
			out.println(line+":"+socket);	//3
			
			line = in.readLine();			//2
		}
		
		in.close();
		out.close();
		socket.close();
	}
}
