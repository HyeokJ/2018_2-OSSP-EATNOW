package web;
import eatnow.my.customer;
import java.io.IOException;

import java.sql.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;
import java.io.PrintWriter;

/**
 * Servlet implementation class androidServlet
 */
@WebServlet("/androidServlet")
public class androidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public androidServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 request.getRequestDispatcher("/index_member.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
		RequestDispatcher view = null;
		
		HttpSession session = request.getSession();
		
		String _name = "¹ÚÀçÇö";
		String p_num = "010-2222-2222";
		
		session.setAttribute("name",_name);
		session.setAttribute("phone_num", p_num);
		
		
		view =request.getRequestDispatcher("index_member.jsp");
		view.forward(request,response);
	}

}
