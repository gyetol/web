package aop;


public class LectopiaTest implements Test{
	private int kor;
	private int eng;
	private int math;
	
	public LectopiaTest() {}
	
	public LectopiaTest(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public int tot() {
		System.out.println("call tot()");
		return kor+eng+math;
	}
	
	@Override
	public double avg() {
		System.out.println("call avg()");
		return (tot()/3.0);
	}

	@Override
	public void print() {
		Object obj = null;
		System.out.println(obj.toString());
		System.out.println("---------------");
		System.out.println("±¹¾î: "+kor);
		System.out.println("¿µ¾î: "+eng);
		System.out.println("¼öÇÐ: "+math);
		System.out.println("ÃÑÁ¡: "+tot());
		System.out.println("Æò±Õ: "+String.format("%.2f", avg()));
		System.out.println("---------------");
	}
}
