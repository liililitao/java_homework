package fourth;

/*
 * 15.实现文件复制功能
 * 源文件文件路径及文件名：
 * .\\src\\fourth\\Fio.java
 * 目标文件的文件路径及文件名：
 * .\\src\\fourth\\Myoutput
 * */

import java.io.*;
import java.util.Scanner;

public class Fio {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("请输入要复制的文件路径及文件名："); 
		String srcPath = in.nextLine();
		System.out.println("请输入目标文件的文件路径及文件名："); 
		String srcName = in.nextLine();
		FileInputStream fis = new FileInputStream(srcPath);
		FileOutputStream fos = new FileOutputStream(srcName);
		int a;
		while((a = fis.read()) != -1) {
			fos.write(a);
		}
		fis.close();
		fos.close();
		in.close();
	}

}
