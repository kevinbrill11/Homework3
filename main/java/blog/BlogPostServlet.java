package blog;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BlogPostServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException {
		      
		    response.setContentType("text/plain");
		    response.setCharacterEncoding("UTF-8");

		    response.getWriter().print("Hello App Engine!\r\n");
	}
}

