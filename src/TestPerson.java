
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("张三", "男", 22, null);
		Person p2 = new Person("李四", "女", 20, null);
		if(p1.marry(p2)) {
			System.out.print("张三的配偶为：" + p1.partner.name);
		}
		else
			System.out.println("这两个人不可以结婚");
	}

}
