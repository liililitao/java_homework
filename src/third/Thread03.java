package third;

class Thread03 implements Runnable{
    private static int ticket = 100;            //��̬���ݹ���
    @Override
    public void run() {
        while(true){
            if(ticket>0){
                try {
                    Thread.sleep(100);      //ģ����Ʊ��Ҫ��ʱ��
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"������Ʊ,Ʊ��Ϊ��"+ticket);
                ticket--;
            }
        }
    }
}
