
class Person {
	String name, gender;
	private int age;
	Person partner;
	Person(String name, String gender, int age, Person partner) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.partner = partner;
	}
	boolean marry(Person p) {
		if(this.gender != p.gender && this.partner == null && p.partner == null && this.age >= 18 && p.age >= 18) {
			this.partner = p;
			return true;
		}
		else return false;
	}
}
