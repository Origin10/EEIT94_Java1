package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Worker implements Runnable {
	private Socket socket;
	public Worker(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		try(PrintStream out = new PrintStream(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
			String line = in.readLine(); //2
			while (line != null) {
				System.out.println(line);
				out.println(line + ":" + socket); //3

				line = in.readLine(); //2
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (socket!=null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
		}
	}
}
