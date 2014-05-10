package ornekler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/OzellikOkuyucuServlet")
public class OzellikOkuyucuServlet extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public OzellikOkuyucuServlet() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context = getServletContext();
		String tarih = (String) context.getAttribute("tarih");
		PrintWriter out = res.getWriter();
		out.println("<html><head></head><body>");
		out.println("tarih: " + tarih);
		out.println("</body></head>");
		out.close();
	}

}
