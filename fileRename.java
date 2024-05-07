package FileHnadlingInJava;

import java.io.File;

public class fileRename {

	public static void main(String[] args){
		
		File rename1 = new File("c:\\users\\win 10\\Documents\\file1.txt");
		File rename2 = new File("c:\\users\\win 10\\Documents\\file2.txt");
		if(rename1.exists()) {
			System.out.println(rename1.renameTo(rename2)+" Successfully rename the file");
		}else if(rename2.exists()){
			System.out.println("File already Renamed");
		}else {
			System.out.println("File not found");
		}
	}

}
