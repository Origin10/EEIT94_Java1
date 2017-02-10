package tw.myproject.oop.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class TestCharIOEx2 {
	
	public String getDateTime(){//可以用來做訂單號碼
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		return "" + year + "/" + (month+1) + "/" + day;
	}

	public static void main(String[] args) throws IOException {
		File file1 = new File("c:/temp/test/souce.txt");
		File file2 = new File("c:/temp/test/souce.txt");//1.
		
		TestCharIOEx2 test1 = new TestCharIOEx2();
		String dateTime = test1.getDateTime();
		
		if(file1.exists()){
			
			FileReader fr1 = new FileReader(file1);
			FileWriter fw1 = new FileWriter(file1);//2.
			
			
			int data;
			while((data = fr1.read())!=-1){
				System.out.print((char)data);
				fw1.write(data);//3.
			}
			
			fw1.write(dateTime);
			//掀開的最後關 後開的最新觀
			fw1.close();//4.
			fr1.close();
		}else{
			file1.createNewFile();
			System.out.println("you've a mail.");
		}
	}

}
