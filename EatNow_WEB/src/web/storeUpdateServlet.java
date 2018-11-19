package web;
import eatnow.my.storeUser;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class storeUpdateServlet
 */
@WebServlet("/storeUpdateServlet")
public class storeUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public storeUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=utf-8");
		 request.setCharacterEncoding("utf-8");
		 RequestDispatcher view = null;
		 PrintWriter out = response.getWriter();
		 
		
		 String store_name = request.getParameter("name");
		 int res_S_for_2 = Integer.parseInt(request.getParameter("s_for_2"));
		 int res_S_for_4 = Integer.parseInt(request.getParameter("s_for_4"));
		 int res_S_for_6 = Integer.parseInt(request.getParameter("s_for_6"));
		 int res_S_for_G = Integer.parseInt(request.getParameter("s_for_G"));
		
		 updateStoreData(res_S_for_2,res_S_for_4, res_S_for_6, res_S_for_G);
		
		
		
	}

}
