package third;

import java.util.concurrent.locks.ReentrantLock;

class Bank {
	static int sum;
	
	//ʹ��ͬ�������
    public void addMoney(int num){
        synchronized (this) { 
            sum += num;
            System.out.println("����ܶ�Ϊ��" + sum);
       }
    }
    
    //ʹ��ͬ������
    public synchronized void addMoney1(int num){
        sum += num;
        System.out.println("����ܶ�Ϊ��" + sum);
    }

    //ʹ��ͬ����
    public void addMoney2(int num){
    	final ReentrantLock lock = new ReentrantLock();
    	lock.lock();
        sum += num;
        System.out.println("����ܶ�Ϊ��" + sum);
        lock.unlock();
    }
}
