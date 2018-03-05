package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EmloyeeDAO;
import bean.Emloyee;

/**
 * Servlet implementation class updateServlet
 */
@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		EmloyeeDAO dao = new EmloyeeDAO();
		int das =Integer.parseInt(request.getParameter("selectid"));
		EmloyeeDAO emloyeeDAO = new EmloyeeDAO();
		
		
		Emloyee em = emloyeeDAO.selectDataById(das).get(0);
		/*em.setId(Integer.parseInt(request.getParameter("mess6")));
		em.setUsername(request.getParameter("mess1").toString());
		em.setAge(Integer.parseInt(request.getParameter("mess5")));
		em.setSex(request.getParameter("mess2").toString());
		em.setTitle(request.getParameter("mess4").toString());
		em.setSection(request.getParameter("mess3").toString());
		em.setSalary(Integer.parseInt(request.getParameter("mess7")));*/
		//boolean k  = dao.updateData(em);
		request.setAttribute("em", em);
        request.getRequestDispatcher("filterpage/update.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
