package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {
//	public static void main(String[] args) {
//		Member member =new Member("��û��",16);
//		Class<?> cls = member.getClass();
//		
//		Method[] methods = cls.getDeclaredMethods();
//		for(Method method: methods) {
//			DefaultMethod annotation = method.getAnnotation(DefaultMethod.class); //�� �޼��忡 ������̼��� �� �پ������� null�� ��ȯ�Ѵ�.
//			if(annotation != null) {
//				try {
//					method.invoke(member);
//				} catch (IllegalAccessException e) {
//					e.printStackTrace();
//				} catch (IllegalArgumentException e) {
//					e.printStackTrace();
//				} catch (InvocationTargetException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		
//	}
	
	public static void main(String[] args) {
		Member member = MemberCreator.getInstance();
		//member.setName("ȫ�浿");
		member.print();
	}

}
