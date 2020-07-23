package proxy;

public class DefaultBookServiceProxy extends DefaultBookService {
	
	public DefaultBookServiceProxy() {}
	
	public DefaultBookServiceProxy(String title,int price) {
		super(title,price);
	}
	public void print() {
		System.out.println("전처리 작업을 수행"); //크로스컷팅컨선(cross cutting concern)
		super.print(); //주작업
		System.out.println("후처리 작업을 수행"); //크로스컷팅컨선
	}

}
