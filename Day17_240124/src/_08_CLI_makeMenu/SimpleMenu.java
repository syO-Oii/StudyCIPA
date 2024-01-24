package _08_CLI_makeMenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


// dept 테이블의 자료를 활용하여 CRUD를 구현하세요


public class SimpleMenu {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/baseballstats";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "mysql";

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			Scanner sc = new Scanner(System.in);
			boolean exit = false;
			while (!exit) {
				System.out.println("1. 데이터 보기");
				System.out.println("2. 데이터 삽입");
				System.out.println("3. 종료");
				System.out.print("선택하세요: ");

				int choice = sc.nextInt();
				
				switch (choice) {
				case 1:
					viewData(connection);
					break;
				case 2:
					insertData(connection);		// update
					break;
				case 3:
					exit = true;
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

	private static void viewData(Connection connection) throws SQLException {
		String sql = "select * from dept";
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getInt("deptno") + " \t");
			System.out.print(rs.getString("dname") + " \t");
			System.out.println(rs.getString("loc"));
			
		}
	}

	private static void insertData(Connection connection) throws SQLException {
		Statement stmt = connection.createStatement();
		// SQL 명령어를 String으로 저장 후
		String sql = "insert into dept values(20, '길동홍', '서울')";
		
		// stmt로 명령 실행
		int result = stmt.executeUpdate(sql);
		if(result == 1) {
			System.out.println("입력 성공!");
		}		
	}
}
