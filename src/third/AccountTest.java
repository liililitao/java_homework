package third;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����һ�������˻����ù��췽����ʼ����ֵ �˺� ���
	    Account account = new Account("001", 0);

	    //����һ��ȡǮ���̶߳�������� ȡǮ�û��� �˻����� ȡǮ��
	    Withdraw w = new Withdraw("����", account, (int)(Math.random()*(1000-500) + 500));

	    //����һ����Ǯ���̶߳�������� ��Ǯ�û��� �˻����� ��Ǯ��
	    SaveMoney s = new SaveMoney("����", account, (int)(Math.random()*(1000-500) + 500));
	    //����һ��ȡǮ�̺߳�һ����Ǯ�߳�
	    w.start();
	    s.start();
	}

}
