package ornekler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/BaslangicParametreleriServlet"},
		initParams = {@WebInitParam(name="mesaj", value="Hoşgeldiniz",
		description="bu bir açıklamadır")})
public class BaslangicParametreleri extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//türkçe karakterler için karakter kodlaması
		res.setCharacterEncoding("utf-8");
		//mesaj isimli başlangıç parametresi alınıyor
		String mesaj = (String)getInitParameter("mesaj");
		try{
		//cevaba çıktı oluşturmak için printwriter nesnesi kullanılıyor
			PrintWriter out = res.getWriter();
			out.println(mesaj);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
