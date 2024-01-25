package _03_TryCatchFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


// 메인에 DB 호출 구현
public class Class1 {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String password = "mysql";
		String sql = "select * from emp";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);				// 여기(try)에서만 사용할거라 내부에서 변수 선언
			
			while(rs.next()) {
				System.out.print(rs.getInt("empno") + ", ");
				System.out.print(rs.getString("ename") + ", ");
				System.out.println(rs.getDouble("sal"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {		// 호출의 역순으로 닫아준다.
			if(rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					
				}
			}
			
			if(stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
	}
}


// 그러나 더이상 try - finally는 너무 구시대적인 방법이다.
// 따라서 try - with - resources 를 사용하면 짧고 편하게 쓸 수 있다.



