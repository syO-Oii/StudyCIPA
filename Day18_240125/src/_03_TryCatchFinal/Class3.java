package _03_TryCatchFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// try - with - resources 시현 예제
public class Class3 {
	
	void method() {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String password = "mysql";
		String sql = "select * from emp";
		
		// 이 부분이 바뀜
		// close 해줘야 되는 문장을 try()의 괄호 안에 작성 해주면 자동으로 close 해준다.
		// 단, 해당 값들은 try - catch문 안에서만 작동이 된다.
		
		try(Connection conn = DriverManager.getConnection(url, id, password);
			 Statement stmt = conn.createStatement();
			   ResultSet rs = stmt.executeQuery(sql);
			) {
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
	
	public static void main(String[] args) {
		Class3 class1 = new Class3();
		class1.method();
	}
}


// 그러나 더이상 try - finally는 너무 구시대적인 방법이다.
// 따라서 try - with - resources 를 사용하면 짧고 편하게 쓸 수 있다.



