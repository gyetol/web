package keyholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import keyholder.exception.PartException;
import keyholder.exception.PartInputException;
import keyholder.service.PartProductInsert;

public class App {
	
	public static void func() throws PartException {
		throw new PartInputException();
	}
	public static void main(String[] args) throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("AppContext.xml");
		
		PartProductInsert service =ctx.getBean("partProductInsert",PartProductInsert.class);
		service.execute("∞°±∏","¿Â∑’",960000);
	}

}
