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
 * Servlet implementation class insertData
 */
@WebServlet("/insertData")
public class insertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param Emloyee 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response, Emloyee Emloyee) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		EmloyeeDAO dao = new EmloyeeDAO();
		Emloyee em = new Emloyee();
		em.setId(Integer.parseInt(request.getParameter("id")));
		em.setUsername(request.getParameter("username").toString());
		em.setAge(Integer.parseInt(request.getParameter("age")));
		em.setSex(request.getParameter("sex").toString());
		em.setTitle(request.getParameter("title").toString());
		em.setSection(request.getParameter("section").toString());
		em.setSalary(Integer.parseInt(request.getParameter("salary")));
		boolean k  = dao.insertData(em);
		request.setAttribute("bolean", k);
        request.getRequestDispatcher("filterpage/save.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
