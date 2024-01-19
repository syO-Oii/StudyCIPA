package day_09_Test01_makeBank_UseClass.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuFunction {
	Scanner sc;
	private List<Member> members;
	Member loggedInMember;
	BankingFunction bf;
	private boolean checkLogin;
	
	// 생성자
	public MenuFunction() {
		this.sc = new Scanner(System.in);
		this.members = new ArrayList<>();
	}

	public boolean isCheckLogin() {
		return checkLogin;
	}
	
	void callMain(boolean checkLogin) {
		if(!checkLogin) {
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
		} else {
			System.out.println("=======================================");
			System.out.println("============= 초 기 화 면 =============");
			System.out.println("=======================================");
			System.out.println("         * 회원명 : " + loggedInMember.getMemberId());
			System.out.println("|   1. 회원가입                       |");
			System.out.println("|   2. 로그아웃                       |");
			System.out.println("|   3. 은행업무                       |");
			System.out.println("|   4. 내정보 확인                    |");
			System.out.println("|   0. 프로그램 종료                  |");
			System.out.println("=======================================");
			callSelectNum();
		}
	}
	
	void callSelectNum() {
		System.out.print("메뉴를 선택하세요 : ");
	}
	
	void callRegester() {
		clearWindow();
		System.out.println("=========================================");
		System.out.println("============== 회 원 가 입 ==============");
		System.out.println("=========================================");
		System.out.println("회원가입을 진행합니다.");
		System.out.print("사용하실 아이디를 입력하세요. : ");
		String id = sc.nextLine();
		System.out.print("사용하실 비밀번호를 입력하세요. : ");
		String password = sc.nextLine();
		registerMember(id, password);
	}
	
	// 회원가입기능
		public void registerMember(String memberId, String password) {
			Member newMember = new Member(memberId, password, 0.0);
			members.add(newMember);
			System.out.println("\n==========================");
			System.out.println("회원가입이 완료되었습니다.");
			System.out.println("==========================");
		}
	
	void callLogin() {
		clearWindow();
		System.out.println("==========================================");
		System.out.println("================ 로 그 인 ================");
		System.out.println("==========================================");
		System.out.print("아이디를 입력하세요. : ");
		String loginId = sc.nextLine();
		System.out.print("비밀번호를 입력하세요. : ");
		String loginPassword = sc.nextLine();
		
		checkLogin(loginId, loginPassword);
	}
	
	// 로그인 기능
	public void checkLogin(String memberId, String password) {
		for(Member member : members) {
			if(member.getMemberId().equals(memberId) && member.getPassword().equals(password)) {
				loggedInMember = member;
				checkLogin = true;
				System.out.println("로그인 되었습니다.");
				return;
				
			} else {
				checkLogin = false;
				System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
			}
		}
	}
	
	boolean callLogout() {
		return false;
	}
	
	void callBanking(boolean checkLogin) {
		
		if(!checkLogin) {
			System.out.println("로그인 후 이용 가능합니다.");
			clearWindow();
		} else {
			clearWindow();
			boolean checkBank = true;
			int selectMenu = 0;
			
			//은행업무 루프 돌리기
			while(checkBank) {
				bf = new BankingFunction(loggedInMember);
				bf.callBankingMenu();
				
				// selectMenu 값이 int형태가 아닐 시 오류메세지 출력 
				while(!sc.hasNextInt()) {
					System.out.println("올바른 값을 입력하세요");
					sc.next(); // 잘못된 입력 값을 읽어서 버림
					bf.callBankingSelect();
				}
				selectMenu = sc.nextInt();
				
				switch(selectMenu) {
				case 1:
					clearWindow();
					bf.depositMenu(loggedInMember);
					break;
				case 2:
					clearWindow();
					bf.withdrawMenu(loggedInMember);
					break;
				case 3:
					clearWindow();
					bf.checkBalance(loggedInMember);
					break;
				case 4:
					System.out.println("\n프로그램 종료");
					clearWindow();
					checkBank = false;
					break;
				}
			}	
		}
	}
	
	public void clearWindow() {
		int x, y;
		for(y=0;y<5;y++) {
			for(x=0;x<80;x++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
