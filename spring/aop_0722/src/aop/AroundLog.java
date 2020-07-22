package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component("aroundLog")
public class AroundLog implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object obj =null;
		System.out.println("�� ���� ����");
		obj= invocation.proceed();
		System.out.println("�� ���� ����");
		return obj;
	}

}
