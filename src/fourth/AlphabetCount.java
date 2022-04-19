package fourth;

/*
 * 附加 1.读入一个 TXT 文本，统计各个字母出现的次数
 * */

import java.io.*;

public class AlphabetCount {

	public static void main(String[] args) throws java.io.IOException{
		// TODO Auto-generated method stub
		File f1 = new File(".\\src\\fourth\\WordsCount.txt");
	   	BufferedReader fis = new BufferedReader(new FileReader(f1));
		int[] alphabetCount = new int[26];//存放a-z出现的次数
		String s;
		while((s = fis.readLine()) != null){
			for(int i = 0; i < s.length(); i++) {
				for(int k = 0; k < 26; k++) {
					if(s.charAt(i) == 'a' + k) {
						alphabetCount[k]++;
						break;//已经匹配到了则不必再继续判断，直接跳出这一层循环
					}
				}
			}
		}
		for(int i = 0; i < 26; i++) {
			System.out.println((char)('a' + i) + "出现的次数为：" + alphabetCount[i]);
		}
		fis.close();
	}

}
