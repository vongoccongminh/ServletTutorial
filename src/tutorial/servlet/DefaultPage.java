package tutorial.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/")
public class DefaultPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public DefaultPage() {}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		ServletOutputStream out = res.getOutputStream();
		
		out.println("<html>");
	       out.println("<head><title>Page not found</title></head>");
	 
	       out.println("<body>");
	       out.println("<h3>Sorry! Page not found</h3>");
	       out.println("<h1>404</h1>");
	       out.println("Message from servlet: " + this.getClass().getName());
	       out.println("</body>");
	       out.println("<html>");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		this.doGet(req, res);
	}
}
