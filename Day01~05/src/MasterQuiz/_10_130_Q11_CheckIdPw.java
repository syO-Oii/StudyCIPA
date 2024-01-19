package MasterQuiz;

import java.util.Scanner;

public class _10_130_Q11_CheckIdPw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String name = sc.nextLine();
		System.out.print("비밀번호 : ");
		int strPassword = Integer.parseInt(sc.nextLine());
		
		if(name.equals("java")) {
			if(strPassword == 12345) {
				System.out.println("로그인 성공!");
			} else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패 : 아이디가 존재하지 않음");
		}
		sc.close();
	}
}
