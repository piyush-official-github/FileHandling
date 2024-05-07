package FileHnadlingInJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileRename2 {

	public static void main(String[] args) {
		
		 Path source = Paths.get("c:\\users\\win 10\\Documents\\file2.txt");
	     Path target = Paths.get("c:\\users\\win 10\\Documents\\file3.txt");

	        try {
	            Files.move(source, target);
	            System.out.println("File renamed successfully.");
	        } catch (IOException e) {
	            System.out.println("Failed to rename the file.");
	            e.printStackTrace();
	        }
	}

}
