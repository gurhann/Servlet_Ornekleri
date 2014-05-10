package ornekler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/KaynakOkuyucuServlet")
public class KaynakOkuyucuServlet extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public KaynakOkuyucuServlet() {
		// TODO Auto-generated constructor stub
		super();
	}
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context = getServletContext();
		InputStream is = context.getResourceAsStream("/META-INF/test.txt");
		if(is != null){
			InputStreamReader isreader = new InputStreamReader(is);
			BufferedReader reader = new BufferedReader(isreader);
			
			res.setCharacterEncoding("utf-8");
			PrintWriter out = res.getWriter();
			out.println("<html><head></head><html>");
			String satir="";
			while((satir = reader.readLine()) != null){
				out.write(satir + "</br>");
			}
			out.write("</body></html>");
			out.close();
			
		}
	}

}
