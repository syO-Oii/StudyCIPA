package _01_OutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx2 {
	public static void main(String[] args) throws IOException {

		try(InputStream is = new FileInputStream("c:/temp/Outputtest2.db");
		){
			byte[] buffer = new byte[100];
			
			while (true) {
				int data = is.read(buffer);
				if(data == -1) {
					break;
				}
				System.out.println(data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
