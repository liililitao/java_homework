package third;

import java.util.concurrent.locks.ReentrantLock;

class Bank {
	static int sum;
	
	//使用同步代码块
    public void addMoney(int num){
        synchronized (this) { 
            sum += num;
            System.out.println("汇款总额为：" + sum);
       }
    }
    
    //使用同步方法
    public synchronized void addMoney1(int num){
        sum += num;
        System.out.println("汇款总额为：" + sum);
    }

    //使用同步锁
    public void addMoney2(int num){
    	final ReentrantLock lock = new ReentrantLock();
    	lock.lock();
        sum += num;
        System.out.println("汇款总额为：" + sum);
        lock.unlock();
    }
}
