package networking;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client4 {
	public static void main(String[] args) {
		Socket socket = null;
		PrintStream out = null;
		BufferedReader in = null;

		System.out.println("Client");

		try {
			socket = new Socket("192.168.31.105", 9999);
			out = new PrintStream(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			Console console = System.console();
			String data = console.readLine();
			while (data != null) {
				out.println(data); // 1=> server
				String line = in.readLine(); // 4
				System.out.println(line);

				data = console.readLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e1) {

					e1.printStackTrace();
				}
			}
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
