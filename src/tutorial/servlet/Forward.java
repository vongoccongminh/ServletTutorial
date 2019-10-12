package tutorial.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tutorial.constants.Constant;

@WebServlet("/other/forward")
public class Forward extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String param = req.getParameter("war");
		if("true".equals(param)) {
			System.out.println("Forward to ShowMeServlet");
			req.setAttribute(Constant.ATTRIBUTE_USER_NAME_KEY, "Hi, I'm Tom come from Walt Disney !");
			
			RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/show");
			dispatcher.forward(req, res);
			
			return;
		}
		
		ServletOutputStream out = res.getOutputStream();
		out.println("<h3>Text of ForwardDemoServlet</h3>");
        out.println("- servletPath=" + req.getServletPath());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		this.doGet(req, res);
	}
}
