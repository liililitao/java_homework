package fourth;

/*
 * 17.ɾ���ı�
 * �ı��ļ���·�����ļ���Ϊ��
 * .\\src\\fourth\\delete.txt
 * */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("�������ļ�·�����ļ�����"); 
		String srcPath = in.nextLine();
		System.out.println("������Ҫɾ�����ַ�����");
		String sd = in.nextLine();
		BufferedReader brin = new BufferedReader(new FileReader(srcPath));
		String s;
		while((s = brin.readLine()) != null) {
			/*StringBuilder sb = new StringBuilder(s);
			System.out.println("ɾ��ǰ���ַ���Ϊ��" + sb);
			int k = sb.indexOf(sd);//�� sb �в���sd�ַ������ֵ�λ�� 
			sb.delete(k, k+sd.length());//�� sb ��ɾ�� start λ�ÿ�ʼ�� end λ�ý������ַ��� 
			System.out.println("ɾ������ַ���Ϊ��" + sb);*/
			
			//ѡ�������б�List��ɾ������
			List<Character> list = new ArrayList<>();
			System.out.println("ɾ��ǰ���ַ���Ϊ��" + s);
			for(int i = 0; i < s.length(); i++)
				list.add(s.charAt(i));
			int k = list.indexOf(sd.charAt(0));//k��Ҫɾ�����ַ����ĵ�һ���ַ�������
			for(int i = 0; i < sd.length(); i++)//ÿ���Ƴ�һ���ַ����Ƴ�sd.length��
				list.remove(k);//��Ϊ�Ƴ���һ���ַ��󣬺�����ַ�������ǰ�ƣ�����һֱ�Ƴ��±�Ϊk�ľ���
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < list.size(); i++)
				sb.append(list.get(i));
			System.out.println("ɾ������ַ���Ϊ��" + sb);
			
			PrintWriter pout = new PrintWriter(new FileWriter(srcPath));
			pout.println(sb);
			pout.close();
		}
		brin.close();
		in.close();
	}

}
