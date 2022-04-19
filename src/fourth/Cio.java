package fourth;

/*
 * 15.实现文件复制功能
 * 源文件文件路径及文件名：
 * .\\src\\fourth\\Cio.java
 * 目标文件的文件路径及文件名：
 * .\\src\\fourth\\coutput.txt
 * */

import java.io.*;
import java.util.Scanner;

public class Cio {

	public static void main(String[] args) throws java.io.IOException{
		// ODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("请输入要复制的文件路径及文件名："); 
		String srcPath = in.nextLine();
		System.out.println("请输入目标文件的文件路径及文件名："); 
		String srcName = in.nextLine();
		BufferedReader brin = new BufferedReader(new FileReader(srcPath));
		BufferedWriter brout = new BufferedWriter(new FileWriter(srcName));
		String s;
		while((s = brin.readLine()) != null) {
			brout.write(s);
			brout.newLine();
		}
		brout.flush();
		brin.close();
		brout.close();
		in.close();
	}

}
