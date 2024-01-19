package day_07_Test02_makeBank_UseClassArray;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static MenuFunction mf = new MenuFunction();
	public static void main(String[] args) {
		boolean checkMain = true;
		boolean checkLogin = false;
		int menuNum;
		
		while(checkMain) {
			mf.callMain(checkLogin);
			
			menuNum = sc.nextInt();
			sc.nextLine();	// 버퍼 비워주기
			
			switch(menuNum) {
			case 1:
				mf.callRegester();
				break;
			case 2:
				if(!checkLogin) {
					mf.callLogin();
					checkLogin = mf.isCheckLogin();
				} else {
					System.out.println("로그아웃 되었습니다.");
					checkLogin = mf.callLogout();
				}
				break;
			case 3:
				System.out.println("은행 업무를 확인합니다.");
				mf.callBanking(checkLogin);
				break;
			case 4:
				System.out.println("내 정보를 확인합니다.");
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				checkMain = false;
				break;
			}
			mf.clearWindow();
		}
		
		
	}	
}

