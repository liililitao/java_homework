
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(6, 4);
		System.out.println("这个矩形的面积为：" + rectangle.getArea());
		System.out.println("这个矩形的周长为：" + rectangle.getPerimeter());
		System.out.println("这个矩形的图像如下：");
		rectangle.Draw();
	}

}
