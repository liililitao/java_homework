package fourth;

/*
 * 16.创建一个字符输入流
 * 写入的文件的路径以及文件名：
 * .\\src\\fourth\\input2.txt
 * */

import java.io.*;
import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) throws java.io.IOException{
		// TODO Auto-generated method stub
		String input = ""; 
		Scanner in = new Scanner(System.in); 
		System.out.println("请从键盘输入一行行字符：");
		PrintWriter pout = new PrintWriter(new FileWriter(".\\src\\fourth\\input2.txt"));
		while(!(input = in.nextLine()).equals("quit")) {//接收键盘输入的字符串
			pout.println(input);
		}
		pout.close();
		in.close();
	}

}
