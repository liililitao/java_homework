package third;

class Customer extends Thread{ 
	Bank bank = new Bank();
    public void run() {
        for(int i=0; i<3; i++){
            bank.addMoney(100);
        }
    }
}
