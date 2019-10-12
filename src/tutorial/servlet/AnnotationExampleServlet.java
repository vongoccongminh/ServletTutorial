package tutorial.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = {"/coongminh", "/minh"}, initParams = {
		@WebInitParam(name = "congminh", value = "congminh@gmail.com"),
		@WebInitParam(name = "minh", value = "minh@gmail.com")
})
public class AnnotationExampleServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private String email;
	
	public AnnotationExampleServlet(){};
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.email = config.getInitParameter("congminh");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email2 = this.getServletConfig().getInitParameter("minh");
		
		ServletOutputStream out = res.getOutputStream();
		 
        out.println("<html>");
        out.println("<head><title>Init Param</title></head>");
 
        out.println("<body>");
        out.println("<h3>Servlet with Annotation configuration</h3>");
        out.println("<p>emailSupport1 = " + this.email + "</p>");
        out.println("<p>emailSupport2 = " + email2 + "</p>");
        out.println("</body>");
        out.println("<html>");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		this.doGet(req, res);
	}
}
