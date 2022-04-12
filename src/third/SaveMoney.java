package third;

class SaveMoney extends Thread {
	private int money;
	private Account account;
	
	public SaveMoney(String threadName, Account account, int money) {
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
	            if (account.getBalance()>=10000) {
	                try {
	                    account.wait();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            } else {
	                try {
	                    Thread.sleep(100);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                account.setBalance(account.getBalance() + money);// ��Ǯ�ɹ�
	                System.out.println(Thread.currentThread().getName()
	                        + "������" + money + "Ԫ��Ŀǰ�˻�����ǣ�"
	                        + account.getBalance() + "Ԫ");
	                account.notifyAll();
	            }
	        }
	        k--;
	        money = (int)(Math.random()*(1000-500) + 500);
	    }
	}
}
