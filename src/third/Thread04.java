package third;

class Thread04 implements Runnable{
    private static int ticket = 100;                //静态常量共享数据
    @Override
    public void run() {
        while(true){
            show();
        }
    }
    public synchronized static void show(){         //同步方法
        if(ticket>0){
            try {
                Thread.sleep(100);          //模拟售票过程需要的时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在售票，票号为"+ticket);
            ticket--;
        }
    }
}
