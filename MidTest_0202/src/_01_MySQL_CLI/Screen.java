package _01_MySQL_CLI;

import java.util.Scanner;

public class Screen {
	boolean checkSelect;
	
	public void selectMessage() {
		System.out.print(" * 메뉴를 선택하세요 : ");
	}
	
	public void selectUpdateMessage() {
		System.out.print(" * 수정 할 항목을 선택하세요 : ");
	}
	
	public void deleteMessage() {
		System.out.print(" * 삭제 할 직원의 사번을 입력하세요 : ");
	}
	
	public void insertAnyKey() {
		System.out.println("\n초기 화면으로 돌아가시려면 아무 값이나 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String check = sc.nextLine();
	}
	
	public void mainScreen() {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============= 초 기 화 면 =============");
		System.out.println("=======================================");
		System.out.println("|   1. 데이터 조회                    |");
		System.out.println("|   2. 데이터 추가                    |");
		System.out.println("|   3. 데이터 수정                    |");
		System.out.println("|   4. 데이터 삭제                    |");
		System.out.println("|   0. 프로그램 종료                  |");
		System.out.println("=======================================");
		selectMessage();
	}
	
	public void readScreen() {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============= 데이터 조회 =============");
		System.out.println("=======================================");
		System.out.println("|   1. 전체 데이터 조회               |");
		System.out.println("|   2. 사원 조회                      |");
		System.out.println("|   0. 초기 화면으로 돌아가기         |");
		System.out.println("=======================================");
		selectMessage();
	}
	
	public void searchAllScreen() {
		System.out.println("\n\n");
		System.out.println("========================================");
		System.out.println("=========== 전체 데이터 조회 ===========");
		System.out.println("========================================");
	}
	
	public void searchEmpScreen() {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============== 사원 조회 ==============");
		System.out.println("=======================================");
	}
	
	public void createScreen() {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============= 데이터 추가 =============");
		System.out.println("=======================================");
	}
	
	public void updateScreen() {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============= 데이터 수정 =============");
		System.out.println("=======================================");
		System.out.println("|   1. 직급 변경                      |");
		System.out.println("|   2. 사수 변경                      |");
		System.out.println("|   3. 연봉 변경                      |");
		System.out.println("|   4. 부서 변경                      |");
		System.out.println("|   0. 초기 화면으로 돌아가기         |");
		System.out.println("=======================================");
	}
	
	public void jobUpdateScreen() {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============== 직급 변경 ==============");
		System.out.println("=======================================");
	}
	
	public void mgrUpdateScreen() {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============== 사수 변경 ==============");
		System.out.println("=======================================");
	}
	
	public void salUpdateScreen() {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============== 연봉 변경 ==============");
		System.out.println("=======================================");
	}
	
	public void deptnoUpdateScreen() {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============== 부서 변경 ==============");
		System.out.println("=======================================");
	}
	
	public void deleteScreen() {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============= 데이터 삭제 =============");
		System.out.println("=======================================");
	}
	
}
