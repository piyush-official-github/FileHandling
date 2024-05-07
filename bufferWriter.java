package FileHnadlingInJava;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class bufferWriter {

	public static void main(String[] args) {
		
		try {
			BufferedWriter f = new BufferedWriter(new FileWriter("c:\\users\\win 10\\Documents\\file1.txt"));
			f.write("i never thought about this suprise");
			f.close();
			System.out.println("Successfully wrote in the file");
		}catch(IOException i) {
			System.out.println("Error occured");
		}

	}

}
