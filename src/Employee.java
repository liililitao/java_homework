
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
		System.out.println("姓名为：" + name  + " " + "所在部门是：" + department);
		System.out.println("入职时间是" + year + "年" + month + "月" + day + "日");
		System.out.println("工资为：" + salary);
	}
}
