package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/test")
public class SecondFilter implements Filter {


	public void destroy() {
		System.out.println("SecondFilter destroy()ȣ��");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("SecondFilter���� ���� ���� ȣ�� ��");
		chain.doFilter(request, response);
		System.out.println("SecondFilter���� ���� ���� ȣ�� ��");
	}

	public void init(FilterConfig config) throws ServletException {
		System.out.println("SecondFilter init()ȣ��");
	}

}
