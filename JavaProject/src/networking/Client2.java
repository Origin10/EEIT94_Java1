package networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client2 {
	public static void main(String[] args) throws Exception {
		System.out.println("Client");
		Socket socket = new Socket("localhost", 9992);
		
		PrintStream out = new PrintStream(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));

		out.println("hahaha");			//1=> server
		
		String line = in.readLine();	//4
		System.out.println(line);
		
		out.close();
		socket.close();
	}
}
