package aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("core concern 수행결과: "+returnValue);
		System.out.println("호출 메서드명: "+ method.getName());
		System.out.println("호출 인수의 수: "+args.length);
		System.out.println("Core concern타입: "+target.getClass().getName());
	}

}
