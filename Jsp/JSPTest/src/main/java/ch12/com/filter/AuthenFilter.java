package ch12.com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthenFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter01 초기화...");
	}// init

	@Override
	public void doFilter(ServletRequest requset, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("Filter01 수행...");

		String name = requset.getParameter("name");
		if (name == null || name.equals("")) {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter writer = response.getWriter();
			writer.println("입력된 name값은 NULL 입니다.");
			return;
		}
		filterChain.doFilter(requset, response);
	}// doFilter

	@Override
	public void destroy() {
		System.out.println("Filter01 해제...");
	}// destroy

}// AuthenFilter
