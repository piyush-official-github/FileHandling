package FileHnadlingInJava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyData2 {

	public static void main(String[] args) throws IOException {
		

		BufferedInputStream r = new BufferedInputStream(new FileInputStream ("c:\\users\\win 10\\Documents\\file3.txt"));
		BufferedOutputStream w = new BufferedOutputStream(new FileOutputStream ("c:\\users\\win 10\\Documents\\file4.txt"));
		
		int read;
		while((read=r.read())!=-1) {
			w.write((char)read);
		}
		System.out.println("Data Transfered Successfully");

	}

}
