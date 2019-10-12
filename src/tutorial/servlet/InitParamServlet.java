package tutorial.servlet;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class InitParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
    private String emailSupport1;
 
    public InitParamServlet() {
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	
    	this.emailSupport1 = config.getInitParameter("emailSupport1");
    	
    }
    
    @Override 
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	String email2 = this.getServletConfig().getInitParameter("email");
    	ServletOutputStream out = res.getOutputStream();
    	
    	out.println("<html>");
        out.println("<head><title>Init Param</title></head>");
 
        out.println("<body>");
        out.println("<h3>Init Param</h3>");
        out.println("<p>emailSupport1 = " + this.emailSupport1 + "</p>");
        out.println("<p>emailSupport2 = " + email2 + "</p>");
        out.println("</body>");
        out.println("<html>");
    }
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
    	this.doGet(req, res);
    }
}
