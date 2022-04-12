package second;

class graphics {
	float length;
	graphics(float length) {
		this.length = length;
	}
	double area(float length) {
		return length;
	}
}

class round extends graphics {
	round(float length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	double area(float length) {
		return Math.PI * length * length;
	}
}

class square extends graphics {
	square(float length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	double area(float length) {
		return length * length;
	}
}