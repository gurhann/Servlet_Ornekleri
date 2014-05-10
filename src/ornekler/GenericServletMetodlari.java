package ornekler;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/GenericServletMetodlari")
public class GenericServletMetodlari extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init metodu çagrıldi");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy metodu çagrildi");
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("servise metodu çagrildi");
	}
}
