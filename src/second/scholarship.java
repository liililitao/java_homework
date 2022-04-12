package second;

class scholarship {
	static void scholarship1(float score) {
		if(score >= 90.0)
			System.out.println("该本科生的奖学金等级为：一等奖学金");
		else if(score >= 80.0)
			System.out.println("该本科生的奖学金等级为：二等奖学金");
		else if(score >= 70.0)
			System.out.println("该本科生的奖学金等级为：三等奖学金");
		else
			System.out.println("该本科生的奖学金等级为：无奖学金");
	}
	static void scholarship2(float score) {
		if(score >= 85.0)
			System.out.println("该研究生的奖学金等级为：一等奖学金");
		else if(score >= 75.0)
			System.out.println("该研究生的奖学金等级为：二等奖学金");
		else if(score >= 65.0)
			System.out.println("该研究生的奖学金等级为：三等奖学金");
		else
			System.out.println("该研究生的奖学金等级为：无奖学金");
	}
}
