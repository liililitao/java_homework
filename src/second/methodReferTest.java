package second;

public class methodReferTest {
	
	static void compTest(myStudent2 p, float score) {
		p.scholarship(score);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compTest(scholarship::scholarship1, 76);
		compTest(scholarship::scholarship2, 76);
	}

}
