package aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLog implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("ȣ��޼���: "+method.getName());
		System.out.println("ȣ����:"+target.getClass().getName());
		System.out.println("ȣ��� �μ��� �� :"+args.length);
		for(Object obj : args) {
			System.out.println(obj+" ");
		}
	}

}
