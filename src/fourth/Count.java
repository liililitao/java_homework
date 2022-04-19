package fourth;

/*
 * 18.统计一个文件中的字符数、单词数和行数
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
		 System.out.println("字符数为：" + charCount);
		 System.out.println("单词数为：" + wordsCount);
		 System.out.println("行数为："+ lineCount);
		 fis.close();
	}

}
