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

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
    public Login() {
    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    	ServletOutputStream out = res.getOutputStream();
    	HttpSession session = req.getSession();
    	
    	UserInfo userInfor = new UserInfo("Tom", 9, "VN");
    	session.setAttribute(Constant.SESSION_USER_KEY, userInfor);
    	
    	out.println("<html>");
        out.println("<head><title>Session example</title></head>");
 
        out.println("<body>");
        out.println("<h3>You are logined!, info stored in session</h3>");
 
        out.println("<a href='userInfo'>View User Info</a>");
        out.println("</body>");
        out.println("<html>");
    }
    
}
