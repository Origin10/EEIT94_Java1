package networking;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerTopic {
	public static void main(String[] args) throws Exception {
		System.out.println("Server");
		ServerSocket serverSocket = new ServerSocket(9999);
		
		while (true) {
			Socket socket = serverSocket.accept();
			
			Runnable runnable = new Worker(socket);
			Thread thread = new Thread(runnable);
			thread.start();
		}
		
	}
}
