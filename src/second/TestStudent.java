package second;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Undergraduate u = new Undergraduate();
		u.name = "����";
		u.number = 333;
		u.score = 87;
		System.out.println(u.name + "�Ľ�ѧ��ȼ���:" + u.scholarship(u.score));
		Postgraduate p = new Postgraduate();
		p.name = "����";
		p.number = 444;
		p.score = 85;
		System.out.println(p.name + "�Ľ�ѧ��ȼ���:" + p.scholarship(p.score));
		Test t1 = new Test();
		t1.name = "����";
		t1.number = 333;
		t1.score = 78.4f;
	}

}
