package ornekler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;

public class Islem implements Runnable{
	public AsyncContext context;
	@Override
	public void run() {
		// Thread içerisinde uzun işlem başlatılıyor
		String cevap = uzunIslem();
		PrintWriter writer;
		try{
			//cevaba metinsel cıktı yazmak üzere bir printwriter nesnesi olusturulıuyor
			writer = context.getResponse().getWriter();
			writer.println(cevap);
			
		}catch(IOException e){
			e.printStackTrace();
			context.complete();
		}
	}
	public String uzunIslem(){
		try{
			//10 saniye bekletiliyor
			Thread.sleep(10000);
		}catch(Exception e){}
		return "uzun islemden cevap alindi";
	}

}
