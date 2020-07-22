package aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("core concern ������: "+returnValue);
		System.out.println("ȣ�� �޼����: "+ method.getName());
		System.out.println("ȣ�� �μ��� ��: "+args.length);
		System.out.println("Core concernŸ��: "+target.getClass().getName());
	}

}
