package FileHnadlingInJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class bufferedReader {

	public static void main(String[] args) {
		
		 try {
	            BufferedReader reader = new BufferedReader(new FileReader("c:\\users\\win 10\\Documents\\file1.txt"));
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	            reader.close();
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }

	}

}
