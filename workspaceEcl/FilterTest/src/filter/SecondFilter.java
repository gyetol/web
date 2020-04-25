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
		System.out.println("SecondFilter destroy()호출");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("SecondFilter에서 다음 필터 호출 전");
		chain.doFilter(request, response);
		System.out.println("SecondFilter에서 다음 필터 호출 후");
	}

	public void init(FilterConfig config) throws ServletException {
		System.out.println("SecondFilter init()호출");
	}

}
