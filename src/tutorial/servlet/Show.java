package tutorial.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tutorial.constants.Constant;

@WebServlet("/show")
public class Show extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String value = (String) req.getAttribute(Constant.ATTRIBUTE_USER_NAME_KEY);
		ServletOutputStream out = res.getOutputStream();
		out.println("<h1>ShowMeServlet</h1>");
		out.println(value);
	}
	
	@Override 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		this.doGet(req, res);
	}
}
