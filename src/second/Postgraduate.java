package second;

class Postgraduate extends Student{
	String scholarship(float score) {
		if(score >= 85.0)
			return "һ�Ƚ�ѧ��";
		else if(score >= 75.0)
			return "���Ƚ�ѧ��";
		else if(score >= 65.0)
			return "���Ƚ�ѧ��";
		else
			return "�޽�ѧ��";
	}
}
