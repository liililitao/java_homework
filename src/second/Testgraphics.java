package second;

public class Testgraphics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		round r1 = new round(4.5f);
		System.out.println("r1的面积为：" + r1.area(r1.length));
		square s1 = new square(3.0f);
		System.out.println("s1的面积为：" + s1.area(s1.length));
	}

}
