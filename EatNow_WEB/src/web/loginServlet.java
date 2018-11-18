package web;

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
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public loginServlet() {
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
		 response.setContentType("text/html;charset=UTF-8");
		 RequestDispatcher view = null;
		 
		 String id = request.getParameter("id");
		 String password = request.getParameter("password");
		 User login_person = null;
		 HttpSession session = request.getSession();
		 PrintWriter out = response.getWriter();

		 userService accessUser;
		 accessUser=new userService();
		 
		 login_person=accessUser.getUser(id, password);

		 String redirectUrl = "login.jsp"; 

		 if(login_person!=null){
			 redirectUrl = "index_member.jsp";
			 session.setAttribute("signedUser",id);
		 }
		 else{
			 out.println("<script type=\"text/javascript\">");  
			 out.println("alert('아이디 혹은 비밀번호가 맞지 않습니다.');");  
			 out.println("history.back();");
			 out.println("</script>");
			 out.close();
		 }

		 view =request.getRequestDispatcher(redirectUrl);
		 view.forward(request,response);

	 }
	}

}
