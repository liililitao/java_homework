package fourth;

/*
 * 15.ʵ���ļ����ƹ���
 * Դ�ļ��ļ�·�����ļ�����
 * .\\src\\fourth\\Cio.java
 * Ŀ���ļ����ļ�·�����ļ�����
 * .\\src\\fourth\\coutput.txt
 * */

import java.io.*;
import java.util.Scanner;

public class Cio {

	public static void main(String[] args) throws java.io.IOException{
		// ODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("������Ҫ���Ƶ��ļ�·�����ļ�����"); 
		String srcPath = in.nextLine();
		System.out.println("������Ŀ���ļ����ļ�·�����ļ�����"); 
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
