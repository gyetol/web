package filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.*;

@WebFilter(
		filterName="firstFilter",
		urlPatterns= {"/test","/second"},
		initParams= { @WebInitParam(name="encoding",value="utf-8"),
		@WebInitParam(name="contentType",value="text/html; charset=utf-8")
		})
public class FirstFilter implements Filter {
	
	private String encoding=null;
	private String contentType=null;
	
	public void init(FilterConfig config) throws ServletException {
		encoding=config.getInitParameter("encoding");
		contentType=config.getInitParameter("contentType");
	}
	
	public void doFilter(ServletRequest request,ServletResponse response,
			FilterChain chain) throws ServletException,IOException{
		request.setCharacterEncoding(encoding);
		response.setContentType(contentType);
		//request.setAttribute("hello","good morning");

		System.out.println("FirstFilter에서 다음 필터 호출 전");
		chain.doFilter(request, response);
		System.out.println("FirstFilter에서 다음 필터 호출 후");
	}
	
	public void destroy() {
		System.out.println("FirstFilter destroy()호출");
	}
}
