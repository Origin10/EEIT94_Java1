package tw.myproject.oop.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferCharStremIOEx2 {

	public static void main(String[] args) throws IOException {
		//FileReader fr1 = new FileReader("c:/temp/test/source.txt");
		//BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br1 = new BufferedReader(new FileReader("c:/temp/test/source.txt"));
		
		//FileWriter fw1 = new FileWriter("c:/temp/test/virus.txt");
		//BufferedWriter bw1 = new BufferedWriter(fw1);
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("c:/temp/test/virus.txt"));  //1.
		
		String data;
		while((data=br1.readLine())!=null){
			System.out.println(data);
			bw1.write(data);  //2.
			bw1.newLine();  //3.
		}
		
		bw1.flush();
		
		bw1.close();  //4.
		br1.close();

	}

}
