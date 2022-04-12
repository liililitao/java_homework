package third;

class Thread03 implements Runnable{
    private static int ticket = 100;            //静态数据共享
    @Override
    public void run() {
        while(true){
            if(ticket>0){
                try {
                    Thread.sleep(100);      //模拟售票需要的时间
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在售票,票号为："+ticket);
                ticket--;
            }
        }
    }
}
