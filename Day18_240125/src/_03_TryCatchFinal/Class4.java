package _03_TryCatchFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// try - with - resources 개선 예제
public class Class4 {
	
	void method() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String password = "mysql";
		String sql = "select * from emp";
		
		// 여기서부터 수정됨, SQLException을 던지기 처리 후에
		Connection conn = DriverManager.getConnection(url, id, password);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
				
		// 객체값을 넣어준다.
		try(conn; stmt; rs;) {
			Class.forName("com.mysql.cj.jdbc.Driver");
							// 여기(try)에서만 사용할거라 내부에서 변수 선언
			
			while(rs.next()) {
				System.out.print(rs.getInt("empno") + ", ");
				System.out.print(rs.getString("ename") + ", ");
				System.out.println(rs.getDouble("sal"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} 
	}
	
	public static void main(String[] args) throws SQLException {
		Class4 class1 = new Class4();
		class1.method();
	}
}


// 그러나 더이상 try - finally는 너무 구시대적인 방법이다.
// 따라서 try - with - resources 를 사용하면 짧고 편하게 쓸 수 있다.



