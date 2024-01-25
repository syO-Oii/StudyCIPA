package _09_JDBC_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _02_JdbcDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("mysql 드라이버 로딩!");
		
		String url = "jdbc:mysql://localhost:3306/baseballstats";
		String id = "root";		// 로그인 계정
		String pass = "mysql";  // 비밀번호
		Connection conn = DriverManager.getConnection(url, id, pass);	// DB에 연결 후 Connection 객체 반환
		System.out.println("mysql 접속 성공");
		
		Statement stmt = conn.createStatement();
		// SQL 명령어를 String으로 저장
		String sql = "delete from emp where empno = 7777";
		
		// stmt로 명령 실행
		int result = stmt.executeUpdate(sql);	// executeUpdate : 자료 업로드, 성공한 행 값을 리턴함
		if(result >= 1) {
			System.out.println("삭제 성공!" + result);
		} else {
			System.out.println("삭제 실패!" + result);
		}
	}
}
