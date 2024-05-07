package FileHnadlingInJava;

import java.io.File;
import java.io.IOException;
public class createFile {

	public static void main(String[] args) throws IOException{
		
		File file = new File("C:\\Users\\win 10\\Documents\\file1.txt");
		if(file.createNewFile()) {
			System.out.println("File created successfully");
		}else{
			System.out.println("File already Exists");
		}

	}

}

// without IOException we can use try catch

/* try{
 * if(file.createNewFile()) {
			System.out.println("File created successfully");
		}else{
			System.out.println("File already Exists");
		}
 * }catch(IOexception i){
 * System.out.print(i);
 * }
 */


// another approch using newerIO
//try {
//    Path path = Paths.get("example.txt");
//    Files.createFile(path);
//    System.out.println("File created successfully.");
//} catch (IOException e) {
//    System.out.println("An error occurred.");
//    e.printStackTrace();
//}
