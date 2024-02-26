package _01_inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineEx {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.println("입력하세요 : ");
			String lineStr = br.readLine();
			if(lineStr.equals("q") || lineStr.equals("quit")) {
				break;
			}
			System.out.println("입력 한 내용 : " + lineStr);
			
		}
		System.out.println("종료합니다.");
		br.close();
	}
}
