package fourth;

/*
 * 17.删除文本
 * 文本文件的路径及文件名为：
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
		System.out.println("请输入文件路径及文件名："); 
		String srcPath = in.nextLine();
		System.out.println("请输入要删除的字符串：");
		String sd = in.nextLine();
		BufferedReader brin = new BufferedReader(new FileReader(srcPath));
		String s;
		while((s = brin.readLine()) != null) {
			/*StringBuilder sb = new StringBuilder(s);
			System.out.println("删除前的字符串为：" + sb);
			int k = sb.indexOf(sd);//从 sb 中查找sd字符串出现的位置 
			sb.delete(k, k+sd.length());//从 sb 中删除 start 位置开始到 end 位置结束的字符串 
			System.out.println("删除后的字符串为：" + sb);*/
			
			//选做：用列表List做删除操作
			List<Character> list = new ArrayList<>();
			System.out.println("删除前的字符串为：" + s);
			for(int i = 0; i < s.length(); i++)
				list.add(s.charAt(i));
			int k = list.indexOf(sd.charAt(0));//k是要删除的字符串的第一个字符的索引
			for(int i = 0; i < sd.length(); i++)//每次移除一个字符，移除sd.length次
				list.remove(k);//因为移除第一个字符后，后面的字符串会往前移，所以一直移除下标为k的就行
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < list.size(); i++)
				sb.append(list.get(i));
			System.out.println("删除后的字符串为：" + sb);
			
			PrintWriter pout = new PrintWriter(new FileWriter(srcPath));
			pout.println(sb);
			pout.close();
		}
		brin.close();
		in.close();
	}

}
