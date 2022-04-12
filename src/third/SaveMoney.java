package third;

class SaveMoney extends Thread {
	private int money;
	private Account account;
	
	public SaveMoney(String threadName, Account account, int money) {
	    super(threadName);// 为当前线程设置名称
	
	    this.account = account;
	    this.money = money;
	}
	
	@Override
	public void run() {
		int k = 5;
	    while (k > 0) {
	        //此处实现同步代码块保证线程操作完整执行
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
	                account.setBalance(account.getBalance() + money);// 存钱成功
	                System.out.println(Thread.currentThread().getName()
	                        + "，存了" + money + "元，目前账户余额是："
	                        + account.getBalance() + "元");
	                account.notifyAll();
	            }
	        }
	        k--;
	        money = (int)(Math.random()*(1000-500) + 500);
	    }
	}
}
