package servlet;

import java.io.IOException;
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
 * Servlet Filter implementation class majorManagerfilter
 */
@WebFilter("/filterpage/*")
public class majorManagerfilter implements Filter {

    /**
     * Default constructor. 
     */
    public majorManagerfilter() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		 HttpServletRequest req = (HttpServletRequest) request;
		   HttpServletResponse res = (HttpServletResponse)response;
		   String currentURL = req.getRequestURI();//ȡ�ø�Ŀ¼����Ӧ�ľ���·��
	       //��ȡ����ǰ�ļ������ڱȽ�
	       String targetURL = currentURL.substring(currentURL.indexOf("/", 1),currentURL.length());
	       
	       HttpSession session = req.getSession();
	       if(session == null || session.getAttribute("inputEmail3") == null) {
	    	   System.out.println(targetURL);
				if ("/login.jsp".equals(targetURL)||req.getSession().getAttribute("ok").equals("1")) {
					System.out.println( req.getSession().getAttribute("ok"));
					request.getRequestDispatcher("../login.jsp").forward(request, response);
				} else {
					chain.doFilter(request, response);
				}
			}else {
				chain.doFilter(request, response);
			}
		// pass the request along the filter chain
		//chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
