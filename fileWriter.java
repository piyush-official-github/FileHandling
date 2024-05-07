package FileHnadlingInJava;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

	public static void main(String[] args) {
		
		try {
			FileWriter f = new FileWriter("c:\\users\\win 10\\Documents\\file1.txt");
			try {
				f.write("This is awesome my friends");
			}finally {
				f.close();
			}
			System.out.println("Successfully wrote in the file");
		}catch(IOException i) {
			System.out.println(i);
		}
	}

}
