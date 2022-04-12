package second;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mymatch {
	
	private static final String REGEX1 = "^(13[0-9]|14[0-9]|15[0-9]|166|17[0-9]|18[0-9]|19[8|9])\\d{8}$";
	private static final String REGEX2 = "\\w{0,}\\@\\w{0,}\\.{1}\\w{0,}";
	private static final String REGEX3 = "^([1-6][1-9]|50)\\d{4}(18|19|20)\\d{2}((0[1-9])|10|11|12)(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";
	private static final String INPUT1 = "18835219348";
	private static final String INPUT2 = "1449264620@qq.com";
	private static final String INPUT3 = "140211200204220513";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p1 = Pattern.compile(REGEX1);
		Pattern p2 = Pattern.compile(REGEX2);
		Pattern p3 = Pattern.compile(REGEX3);
		Matcher m1 = p1.matcher(INPUT1);
		Matcher m2 = p2.matcher(INPUT2);
		Matcher m3 = p3.matcher(INPUT3);
		if(m1.matches())
			System.out.println("该手机号码正确！");
		else
			System.out.println("该手机号码错误！");
		if(m2.matches())
			System.out.println("该邮箱地址正确！");
		else
			System.out.println("该邮箱地址错误！");
		if(m3.matches())
			System.out.println("该身份证号码正确！");
		else
			System.out.println("该身份证号码错误！");
	}

}
