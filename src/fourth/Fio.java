package fourth;

/*
 * 15.ʵ���ļ����ƹ���
 * Դ�ļ��ļ�·�����ļ�����
 * .\\src\\fourth\\Fio.java
 * Ŀ���ļ����ļ�·�����ļ�����
 * .\\src\\fourth\\Myoutput
 * */

import java.io.*;
import java.util.Scanner;

public class Fio {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("������Ҫ���Ƶ��ļ�·�����ļ�����"); 
		String srcPath = in.nextLine();
		System.out.println("������Ŀ���ļ����ļ�·�����ļ�����"); 
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