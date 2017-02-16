package networking;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTopic {
	public static void main(String[] args) {
		System.out.println("Client");
		
		
		Socket socket = new Socket("localhost", 9999);
		
		PrintStream out = new PrintStream(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));

		Console console = System.console();
		String data = console.readLine();
		while(data!=null) {
			out.println(data);				//1
			String line = in.readLine();	//4
			System.out.println(line);
			
			data = console.readLine();
		}
		
		in.close();
		out.close();
		socket.close();
		
//		Socket socket = null;
//		PrintStream out = null;
//		BufferedReader in = null;
//		try {
//			socket = new Socket("localhost", 9999);
//			out = new PrintStream(socket.getOutputStream(), true);
//			in = new BufferedReader(
//					new InputStreamReader(socket.getInputStream()));
//			Console console = System.console();
//			String data = console.readLine();
//			while(data!=null) {
//				out.println(data);				//1
//				String line = in.readLine();	//4
//				System.out.println(line);
//				
//				data = console.readLine();
//			}
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if(out!=null) {
//				out.close();
//			}
//			if (in!=null) {
//				try {
//					in.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				} 
//			}
//			if (socket!=null) {
//				try {
//					socket.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				} 
//			}
//		}
	}
}
