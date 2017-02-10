package tw.myproject.oop.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestByteConvertCharStreamIOEx2 {

	public static void main(String[] args) throws IOException {
		//InputStream is = System.in;
		//InputStreamReader isr1 = new InputStreamReader(is);
		//BufferedReader br1 = new BufferedReader(isr1);
		
		System.out.println("Please Input Your Name:(use Q or q to exit)");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
//		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/convert.txt");
//		OutputStreamWriter osw1 = new OutputStreamWriter(fos1);
//		BufferedWriter bw1 = new BufferedWriter(osw1);
		
		BufferedWriter bw1 = 
		 new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/test/convert.txt")));
		
		String data;
		while((data=br1.readLine())!=null){
			
			if("q".equalsIgnoreCase(data)){
				System.out.println("System Exit !!");
				bw1.flush();
				bw1.close();
				br1.close();
				System.exit(-1);
			}
			
			System.out.println(data);
			bw1.write(data);//¼g¤J
			bw1.newLine();
		}
		
	}

}
