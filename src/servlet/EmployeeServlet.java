package servlet;
import DAO.EmloyeeDAO;
import DBUtils.DbUtils;

import DBUtils.DbUtils;
import bean.Emloyee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		int ids = Integer.parseInt(request.getParameter("inputEmail3"));
		String pwd = request.getParameter("inputPassword3").toString();
		Connection con = DbUtils.getConnection();
		ResultSet rs=null;
		String sql =null;
		java.sql.Statement sm = null;
		ArrayList<Emloyee> list = new ArrayList<Emloyee>();
		try{
			sql = "select * from user";
			sm = con.createStatement();
			rs = sm.executeQuery(sql);
			while(rs.next()){
				//Emloyee tempEmloyee = new Emloyee();
				
				if(rs.getInt(1)==ids&&pwd.equals(rs.getString(3))){
					if(rs.getInt(2)>1){
					request.getSession().setAttribute("inputEmail3",rs.getInt(1));
					request.getSession().setAttribute("ok",rs.getInt(2));
					request.setAttribute("id", rs.getInt(1));
					EmloyeeDAO dao = new EmloyeeDAO();
					ArrayList<Emloyee> list2  = dao.selectAllData();
					request.setAttribute("LIST2", list2);
					request.getRequestDispatcher("filterpage/show1.jsp").forward(request, response);
					}else{
					request.getSession().setAttribute("ok",rs.getInt(2));
					request.getRequestDispatcher("filterpage/select.jsp").forward(request, response);						}
				}
				
			}
		}catch(Exception e){
			e.printStackTrace();

			request.getRequestDispatcher("error.jsp").forward(request,response);
		}
		//request.getRequestDispatcher("error.jsp").forward(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
	}

}
