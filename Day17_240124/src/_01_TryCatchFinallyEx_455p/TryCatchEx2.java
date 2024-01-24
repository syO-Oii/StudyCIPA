package _01_TryCatchFinallyEx_455p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// 중복 try - catch 예제

public class TryCatchEx2 {
	public static void main(String[] args) {

		// try에 조건 2개를 넣은 상황에서 catch를 쓰는 방법
		
		// 1. catch를 각각 만든다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(null);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2. catch() 내에 '|'(or) 기호를 넣는다.		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(null);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3. Exception을 호출한다.
		// (Exception은 가장 상위의 예외 클래스)
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
