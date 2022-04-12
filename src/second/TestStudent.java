package second;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Undergraduate u = new Undergraduate();
		u.name = "张三";
		u.number = 333;
		u.score = 87;
		System.out.println(u.name + "的奖学金等级是:" + u.scholarship(u.score));
		Postgraduate p = new Postgraduate();
		p.name = "李四";
		p.number = 444;
		p.score = 85;
		System.out.println(p.name + "的奖学金等级是:" + p.scholarship(p.score));
		Test t1 = new Test();
		t1.name = "张三";
		t1.number = 333;
		t1.score = 78.4f;
	}

}
