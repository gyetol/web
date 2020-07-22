package com.example.DefendencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.DefendencyInjection.vo.MemberVO;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/example/DefendencyInjection/config/AppContext.xml"); //기준이 클래스등록한 폴더
    	//FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/example/DefendencyInjection/config/AppContext.xml"); //기준이 프로젝트이다
    	//MemberVO member1 =(MemberVO)ctx.getBean("member1");
    	MemberVO member1 =(MemberVO)ctx.getBean("member1",MemberVO.class);
    	//MemberVO member2 = (MemberVO)ctx.getBean("member2");
    	MemberVO member2 = (MemberVO)ctx.getBean("member2",MemberVO.class);
    	System.out.println(member1);
    	System.out.println(member2);
    	System.out.println(member1==member2);
    }
}
