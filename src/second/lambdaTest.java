package second;

public class lambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myStudent undergraduate = (float score)-> {
			if(score >= 90.0)
				return "一等奖学金";
			else if(score >= 80.0)
				return "二等奖学金";
			else if(score >= 70.0)
				return "三等奖学金";
			else
				return "无奖学金";
		};
		System.out.println("成绩为87的本科生奖学金等级为：" + undergraduate.scholarship(87));
		myStudent postgraduate = (float score)-> {
			if(score >= 85.0)
				return "一等奖学金";
			else if(score >= 75.0)
				return "二等奖学金";
			else if(score >= 65.0)
				return "三等奖学金";
			else
				return "无奖学金";
		};
		System.out.println("成绩为85的研究生奖学金等级为：" + postgraduate.scholarship(85));
		
	}

}
