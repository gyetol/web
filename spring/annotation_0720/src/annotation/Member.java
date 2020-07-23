package annotation;


public class Member {
	@InitValue(nameValue="강감찬")
	private String name;
	
	@InitValue(value=100)
	private int age;
	
	public Member() {}

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@DefaultMethod
	public void print() {
		System.out.println("이름: "+name + ", 연령: "+age);
	}
	
	
}
