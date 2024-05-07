package FileHnadlingInJava;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class printWriter {

	public static void main(String[] args) {
		

		try {
			PrintWriter f = new PrintWriter(new FileWriter("c:\\users\\win 10\\Documents\\file1.txt"));
			f.write("this is adorable guys");
			f.close();
			System.out.println("Successfully wrote in the file");
		}catch(IOException i) {
			System.out.println("Error occured");
		}

	}

}
