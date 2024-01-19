package MiniProject;

import java.util.Scanner;

// 1주차 미니 프로젝트
// * 구현 기능
//  - 회원 가입
//  - 로그인 기능
//  - 예금 / 출금 / 조회 / 종료 기능
//  - 회원 정보(이름, 주민번호 앞 6자리, 전화번호)
//  - 로그인 정보 (이름, 주민번호 앞 6자리)
//  - 예금/출금 정보 (잔고)




public class _01_makeBank {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean checkMain = true;
		boolean checkLogin = false;

		int selectNum;
		
		String[] userInfo = new String[4];
		
			
		// 메뉴 선택 로직
		// 1~4 외의 값 입력 시 재입력
		
		while(checkMain) {
			// 메인화면 호출
			boolean checkSelect = true;

			while(checkSelect) {
				callMain();
				
				if(sc.hasNextInt()) {
					selectNum = Integer.parseInt(sc.nextLine());
					if(selectNum <= 4 && selectNum >= 0 ) {
						checkSelect = false;		    // 선택을 정상적으로 했다면 메뉴 호출 종료 후		
						switch(selectNum) {				// switch 문을 통해 각 메뉴로 이동
						case 1:
							clearWindow();
							userInfo = callJoin(checkLogin);	    // 회원가입
							break;
						case 2:
							checkLogin = callLogin(userInfo, checkLogin);	// 로그인
							break;
						case 3:
							callBank(userInfo, checkLogin);	    // 은행업무
							break;
						case 4:
							callMyInfo(userInfo, checkLogin);	    // 내정보 확인
							break;
						case 0:
							checkMain = false;		    // 프로그램 종료 - 메인화면 루프 종료
							checkSelect = false; 	    // 프로그램 종료 - 메뉴선택 루프 종료
							break;
						}
					} else {							// 0 ~ 4 범위 외의 정수를 입력 할 경우 재실행
						System.out.println("다시 선택하세요.");	
						clearWindow();
					}
				} else {								// 정수 외의 값을 입력했을 경우 오류메세지 출력
					System.out.println("숫자를 입력 해 주세요.");
					sc.nextLine();	// 버퍼 초기화
				}		

			}
		}
		
		System.out.println("프로그램이 종료됩니다.");
	}
	
	public static void callMain() {
		System.out.println("=======================================");
		System.out.println("============= 초 기 화 면 =============");
		System.out.println("=======================================");
		System.out.println("|   1. 회원가입                       |");
		System.out.println("|   2. 로그인                         |");
		System.out.println("|   3. 은행업무                       |");
		System.out.println("|   4. 내정보 확인                    |");
		System.out.println("|   0. 프로그램 종료                  |");
		System.out.println("=======================================");
		callSelectNum();
	}
	
	public static void callSelectNum() {
		System.out.print("메뉴를 선택하세요 : ");
	}
	
	public static void clearWindow() {
		int x, y;
		for(y=0;y<15;y++) {
			for(x=0;x<80;x++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public static String[] callJoin(boolean checkLogin) {
		String[] userInfo = new String[4];
		String userName;
		String userBirth;
		String userPhoneNum;
		String check;
		boolean checkBirth = false;
		
		System.out.println("=======================================");
		System.out.println("============= 회 원 가 입 =============");
		System.out.println("=======================================");
		
		if(!checkLogin) {
			System.out.println("* 지금부터 회원가입을 진행합니다.");
			System.out.print("* 회원명 : ");
			userName = sc.nextLine();
			while(userName.isEmpty()) {
				System.out.println("회원명 칸이 비어있습니다. 다시 입력해주세요.");
				System.out.print("* 회원명 : ");
				userName = sc.nextLine();
			}
			
			System.out.print("* 생년월일(YYMMDD) : ");
			userBirth = sc.nextLine();
			
			while(!checkBirth) {
				if(userBirth.length() != 6) {
					System.out.println("생년월일을 잘못 입력했습니다. 다시 입력해주세요.");
					System.out.print("* 생년월일(YYMMDD) : ");
					userBirth = sc.nextLine();
				} else if (Integer.parseInt(userBirth.substring(2, 4)) > 12
						|| Integer.parseInt(userBirth.substring(2, 4)) < 1) {
					System.out.println("월(Month)을 잘못 입력했습니다. 다시 입력해주세요.");
					System.out.print("* 생년월일(YYMMDD) : ");
					userBirth = sc.nextLine();
				} else if (Integer.parseInt(userBirth.substring(4, 6)) > 31
						|| Integer.parseInt(userBirth.substring(4, 6)) < 1) {
					System.out.println("일(Day)을 잘못 입력했습니다. 다시 입력해주세요.");
					System.out.print("* 생년월일(YYMMDD) : ");
					userBirth = sc.nextLine();
				} else {
					checkBirth = true;
				}
			}		
			
			System.out.print("* 연락처 : ");
			userPhoneNum = sc.nextLine();
			
			System.out.println("\n\n회원가입정보 확인");										
			System.out.printf("회원명 : %s / 생년월일 : %s / 연락처 : %s\n", userName, userBirth, userPhoneNum);
			System.out.println("위 내용이 맞으면 Y, 틀리면 N을 눌러주세요.");
			check = sc.nextLine();
			
			if(check.equals("Y") || check.equals("y")) {
				userInfo[0] = userName;
				userInfo[1] = userBirth;
				userInfo[2] = userPhoneNum;
				userInfo[3] = "0";
				System.out.println("회원가입이 완료되었습니다.");
				clearWindow();
			} else if (check.equals("N") || check.equals("n")) {
				System.out.println("회원가입이 실패했습니다.");
				clearWindow();
			}
		} else {
			System.out.println("로그아웃 후 이용 바랍니다.");
		}
		
		
		
		return userInfo;
	}
	
	
	public static Boolean callLogin(String[] userInfo, boolean checkLogin) {
		String userName;
		String userBirth;
		boolean loginOK = false;
		clearWindow();
		System.out.println("=======================================");
		System.out.println("============= 로 그 인 창 =============");
		System.out.println("=======================================");
		
		if(checkLogin) {
			System.out.println("이미 로그인 되어 있습니다.");
			loginOK = true;
		} else {
			System.out.print("* 회원명 : ");
			userName = sc.nextLine();
			System.out.print("* 생년월일(YYMMDD) : ");
			userBirth = sc.nextLine();
			if(userName.equals(userInfo[0]) && userBirth.equals(userInfo[1])) {
				System.out.println("로그인 성공!!");
				loginOK = true;
			} else if(userName.equals(userInfo[0]) && !userBirth.equals(userInfo[1])) {
				System.out.println("비밀번호가 틀렸습니다.");
			} else {
				System.out.println("회원정보가 올바르지 않습니다.");
			}
		}
	
		return loginOK;	
	}
	
	public static void callBank(String[] userInfo, boolean checkLogin) {
		int balance;
		if(!checkLogin) {
			System.out.println("로그인 후 이용 가능합니다.");
			clearWindow();
		} else {
			clearWindow();
			boolean run = true;
			int selectMenu = 0;
			balance = Integer.parseInt(userInfo[3]);
			while(run) {
				System.out.println("=========================================");
				System.out.println("============== 은 행 업 무 ==============");
				System.out.println("=========================================");
				System.out.println("-----------------------------------------");
				System.out.println("| 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 |");
				System.out.println("-----------------------------------------");
				System.out.print("선택 > ");
				
				selectMenu = Integer.parseInt(sc.nextLine());
				
				
				switch(selectMenu) {
				case 1:
					System.out.println("계좌 잔액 : " + userInfo[3]);
					System.out.print("입금 금액을 입력하세요 : ");
					
					while(!sc.hasNextInt()) {
						System.out.println("올바른 값을 입력하세요");
						sc.next();	// 잘못된 입력 값을 읽어서 버림
					}
					
					balance += sc.nextInt();
					sc.nextLine();	// 개행문자 제거
					userInfo[3] = Integer.toString(balance);	
					System.out.println("입금이 완료되었습니다.");
					System.out.println("계좌 잔액 : " + userInfo[3]);
					break;
				case 2:
					System.out.print("계좌 잔액 : " + userInfo[3] + "원\n");
					break;
				case 3:
					System.out.println("잔고 : " + userInfo[3] + "원");
					break;
				case 4:
					System.out.println("\n프로그램 종료");
					clearWindow();
					run = false;
					break;
				}
			}
		
		}
		
	}
	public static void callMyInfo(String[] userInfo, boolean checkLogin) {
		boolean checkEnd = false;
		
		if(!checkLogin) {
			System.out.println("로그인 후 이용 가능합니다.");
			clearWindow();
		} else {
			while (!checkEnd) {
				int coin;
				clearWindow();
				System.out.println("=======================================");
				System.out.println("============= 내정보 확인 =============");
				System.out.println("=======================================");
				System.out.println("이름 : " + userInfo[0]);
				System.out.println("생년월일 : " + userInfo[1]);
				System.out.println("연락처 : " + userInfo[2]);

				System.out.println("첫화면으로 돌아가기 : 0을 입력하세요");
				coin = sc.nextInt();
				sc.nextLine();
				if (coin == 0) {
					checkEnd = true;
				}
			}
		}
	}

}
