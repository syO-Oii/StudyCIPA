package _01_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx2 {
	public static void main(String[] args) throws IOException {

		try(OutputStream os = new FileOutputStream("c:/temp/OutputTest2.db");
				){
			byte[] array = {30, 60, 90};
			
			os.write(array);
			
			os.flush();
			os.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
