package day_06_Test01_makeBank_UseClass;

import java.util.Scanner;

public class BankMain {
	static Scanner sc = new Scanner(System.in);
	static BankingService bs = new BankingService();
	public static void main(String[] args) {
		boolean checkMain = true;
		boolean checkLogin = false;
		int menuNum;
		
		while(checkMain) {
			bs.callMain();
			
			menuNum = sc.nextInt();
			sc.nextLine();	// 버퍼 비워주기
			
			switch(menuNum) {
			case 1:
				bs.callRegester();
				break;
			case 2:
				bs.callLogin();
				checkLogin = bs.isCheckLogin();
				
				break;
			case 3:
				System.out.println("은행 업무를 확인합니다.");
				bs.callBanking(checkLogin);
				break;
			case 4:
				System.out.println("내 정보를 확인합니다.");
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				checkMain = false;
				break;
			}
			bs.clearWindow();
		}
		
		
	}	
}

