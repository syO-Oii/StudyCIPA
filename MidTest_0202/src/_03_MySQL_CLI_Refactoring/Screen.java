package _03_MySQL_CLI_Refactoring;

import java.sql.SQLException;
import java.util.Scanner;

public class Screen {
	Crud crud;
		int empno = 0;
	String job = null;
	int mgr = 0;
	double sal = 0;
	int deptno = 0;
	
	boolean checkSelect = false;
	Scanner sc = new Scanner(System.in);
	
	Screen(Crud crud){
		this.crud = crud;
	}
		
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
		System.out.println("\n이전 화면으로 돌아가시려면 아무 값이나 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String anyKey = sc.nextLine();
	}
	
	public void mainScreen() {
		System.out.println("\n\n\n");
		System.out.println("=======================================");
		System.out.println("============= 초 기 화 면 =============");
		System.out.println("=======================================");
		System.out.println("|   1. 데이터 조회                    |");
		System.out.println("|   2. 데이터 추가                    |");
		System.out.println("|   3. 데이터 수정                    |");
		System.out.println("|   4. 데이터 삭제                    |");
		System.out.println("|   0. 프로그램 종료                  |");
		System.out.println("=======================================");
	}
	
	public void readScreen() throws SQLException {
		boolean exit = false;
		checkSelect = false;	// 값 초기화
		while(!exit) {
			while(!checkSelect) {
				System.out.println("\n\n");
				System.out.println("=======================================");
				System.out.println("============= 데이터 조회 =============");
				System.out.println("=======================================");
				System.out.println("|   1. 전체 데이터 조회               |");
				System.out.println("|   2. 사원 조회                      |");
				System.out.println("|   0. 초기 화면으로 돌아가기         |");
				System.out.println("=======================================");
				selectMessage();
				int selectMenu = Integer.parseInt(sc.nextLine());
				
				switch(selectMenu) {
					case 1:		// 전체 데이터 조회 선택
						readAllScreen();
						break;
					case 2:		// 사원 조회 선택
						readEmpScreen();
						break;
					case 0:		// 초기 화면으로 돌아가기 선택
						System.out.println("초기 화면으로 돌아갑니다.");
						checkSelect = true;
						exit = true;
						break;
					default:
						System.out.println("유효하지 않은 선택. 다시 시도하세요.");
						break;
				}
			}		
		}		
	}
	
	public void readAllScreen() throws SQLException {
		System.out.println("\n\n");
		System.out.println("========================================");
		System.out.println("=========== 전체 데이터 조회 ===========");
		System.out.println("========================================");
		crud.readAll();
		insertAnyKey();
	}
	
	public void readEmpScreen() throws SQLException {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============== 사원 조회 ==============");
		System.out.println("=======================================");
		System.out.print("조회할 사원 번호를 입력하세요 : ");
		int empno = Integer.parseInt(sc.nextLine());
		crud.readEmpno(empno);
		insertAnyKey();
	}
	
	public void createScreen() throws SQLException {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============= 데이터 추가 =============");
		System.out.println("=======================================");
		crud.createData();
		insertAnyKey();
	}
	
	public void updateScreen() throws SQLException {
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
		
		boolean check = false;
		
		while(!check) {
			selectMessage();
			int selectMenu = Integer.parseInt(sc.nextLine());
					
			switch(selectMenu) {
				case 1:
					System.out.print("수정 할 사원의 사원번호를 입력하세요 : ");
					empno = Integer.parseInt(sc.nextLine());
					System.out.print("새로운 직급을 입력하세요 : ");
					job = sc.nextLine();
					crud.changeJob(empno, job);
					check = true;
					insertAnyKey();
					break;
				case 2:
					System.out.print("수정 할 사원의 사원번호를 입력하세요 : ");
					empno = Integer.parseInt(sc.nextLine());
					System.out.print("새로운 사수 번호를 입력하세요 : ");
					mgr = Integer.parseInt(sc.nextLine());
					crud.changeMgr(empno, mgr);
					check = true;
					insertAnyKey();
					break;
				case 3:
					System.out.print("수정 할 사원의 사원번호를 입력하세요 : ");
					empno = Integer.parseInt(sc.nextLine());
					System.out.print("연봉 정보를 입력하세요 : ");
					sal = Double.parseDouble(sc.nextLine());
					crud.changeSal(empno, sal);
					check = true;
					insertAnyKey();
					break;
				case 4:
					System.out.print("수정 할 사원의 사원번호를 입력하세요 : ");
					empno = Integer.parseInt(sc.nextLine());
					System.out.print("바꿀 부서 번호를 입력하세요 : ");
					deptno = Integer.parseInt(sc.nextLine());
					crud.changeDeptno(empno, deptno);
					check = true;
					insertAnyKey();
					break;
				case 0:
					check = true;
					break;
				default:
					System.out.println("다시 선택하세요.");
					insertAnyKey();
			}
		}
	}
	
	public void jobUpdateScreen() throws SQLException {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============== 직급 변경 ==============");
		System.out.println("=======================================");
		
		System.out.print("수정 할 사원의 사원번호를 입력하세요 : ");
		empno = Integer.parseInt(sc.nextLine());
		System.out.print("바꾸실 직급 명을 입력하세요 : ");
		job = sc.nextLine();
		crud.changeJob(empno, job);
	}
	
	public void mgrUpdateScreen() throws SQLException {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============== 사수 변경 ==============");
		System.out.println("=======================================");
		
		System.out.print("수정 할 사원의 사원번호를 입력하세요 : ");
		empno = Integer.parseInt(sc.nextLine());
		System.out.print("새로운 사수의 사원 번호를 입력하세요 : ");
		mgr = Integer.parseInt(sc.nextLine());
		crud.changeMgr(empno, mgr);
	}
	
	public void salUpdateScreen() throws SQLException {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============== 연봉 변경 ==============");
		System.out.println("=======================================");
		
		System.out.print("수정 할 사원의 사원번호를 입력하세요 : ");
		empno = Integer.parseInt(sc.nextLine());
		System.out.print("연봉을 입력하세요 : ");
		sal = Double.parseDouble(sc.nextLine());
		crud.changeSal(empno, sal);
	}
	
	public void deptnoUpdateScreen() throws SQLException {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============== 부서 변경 ==============");
		System.out.println("=======================================");
		
		System.out.print("수정 할 사원의 사원번호를 입력하세요 : ");
		empno = Integer.parseInt(sc.nextLine());
		System.out.print("부서 번호를 입력하세요 : ");
		deptno = Integer.parseInt(sc.nextLine());
		crud.changeDeptno(empno, deptno);
	}
	
	public void deleteScreen() throws SQLException {
		System.out.println("\n\n");
		System.out.println("=======================================");
		System.out.println("============= 데이터 삭제 =============");
		System.out.println("=======================================");
		
		System.out.print("사원의 사원번호를 입력하세요 : ");
		empno = Integer.parseInt(sc.nextLine());
		crud.deleteData(empno);
	}
	
}
