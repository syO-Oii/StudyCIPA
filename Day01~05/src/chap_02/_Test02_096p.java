package chap_02;

import java.util.Scanner;

public class _Test02_096p {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = sc.nextLine();
			System.out.println("입력된 문자열 \"" + inputData + "\"");
			if(inputData.equals("q")) {
				break;
			}
		}
		System.out.println("종료되었습니다.");
		sc.close();
	}

}
