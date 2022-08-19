package org.episode01;

import java.io.File;
import java.io.IOException;

public class EighteenFile3 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("E:\\notepad.txt");
		
		
		//it will create the  new file
		boolean createNewFile = f.createNewFile();   
		System.out.println(createNewFile);
		
		
		//it will read the file if already created file
		boolean canRead = f.canRead();
		System.out.println(canRead);
		
		
		//it will write the file from already created file
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		
		boolean exists = f.exists();
		System.out.println(exists);
		
		
	}
}
