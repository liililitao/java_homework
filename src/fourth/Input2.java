package fourth;

/*
 * 16.����һ���ַ�������
 * д����ļ���·���Լ��ļ�����
 * .\\src\\fourth\\input2.txt
 * */

import java.io.*;
import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) throws java.io.IOException{
		// TODO Auto-generated method stub
		String input = ""; 
		Scanner in = new Scanner(System.in); 
		System.out.println("��Ӽ�������һ�����ַ���");
		PrintWriter pout = new PrintWriter(new FileWriter(".\\src\\fourth\\input2.txt"));
		while(!(input = in.nextLine()).equals("quit")) {//���ռ���������ַ���
			pout.println(input);
		}
		pout.close();
		in.close();
	}

}
