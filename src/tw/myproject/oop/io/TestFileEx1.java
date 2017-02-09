package tw.myproject.oop.io;

import java.io.File;
import java.io.IOException;

public class TestFileEx1 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("c:/temp/hello.txt");
		boolean status = file1.exists();
		System.out.println("stauts:" + status);

		if(status){
			System.out.println("file1.getName()=" +file1.getName());
			System.out.println("file1.length()=" +file1.length()+"bytes");
			System.out.println("file1.getParent()=" +file1.getParent());
			System.out.println("file1.getPath()=" +file1.getPath());
			
			file1.delete();
			
			System.out.println("File Deleted.");
		}else{
			file1.createNewFile();//這裡要加 throws IOException(checked)
			System.out.println("File Created.");
		}
	}

}
