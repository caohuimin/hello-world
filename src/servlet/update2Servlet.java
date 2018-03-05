package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EmloyeeDAO;
import bean.Emloyee;

/**
 * Servlet implementation class update2Servlet
 */
@WebServlet("/update2Servlet")
public class update2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Emloyee em = new Emloyee();
		ArrayList<Emloyee> list = new ArrayList<Emloyee>();
		em.setId(Integer.parseInt(request.getParameter("mess6")));
		em.setUsername(request.getParameter("mess1"));
		em.setAge(Integer.parseInt(request.getParameter("mess5")));
		em.setSex(request.getParameter("mess2"));
		em.setTitle(request.getParameter("mess4"));
		em.setSection(request.getParameter("mess3"));
		em.setSalary(Integer.parseInt(request.getParameter("mess7")));
		EmloyeeDAO dao = new EmloyeeDAO();
		dao.updateData(em);
		list = dao.selectDataById(em.getId());
		request.setAttribute("LIST2", list);
		request.getRequestDispatcher("filterpage/show1.jsp").forward(request, response);
		//boolean k  = dao.updateData(em);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
