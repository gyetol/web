package annotation;

import java.lang.reflect.Field;

public class MemberCreator {
	public static Member getInstance() {
		Member member =new Member();
		Field[] fields = member.getClass().getDeclaredFields();
		
		
		for(Field field : fields) {
			InitValue annotation = field.getDeclaredAnnotation(InitValue.class);
			if(annotation != null) {
				if(field.getType()==int.class) {
					int value = annotation.value();
					
					field.setAccessible(true);
					try {
						field.set(member, value);
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
				else if(field.getType()==String.class) {
					String nameValue = annotation.nameValue();
					
					field.setAccessible(true);
					try {
						field.set(member, nameValue);
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			
			}
		}
		
		return member;
	}
}
