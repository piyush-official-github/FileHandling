package FileHnadlingInJava;

import java.io.File;

public class fileInfo {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\win 10\\Documents\\file1.txt");
		
		if(file.exists())
		{
			System.out.println("File Name ="+file.getName());
			System.out.println("File Path="+file.getAbsolutePath());
			System.out.println("File write ="+file.canWrite());
     		System.out.println("File length ="+file.length());
			System.out.println("File Read ="+file.canRead());
//			System.out.println("File Remove ="+file.delete());
			
		}else {
			System.out.println("File does not exist" );
		}

	}

}
