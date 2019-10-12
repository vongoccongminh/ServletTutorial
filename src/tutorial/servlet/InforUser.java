package tutorial.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tutorial.constants.Constant;
import tutorial.constants.UserInfo;

@WebServlet("/userInfo")
public class InforUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public InforUser() {
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		ServletOutputStream out = res.getOutputStream();
		
		HttpSession session = req.getSession();
    	
		UserInfo userInfor = (UserInfo) session.getAttribute(Constant.SESSION_USER_KEY);
		
		if(userInfor == null) {
			String contextPath = req.getContextPath();
			res.sendRedirect(contextPath + "/login");
			return;
		}
		
		out.println("<html>");
        out.println("<head><title>Session example</title></head>");
 
        out.println("<body>");
 
        out.println("<h3>User Info:</h3>");
 
        out.println("<p>User Name:" + userInfor.getUserName() + "</p>");
        out.println("<p>Country:" + userInfor.getCountry() + "</p>");
        out.println("<p>Post:" + userInfor.getPost() + "</p>");
 
        out.println("</body>");
        out.println("<html>");
	}
}
