package org.episode01;

import java.io.File;

public class EighteenFile2 {
public static void main(String[] args) {
	File f = new File("E:\\srk\\java\\inheritance\\singleinheritance");
	boolean mkdirs = f.mkdirs();
	System.out.println(mkdirs);
}
}
