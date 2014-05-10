package ornekler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ServletBilgi")
public class ServletBilgi extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String servletIsmı = getServletName();
		String servletInfo = getServletInfo();
		
		try{
			res.setCharacterEncoding("utf-8");
			PrintWriter out = res.getWriter();
			out.println("<html><head></head><body>");
			
			out.println("Servlet İsmi: " + servletIsmı + "</br>");
			out.println("Servlet Bilgi: "  + servletInfo + "</br>");
			
			out.println("</body></html>");
		}catch(IOException e){
			
		}
		
	}
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Burayı izinsiz kopyalayamazsınız";
	}
}
