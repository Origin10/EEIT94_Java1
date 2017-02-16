package networking;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client3 {
	public static void main(String[] args) throws Exception {
		System.out.println("Client");
		Socket socket = new Socket("localhost", 9999);
		
		PrintStream out = new PrintStream(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));

		Console console = System.console();
		String data = console.readLine();
		while(data!=null) {
			out.println(data);				//1=> server
			String line = in.readLine();	//4
			System.out.println(line);
			
			data = console.readLine();
		}
		
		in.close();
		out.close();
		socket.close();
	}
}
