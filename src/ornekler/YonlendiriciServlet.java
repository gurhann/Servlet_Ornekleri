package ornekler;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/YonlendiriciServlet")
public class YonlendiriciServlet extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context = getServletContext();
		
		//RequestDispatcher'a erişiliyor.
		//Servletcontext den /BaslangicParametreleriServlet yolu için
		//requestdispatcher talep ediliyor
		RequestDispatcher yonlendirici = context.getRequestDispatcher("/BaslangicParametreleriServlet");
		yonlendirici.forward(arg0, arg1);
	}

}
