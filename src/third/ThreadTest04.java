package third;

public class ThreadTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread04 thread04 = new Thread04();
        Thread t1 = new Thread(thread04, "´°¿Ú1");
        Thread t2 = new Thread(thread04, "´°¿Ú2");
        Thread t3 = new Thread(thread04, "´°¿Ú3");
        t1.start();
        t2.start();
        t3.start();
	}

}
