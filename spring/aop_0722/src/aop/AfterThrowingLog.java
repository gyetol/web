package aop;

import org.springframework.aop.ThrowsAdvice;

public class AfterThrowingLog implements ThrowsAdvice {
	public void afterThrowing(NullPointerException e) throws Throwable{
		System.out.println("�� ������ �߻��Ͽ����ϴ�.");
	}
	public void afterThrowing(NumberFormatException e) throws Throwable{
		System.out.println("���ĺ�ȯ ������ �߻��Ͽ����ϴ�.");
	}
}
