package ornekler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/AsenkronServlet")
public class AsenkronServlet extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		
		res.setCharacterEncoding("utf-8");
		PrintWriter out = res.getWriter();
		out.println("Burası işlemden önce yazıldı");
		AsyncContext ctx = req.startAsync();
		Islem islem = new Islem();
		islem.context = ctx;
		ctx.start(islem);
		
	}

}
