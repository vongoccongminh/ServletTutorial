package tutorial.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/other/redirect")
public class Redirect extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String param = req.getParameter("war");
		
		if("true".equals(param)) {
			System.out.println("Redirect to ...");
			String contextPath = req.getContextPath();
			
			res.sendRedirect(contextPath + "/show");
			return;
		}
		
		ServletOutputStream out = res.getOutputStream();
        out.println("<h3>Text of RedirectDemoServlet</h3>");
        out.println("- servletPath=" + req.getServletPath());
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		this.doGet(req, res);
	}
}
