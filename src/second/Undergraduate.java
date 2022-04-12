package second;

class Undergraduate extends Student{
	String scholarship(float score) {
		if(score >= 90.0)
			return "一等奖学金";
		else if(score >= 80.0)
			return "二等奖学金";
		else if(score >= 70.0)
			return "三等奖学金";
		else
			return "无奖学金";
	}
}
