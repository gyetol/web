package aop;

import org.springframework.aop.ThrowsAdvice;

public class AfterThrowingLog implements ThrowsAdvice {
	public void afterThrowing(NullPointerException e) throws Throwable{
		System.out.println("널 참조가 발생하였습니다.");
	}
	public void afterThrowing(NumberFormatException e) throws Throwable{
		System.out.println("형식변환 오류가 발생하였습니다.");
	}
}
