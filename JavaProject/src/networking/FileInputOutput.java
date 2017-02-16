package networking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputOutput {
	public static void main(String[] args) throws Exception {
		FileInputOutput fio = new FileInputOutput();
//		fio.smallFile("C:/Users/Student/Desktop/01.jpg", "C:/Users/Student/Desktop/02.jpg");
		fio.largeFile("C:/Users/Student/Desktop/01.jpg", "C:/Users/Student/Desktop/02.jpg");
	}
	//�j�ɮ�
	public void largeFile(String inputPath, String outputPath) throws Exception {
		File inputFile = new File(inputPath);
		byte[] file = new byte[4*1024];//4K
		FileInputStream fis = new FileInputStream(inputFile);
		FileOutputStream fos = new FileOutputStream(outputPath);
		
		int size = fis.read(file);
		while(size!=-1) {
			System.out.println(size);
			fos.write(file, 0, size);
			size = fis.read(file);
		}
		fis.close();
		fos.close();
	}
	//�p�ɮ�
	public void smallFile(String inputPath, String outputPath) throws Exception {
		//input
		File inputFile = new File(inputPath);
		int length = (int) inputFile.length();
		byte[] file = new byte[length];
		FileInputStream fis = new FileInputStream(inputFile);
		int size = fis.read(file);
		fis.close();
		
		System.out.println(length+":"+size);

		//output
		FileOutputStream fos = new FileOutputStream(outputPath);
		fos.write(file);
		fos.close();
	}
}
