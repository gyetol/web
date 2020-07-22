package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {

	public static void call(String name) {
		//메서드명이 name과 동일한 메서드를 호출
	}
	
	/*
	 * public static void main(String[] args) { //Member member = new
	 * Member("홍길동",20); Member member =null; Class<?> cls = member.getClass();
	 * //런타임에 클래스 정보 취득 //Class<?> cls2 = Member.class; //컴파일타임에 클래스 정보 취득 Field[]
	 * fields = cls.getDeclaredFields(); for(Field field: fields) {
	 * System.out.println(field.getName()); }
	 * 
	 * Method[] methods = cls.getDeclaredMethods(); for(Method method : methods) {
	 * System.out.println(method.getName()); }
	 * 
	 * Constructor[] constructors = cls.getDeclaredConstructors(); for(Constructor
	 * constructor :constructors) { System.out.println(constructor.getName()); }
	 * 
	 * try { Constructor<?> constructor = cls.getDeclaredConstructor(String.class ,
	 * int.class); //인수를 안쓰면 디폴트 생성자찾을 수 있다 member =
	 * (Member)constructor.newInstance("홍길동",20);
	 * 
	 * } catch (NoSuchMethodException | SecurityException e) { //생성자를 못찾으면 노서치,
	 * 프라이빗생성자면 시큐리티가 뜸 // TODO Auto-generated catch block e.printStackTrace(); }
	 * catch (InstantiationException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (IllegalAccessException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } catch
	 * (IllegalArgumentException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (InvocationTargetException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */
	public static void main(String[] args) {
		Member member = new Member("홍길동",20);
		Class<?> cls = member.getClass();
		
		try {
			//Method method = cls.getDeclaredMethod("setName", String.class);
			Method method = cls.getDeclaredMethod("print");
			try {
				//method.invoke(member,"심청이");//member.setName("심청이");
				method.invoke(member);
			} catch (IllegalAccessException e) { //프라이빗메서드일때
				e.printStackTrace();
			} catch (IllegalArgumentException e) { 
				e.printStackTrace();
			} catch (InvocationTargetException e) { //잘못된 객체를 줬을때
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
