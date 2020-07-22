package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {

	public static void call(String name) {
		//�޼������ name�� ������ �޼��带 ȣ��
	}
	
	/*
	 * public static void main(String[] args) { //Member member = new
	 * Member("ȫ�浿",20); Member member =null; Class<?> cls = member.getClass();
	 * //��Ÿ�ӿ� Ŭ���� ���� ��� //Class<?> cls2 = Member.class; //������Ÿ�ӿ� Ŭ���� ���� ��� Field[]
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
	 * int.class); //�μ��� �Ⱦ��� ����Ʈ ������ã�� �� �ִ� member =
	 * (Member)constructor.newInstance("ȫ�浿",20);
	 * 
	 * } catch (NoSuchMethodException | SecurityException e) { //�����ڸ� ��ã���� �뼭ġ,
	 * �����̺������ڸ� ��ť��Ƽ�� �� // TODO Auto-generated catch block e.printStackTrace(); }
	 * catch (InstantiationException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (IllegalAccessException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } catch
	 * (IllegalArgumentException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (InvocationTargetException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */
	public static void main(String[] args) {
		Member member = new Member("ȫ�浿",20);
		Class<?> cls = member.getClass();
		
		try {
			//Method method = cls.getDeclaredMethod("setName", String.class);
			Method method = cls.getDeclaredMethod("print");
			try {
				//method.invoke(member,"��û��");//member.setName("��û��");
				method.invoke(member);
			} catch (IllegalAccessException e) { //�����̺��޼����϶�
				e.printStackTrace();
			} catch (IllegalArgumentException e) { 
				e.printStackTrace();
			} catch (InvocationTargetException e) { //�߸��� ��ü�� ������
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
