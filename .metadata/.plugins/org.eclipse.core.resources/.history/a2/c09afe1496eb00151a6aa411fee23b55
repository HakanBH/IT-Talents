package mobile.servlets;
import mobile.jdbc.*; 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mobile.model.User;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Registration() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String email = request.getParameter("email");
		String region = request.getParameter("region");
		String password = request.getParameter("password");
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");

		User newUser = new User(email,password,firstName,lastName,region);
		UserDAO userDao = new UserDAO();

		PrintWriter out = response.getWriter();
		
		try {
			userDao.register(newUser);
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Регистрацията ви беше успешна.');");  
			out.println("</script>");
		} catch (Exception e) {
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Вече съществува потребител с този Е-мейл.');");  
			out.println("</script>");
		}
	}
}
