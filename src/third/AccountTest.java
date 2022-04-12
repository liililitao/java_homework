package third;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个银行账户并用构造方法初始化赋值 账号 余额
	    Account account = new Account("001", 0);

	    //创建一个取钱的线程对象传入参数 取钱用户名 账户对象 取钱额
	    Withdraw w = new Withdraw("张三", account, (int)(Math.random()*(1000-500) + 500));

	    //创建一个存钱的线程对象传入参数 存钱用户名 账户对象 存钱额
	    SaveMoney s = new SaveMoney("张三", account, (int)(Math.random()*(1000-500) + 500));
	    //就绪一个取钱线程和一个存钱线程
	    w.start();
	    s.start();
	}

}
