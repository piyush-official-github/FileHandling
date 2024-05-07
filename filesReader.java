package FileHnadlingInJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class filesReader {

	public static void main(String[] args) {
		
		 try {
	            List<String> lines = Files.readAllLines(Paths.get("c:\\users\\win 10\\Documents\\file1.txt"));
	            for (String line : lines) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }

	}

}
