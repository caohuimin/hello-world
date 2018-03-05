package servlet;

import java.io.IOException;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AllFilter
 */
@WebFilter("*.jsp")
public class AllFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public AllFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String currentURL = req.getRequestURI();// ȡ�ø�Ŀ¼����Ӧ�ľ���·��
		// ��ȡ����ǰ�ļ������ڱȽ�
		String targetURL = currentURL.substring(currentURL.indexOf("/", 1), currentURL.length());

		HttpSession session = req.getSession();
		System.out.println(targetURL);
		//chain.doFilter(request, response);
         System.out.println(session);
		// �жϵ�ǰҳ�Ƿ����ض����Ժ�ĵ�¼ҳ�棬����ǾͲ���session���жϣ���ֹ������ѭ��
		if(session == null || session.getAttribute("inputEmail3") == null) {
			if (!"/login.jsp".equals(targetURL)) {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} else {
				chain.doFilter(request, response);
			}
		}else {
			chain.doFilter(request, response);
		}
		//chain.doFilter(request, response);
		// pass the request along the filter chain
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
