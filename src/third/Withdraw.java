package third;

class Withdraw extends Thread {
	private int money;
	private Account account;
	
	public Withdraw(String threadName, Account account, int money) {
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
	        try {
	            Thread.sleep(100);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        if (account.getBalance() < money) {// 余额不足
	            System.out.println(Thread.currentThread().getName()
	                    + "  取钱中，打算取" + money + "元，结果：余额不足");
	            try {
	                account.wait();//余额不足，需要等待
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        } else {
	            account.setBalance(account.getBalance() - money);// 更改余额
	            System.out.println(Thread.currentThread().getName()
	                    + "  取钱中，取了" + money + "元，余额为：" + account.getBalance() + "元");
	            //唤醒 所有此对象监视器上的等待线程
	            account.notifyAll();
	        }
	    }
	    k--;
	    money = (int)(Math.random()*(1000-500) + 500);
	  }
	}
}
