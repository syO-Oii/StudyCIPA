package MasterQuiz;

import java.util.Scanner;

public class _06_UseScanner_099p {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름 : ");
		sc.nextLine();
		System.out.print("2. 주민번호 앞 6자리 : ");
		sc.nextLine();
		System.out.print("3. 전화번호 : ");
		sc.nextLine();
		sc.close();
	}

}
