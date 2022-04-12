package third;

class Withdraw extends Thread {
	private int money;
	private Account account;
	
	public Withdraw(String threadName, Account account, int money) {
	    super(threadName);// Ϊ��ǰ�߳���������
	
	    this.account = account;
	    this.money = money;
	}
	
	@Override
	public void run() {
		int k = 5;
	    while (k > 0) {
	        //�˴�ʵ��ͬ������鱣֤�̲߳�������ִ��
	    synchronized (account) {
	        try {
	            Thread.sleep(100);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        if (account.getBalance() < money) {// ����
	            System.out.println(Thread.currentThread().getName()
	                    + "  ȡǮ�У�����ȡ" + money + "Ԫ�����������");
	            try {
	                account.wait();//���㣬��Ҫ�ȴ�
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        } else {
	            account.setBalance(account.getBalance() - money);// �������
	            System.out.println(Thread.currentThread().getName()
	                    + "  ȡǮ�У�ȡ��" + money + "Ԫ�����Ϊ��" + account.getBalance() + "Ԫ");
	            //���� ���д˶���������ϵĵȴ��߳�
	            account.notifyAll();
	        }
	    }
	    k--;
	    money = (int)(Math.random()*(1000-500) + 500);
	  }
	}
}
