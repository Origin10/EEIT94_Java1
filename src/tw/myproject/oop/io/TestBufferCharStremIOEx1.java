package tw.myproject.oop.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferCharStremIOEx1 {

	public static void main(String[] args) throws IOException {
		//FileReader fr1 = new FileReader("c:/temp/test/source.txt");
		//BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br1 = new BufferedReader(new FileReader("c:/temp/test/source.txt"));
		//一次讀一行,可以避免直接跟硬體消耗
		//
		
		
		String data;
		while((data=br1.readLine())!=null){
			System.out.println(data);
		}
		
		br1.close();

	}

}
