package AssistedPractice2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
	         String data = " Students Attend Virtual Live Session for Java";
	         File f1 = new File("E:\\workspace\\PracticeProject2");
	         if(!f1.exists()) {
	            f1.createNewFile();
	         }

	         FileWriter fileWritter = new FileWriter(f1.getName(),true);
	         BufferedWriter bwr = new BufferedWriter(fileWritter);
	         bwr.write(data);
	         bwr.close();
	         System.out.println("Done");
	      } catch(IOException e){
	         e.printStackTrace();
	      }

	}

}
