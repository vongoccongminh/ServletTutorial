package tutorial.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public HelloServlet() {
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException{
		ServletOutputStream out = res.getOutputStream();
		
		out.println("<html>");
		out.println("<head><title>Hello</title></head>");
		out.println("<body>");
		out.println("<h3>Hello World</h3>");
		out.println("This is my first Servlet");
		out.println("</body>");
		out.println("<html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       this.doGet(req, res);
   }
	
}
