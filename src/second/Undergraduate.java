package second;

class Undergraduate extends Student{
	String scholarship(float score) {
		if(score >= 90.0)
			return "һ�Ƚ�ѧ��";
		else if(score >= 80.0)
			return "���Ƚ�ѧ��";
		else if(score >= 70.0)
			return "���Ƚ�ѧ��";
		else
			return "�޽�ѧ��";
	}
}
