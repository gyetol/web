package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Program {
	public static void main(String[] args) {
		BookService bookService  = (BookService)Proxy.newProxyInstance(DefaultBookService.class.getClassLoader(),
				new Class[] {BookService.class},
				new InvocationHandler() {
					BookService bookService = new DefaultBookService("스프링",25000);
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("전 처리 작업을 수행");
						Object obj = method.invoke(bookService, args);
						System.out.println("후 처리 작업을 수행");
						return obj;
					}
			
		});
		bookService.print();
		bookService.newPrint();
	}
}
