package fourth;

/*
 * ���� 1.����һ�� TXT �ı���ͳ�Ƹ�����ĸ���ֵĴ���
 * */

import java.io.*;

public class AlphabetCount {

	public static void main(String[] args) throws java.io.IOException{
		// TODO Auto-generated method stub
		File f1 = new File(".\\src\\fourth\\WordsCount.txt");
	   	BufferedReader fis = new BufferedReader(new FileReader(f1));
		int[] alphabetCount = new int[26];//���a-z���ֵĴ���
		String s;
		while((s = fis.readLine()) != null){
			for(int i = 0; i < s.length(); i++) {
				for(int k = 0; k < 26; k++) {
					if(s.charAt(i) == 'a' + k) {
						alphabetCount[k]++;
						break;//�Ѿ�ƥ�䵽���򲻱��ټ����жϣ�ֱ��������һ��ѭ��
					}
				}
			}
		}
		for(int i = 0; i < 26; i++) {
			System.out.println((char)('a' + i) + "���ֵĴ���Ϊ��" + alphabetCount[i]);
		}
		fis.close();
	}

}
