package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {
//	public static void main(String[] args) {
//		Member member =new Member("심청이",16);
//		Class<?> cls = member.getClass();
//		
//		Method[] methods = cls.getDeclaredMethods();
//		for(Method method: methods) {
//			DefaultMethod annotation = method.getAnnotation(DefaultMethod.class); //이 메서드에 어노테이션이 안 붙어있으며 null을 반환한다.
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
		//member.setName("홍길동");
		member.print();
	}

}
