package FileHnadlingInJava;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {

	public static void main(String[] args) {
		
		try {
			FileReader f = new FileReader("c:\\users\\win 10\\Documents\\file1.txt");
			try {
				int i;
				while((i=f.read())!=-1) {
					System.out.print((char)i);
				}
				
			}finally {
				f.close();
			}
		}
		catch(IOException i) {
			System.out.println(i);
		}
	}

}
