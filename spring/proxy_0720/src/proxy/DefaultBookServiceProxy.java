package proxy;

public class DefaultBookServiceProxy extends DefaultBookService {
	
	public DefaultBookServiceProxy() {}
	
	public DefaultBookServiceProxy(String title,int price) {
		super(title,price);
	}
	public void print() {
		System.out.println("��ó�� �۾��� ����"); //ũ�ν���������(cross cutting concern)
		super.print(); //���۾�
		System.out.println("��ó�� �۾��� ����"); //ũ�ν���������
	}

}
