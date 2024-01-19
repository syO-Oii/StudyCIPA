package day_13_swingProject;

import java.util.ArrayList;

public class MyFunction {
	Boolean checkMenu = true;
	
	boolean getCheckMenu() {
		return checkMenu;
	}
	
	void menuOff() {
		this.checkMenu = false;
	}

	public void disp() {
		System.out.println();
		System.out.println(" * 메 인 메 뉴 * ");
		System.out.println("┌─────────┐");
		System.out.println("│ 1. 선수 명단     │");
		System.out.println("├─────────┤");
		System.out.println("│ 2. 선수 등록     │");
		System.out.println("├─────────┤");
		System.out.println("│ 3. 선수 정보 조회│");
		System.out.println("├─────────┤");
		System.out.println("│ 4. 파일 저장     │");
		System.out.println("├─────────┤");
		System.out.println("│ 5. 파일 읽기     │");
		System.out.println("└─────────┘");
	}
	public void select() {
		System.out.print("\n메뉴 선택 : ");
	}
	
	public void dispInquireMenu() {
		System.out.println();
		System.out.println("    * 선수 정보 조회 *");
		System.out.println("┌──────────┐");
		System.out.println("│ 1. 상세 정보 조회  │");
		System.out.println("├──────────┤");
		System.out.println("│ 2. 선수 정보 수정  │");
		System.out.println("├──────────┤");
		System.out.println("│ 3. 연봉 조정       │");
		System.out.println("├──────────┤");
		System.out.println("│ 4. 초기 메뉴       │");
		System.out.println("└──────────┘");
	}
	
	public void dispPlayerInfo() {
		System.out.println("   * 상세 정보 조회 *");
		System.out.println("┌──────────┐");
		System.out.println("│ 1. 등번호 조회     │");
		System.out.println("├──────────┤");
		System.out.println("│ 2. 포지션 조회     │");
		System.out.println("├──────────┤");
		System.out.println("│ 3. 연봉 조회       │");
		System.out.println("├──────────┤");
		System.out.println("│ 4. 이전 메뉴       │");
		System.out.println("└──────────┘");
	}
	
	public void dispChangePlayerInfo() {
		System.out.println("   * 선수 정보 수정 *");
		System.out.println("┌──────────┐");
		System.out.println("│ 1. 이름 변경       │");
		System.out.println("├──────────┤");
		System.out.println("│ 2. 등번호 변경     │");
		System.out.println("├──────────┤");
		System.out.println("│ 3. 포지션 변경     │");
		System.out.println("├──────────┤");
		System.out.println("│ 4. 이전 메뉴       │");
		System.out.println("└──────────┘");
	}
	
	public void dispSalaryNegotiation() {
		System.out.println("     * 연봉 협상 *");
		System.out.println("┌──────────┐");
		System.out.println("│ 1. 연봉 인상       │");
		System.out.println("├──────────┤");
		System.out.println("│ 2. 연봉 인하       │");
		System.out.println("├──────────┤");
		System.out.println("│ 3. 이전 메뉴       │");
		System.out.println("└──────────┘");
	}
	
	public void modifyPlayerInfo(ArrayList<PlayerInfo> playerList, int backNum, String newName, String newPosition, double newSalary) {
		for (PlayerInfo player : playerList) {
	        if (player.getBackNum() == backNum) {
	            // 등번호가 일치하는 선수를 찾았을 경우 수정
	            player.setPosition(newPosition);
	            player.setSalary(newSalary);
	            return; // 수정 완료 후 종료
	        }
	    }
	}



	
}
