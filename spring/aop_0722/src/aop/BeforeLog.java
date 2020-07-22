package aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLog implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("호출메서드: "+method.getName());
		System.out.println("호출대상:"+target.getClass().getName());
		System.out.println("호출시 인수의 수 :"+args.length);
		for(Object obj : args) {
			System.out.println(obj+" ");
		}
	}

}
