
class Employee {
	String name, department;
	int year, month, day, salary;
	Employee() {
		
	}
	Employee(String name, String department, int year, int month, int day, int salary) {
		this.name = name;
		this.department = department;
		this.year = year;
		this.month = month;
		this.day = day;
		this.salary = salary;
	}
	void set(String name, String department, int year, int month, int day, int salary) {
		this.name = name;
		this.department = department;
		this.year = year;
		this.month = month;
		this.day = day;
		this.salary = salary;
	}
	void get() {
		System.out.println("����Ϊ��" + name  + " " + "���ڲ����ǣ�" + department);
		System.out.println("��ְʱ����" + year + "��" + month + "��" + day + "��");
		System.out.println("����Ϊ��" + salary);
	}
}
