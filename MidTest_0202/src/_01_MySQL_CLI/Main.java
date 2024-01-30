package _01_MySQL_CLI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";	// 데이터베이스 위치 확인
	private static final String DB_USER = "root";								// 유저 정보(id)
	private static final String DB_PASSWORD = "mysql";							// 비밀번호
	
	public static void main(String[] args) {
		Screen myScreen = new Screen();
		Crud crud = new Crud();
		
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {	// 연결 시도
			Scanner sc = new Scanner(System.in);
			boolean exit = false;	// 프로그램 실행 여부 확인
			
			while (!exit) {
				myScreen.mainScreen();

				int choice = sc.nextInt();
				
				switch (choice) {
				case 1:		// 데이터 조회
					myScreen.readScreen();
					crud.readData(connection);
					break;
				case 2:		// 데이터 추가
					myScreen.createScreen();
					crud.createData(connection);
					break;
				case 3:		// 데이터 수정
					crud.updateData(connection);
					
					break;
				case 4:		// 데이터 삭제
					myScreen.deleteScreen();
					crud.deleteData(connection, crud.getEmpno());
					break;
					
				case 0:
					System.out.println("프로그램을 종료합니다.");
					exit = true;
					sc.close();
					break;
				default:
					System.out.println("유효하지 않은 선택. 다시 시도하세요.");
					break;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}







