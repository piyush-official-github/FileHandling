package fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class transdata {

	public static void main(String[] args) {
		Path sourceFile = Paths.get("C:\\Users\\win 10\\desktop\\t3.txt");
		Path destinationFile = Paths.get("C:\\Users\\win 10\\desktop\\t4.txt");
		try {
		    Files.copy(sourceFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);
		    System.out.println("File copied successfully!");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

}







