package third;

public class ThreadTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread03 thread03 = new Thread03();
        Thread thread = new Thread(thread03,"����1");
        Thread thread1 = new Thread(thread03,"����2");
        Thread thread2 = new Thread(thread03,"����3");
        thread.start();
        thread1.start();
        thread2.start();
	}

}
