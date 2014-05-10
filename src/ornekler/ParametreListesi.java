package ornekler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ParametreListesi extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ParametreListesi(){
		super();
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setCharacterEncoding("utf-8");
		
		//Başlangıc parametreleri alınıp enumeration nesnesine aktarılıyor
		Enumeration<String> e = getInitParameterNames();
		try{
			PrintWriter out = res.getWriter();
			out.print("<html><head></head><body>");
			while(e.hasMoreElements()){
				out.println(e.nextElement() + "</br>");
			}
			out.println("</body></html>");
		}catch(IOException exc){
			
		}
	}
}
