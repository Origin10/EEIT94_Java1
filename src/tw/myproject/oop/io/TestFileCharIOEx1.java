package tw.myproject.oop.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFileCharIOEx1 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("c:/temp/test/source.txt");
		if(file1.exists()){
			FileReader fr1 = new FileReader(file1);
			
			int data;
			while((data=fr1.read())!=-1){
				System.out.print(data+" ");//µL≤z¿Y 28961 29702 38957 
			}
			
			fr1.close();
		}else{
			file1.createNewFile();
			System.out.println("you've got a virus.");
		}

	}

}
