package day_09;

import java.util.Scanner;

public class _03_SessionEx {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Session session = new Session(true, true);
		menu1(session);
	}
	
	public static void disp1() {
		System.out.println("--------------------------------------------");
		System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
		System.out.println("--------------------------------------------");
	}
	
	public static void menu1(Session session){
		while(session.isRun1()) {
			disp1();
			System.out.println("선택 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			switch(menuNum) {
			case 1:
				System.out.println("로그인 처리");
				break;
			case 2:
				System.out.println("회원 가입");
				break;
			case 3:
				System.out.println("예금/출금");
				break;
			case 4:
				System.out.println("프로그램 종료");
				break;	
			}
		}
	}
}
