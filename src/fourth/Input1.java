package fourth;

/*
 * 16.����һ���ַ�������
 * д����ļ���·���Լ��ļ�����
 * .\\src\\fourth\\input1.txt
 * */

import java.io.*;
import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) throws java.io.IOException{
		// TODO Auto-generated method stub
		String input = ""; 
		Scanner in = new Scanner(System.in); 
		System.out.println("��Ӽ�������һ�����ַ���");
		BufferedWriter brout = new BufferedWriter(new FileWriter(".\\src\\fourth\\input1.txt"));
		while(!(input = in.nextLine()).equals("quit")) {//���ռ���������ַ���
			brout.write(input);
			brout.newLine();
		}
		brout.flush();
		brout.close();
		in.close();
	}

}
