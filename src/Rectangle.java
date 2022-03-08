
class Rectangle {
	private int width, high;
	Rectangle(int width, int high) {
		this.width = width;
		this.high = high;
	}
	int getArea() {
		return width * high;
	}
	int getPerimeter() {
		return 2 * (width + high);
	}
	void Draw() {
		for(int i = 0; i < high; i++) {
			if(i == 0 || i == high - 1) {
				for(int j = 0; j < width; j++)
					System.out.print("*");
			}
			else {
				for(int j = 0; j < width; j++) {
					if(j == 0 || j == width - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
