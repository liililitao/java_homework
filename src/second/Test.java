package second;

public class Test {
	public String name;
	protected int number;
	float score;
	private int money;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.name = "张三";
		t1.number = 333;
		t1.score = 78.4f;
		t1.money = 50;
	}
}

class Test1 extends Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.name = "张三";
		t1.number = 333;
	}
	
}