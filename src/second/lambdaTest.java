package second;

public class lambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myStudent undergraduate = (float score)-> {
			if(score >= 90.0)
				return "һ�Ƚ�ѧ��";
			else if(score >= 80.0)
				return "���Ƚ�ѧ��";
			else if(score >= 70.0)
				return "���Ƚ�ѧ��";
			else
				return "�޽�ѧ��";
		};
		System.out.println("�ɼ�Ϊ87�ı�������ѧ��ȼ�Ϊ��" + undergraduate.scholarship(87));
		myStudent postgraduate = (float score)-> {
			if(score >= 85.0)
				return "һ�Ƚ�ѧ��";
			else if(score >= 75.0)
				return "���Ƚ�ѧ��";
			else if(score >= 65.0)
				return "���Ƚ�ѧ��";
			else
				return "�޽�ѧ��";
		};
		System.out.println("�ɼ�Ϊ85���о�����ѧ��ȼ�Ϊ��" + postgraduate.scholarship(85));
		
	}

}
