package fourth;

/*
 * 18.ͳ��һ���ļ��е��ַ�����������������
 * 
 * */

import java.io.*;

public class Count {

	public static void main(String[] args) throws java.io.IOException{
		// TODO Auto-generated method stub
		 File f1 = new File(".\\src\\fourth\\WordsCount.txt");
	   	 BufferedReader fis = new BufferedReader(new FileReader(f1));
		 int charCount = 0;
		 int wordsCount = 0;
		 int lineCount= 0;
		 String s;
		 while((s = fis.readLine()) != null){
			 charCount += s.length();
			 String[] words = s.split("[	,. \n]");
			 wordsCount += words.length;
			 lineCount++;
		 }
		 System.out.println("�ַ���Ϊ��" + charCount);
		 System.out.println("������Ϊ��" + wordsCount);
		 System.out.println("����Ϊ��"+ lineCount);
		 fis.close();
	}

}
