package second;

class Postgraduate extends Student{
	String scholarship(float score) {
		if(score >= 85.0)
			return "一等奖学金";
		else if(score >= 75.0)
			return "二等奖学金";
		else if(score >= 65.0)
			return "三等奖学金";
		else
			return "无奖学金";
	}
}
