
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employee = new Employee[3];
		for(int i = 0; i < 3; i++)
			employee[i] = new Employee();
		employee[0] = new Employee("张三","策划部",2001,3,23,5000);
		employee[1].set("李四","运营部",2002,4,15,6000);
		employee[2].set("王五","财务部",2005,7,14,7000);
		for(int i = 0; i < 3; i++)
			employee[i].get();
	}

}
