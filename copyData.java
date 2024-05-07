package FileHnadlingInJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream r = new FileInputStream("c:\\users\\win 10\\Documents\\file3.txt");
		FileOutputStream w = new FileOutputStream("c:\\users\\win 10\\Documents\\file4.txt");
		
		int read;
		while((read=r.read())!=-1) {
			w.write((char)read);
		}
		System.out.println("Data Transfered Successfully");

	}

}
