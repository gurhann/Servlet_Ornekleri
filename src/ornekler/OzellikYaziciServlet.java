package ornekler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/OzellikYaziciServlet")
public class OzellikYaziciServlet extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OzellikYaziciServlet() {
		// TODO Auto-generated constructor stub
		super();
	}
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context = getServletContext();
		context.setAttribute("tarih", new Date(0).toString());
		res.setCharacterEncoding("utf-8");
		PrintWriter out = res.getWriter();
		out.println("<html><head></head><body>");
		out.println("atama tamamlandı");
		out.println("</body></body>");
		out.close();
	}
	
}
