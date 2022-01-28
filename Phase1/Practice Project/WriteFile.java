package AssistedPractice2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write("Its been 2 yrs");
            bufferedWriter.newLine();
            bufferedWriter.write("Since Pandemic started!");
            
 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
