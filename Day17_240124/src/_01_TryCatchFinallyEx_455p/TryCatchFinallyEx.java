package _01_TryCatchFinallyEx_455p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchFinallyEx {
	public static void main(String[] args) {
		try {									// 예외 발생이 가능한 코드 작성
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {		// catch에 예외 처리 코드 작성
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {								// 예외 여부와 상관 없이 무조건 실행
			System.out.println("무조건 실행");
		}
		
	
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			
		}
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {		// 클래스를 찾을 수 없을 때
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace(); 					// 오류를 보여주는 함수
		}
		
		try {
			Connection conn = DriverManager.getConnection(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
