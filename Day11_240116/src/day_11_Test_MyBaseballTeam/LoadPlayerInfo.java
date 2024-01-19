package day_11_Test_MyBaseballTeam;

import java.util.Scanner;

public class LoadPlayerInfo {
	MyFunction myFunction = new MyFunction();
	Scanner sc = new Scanner(System.in);
	
	public LoadPlayerInfo() {
		
		while(myFunction.getCheckMenu()) {
			myFunction.dispInquireMenu();
			myFunction.select();
			String selectMenu = sc.nextLine(); 
			selectInfoMenu(selectMenu);
			
		}		
	}
	
	public LoadPlayerInfo(PlayerInfo player) {
		System.out.println("1. 선수 이름 : " + player.name);
		System.out.println("2. 등번호 : " + player.backNum);
		System.out.println("3. 포지션 : " + player.position);
		System.out.println("4. 연봉 : " + player.salary);
	}
	
	public void selectInfoMenu(String select) {
		switch(select) {
		case "1":
			myFunction.dispPlayerInfo();
			break;
		case "2":
			myFunction.dispChangePlayerInfo();
			break;
		case "3":
			myFunction.dispSalaryNegotiation();
			break;
		case "4":
			// 이전 메뉴로 돌아가는 값 넣기
			break;
			default:
				System.out.println("다시 입력 해주세요.");
		}
	}
	
	
	
}
