
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("����", "��", 22, null);
		Person p2 = new Person("����", "Ů", 20, null);
		if(p1.marry(p2)) {
			System.out.print("��������żΪ��" + p1.partner.name);
		}
		else
			System.out.println("�������˲����Խ��");
	}

}
