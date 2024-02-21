package _01_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {
	public static void main(String[] args) throws IOException {

		try(OutputStream os = new FileOutputStream("c:/temp/test1.db");
				){
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
