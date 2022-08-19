package org.episode01;

import java.io.File;

public class EighteenFile {

	public static void main(String[] args) {
		
		//pathlocation
		File f = new File("E:\\srk");
		boolean folder = f.mkdir();   //it will create a single folder
		System.out.println(folder);
	}
}
