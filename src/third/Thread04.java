package third;

class Thread04 implements Runnable{
    private static int ticket = 100;                //��̬������������
    @Override
    public void run() {
        while(true){
            show();
        }
    }
    public synchronized static void show(){         //ͬ������
        if(ticket>0){
            try {
                Thread.sleep(100);          //ģ����Ʊ������Ҫ��ʱ��
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"������Ʊ��Ʊ��Ϊ"+ticket);
            ticket--;
        }
    }
}
