package _09_JDBC_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _04_JdbcSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("mysql 드라이버 로딩!");
		
		String url = "jdbc:mysql://localhost:3306/baseballstats";
		String id = "root";		// 로그인 계정
		String pass = "mysql";  // 비밀번호
		Connection conn = DriverManager.getConnection(url, id, pass);	// DB에 연결 후 Connection 객체 반환
		System.out.println("mysql 접속 성공");
		
		Statement stmt = conn.createStatement();
		// SQL 명령어를 String으로 저장 후
		String sql = "select * from emp";
		
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getInt("empno") + " \t");
			System.out.print(rs.getString("ename") + " \t");
			System.out.println(rs.getDouble("sal"));
			
		}
	}
}
