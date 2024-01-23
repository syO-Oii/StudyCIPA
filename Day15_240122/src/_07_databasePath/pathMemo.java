package _07_databasePath;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 *	MySQL 추가하는 방법
 * 1. Package Explorer에서 마우스 오른쪽 클릭
 * 2. Build Path - Configure Build Path
 * 3. Libraries - Modulepath - AddExternal JARs.. 선택
 * MySQL 설치 폴더 내 mysql-connecter.java-버젼 선택
 * (보통 내컴퓨터\로컬디스크\Program Fiels(X86) - MySQL - Connector J 8.0 안에 있음)
*/
public class pathMemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("mysql 드라이버 로딩!");
		
		String url = "jdbc:mysql://localhost:3306/company";
		String id = "root";		// 로그인 계정
		String pass = "mysql";  // 비밀번호
		Connection conn = DriverManager.getConnection(url, id, pass);	// DB에 연결 후 Connection 객체 반환
		System.out.println("mysql 접속 성공");
		
		Statement stmt = conn.createStatement();					
		ResultSet rs = stmt.executeQuery("select * from dept");		// 주어진 sql문을 실행하고 결과는 ResultSet 객체에 반환		
		// ResultSet에 저장된 변수값 출력
		while(rs.next()) {
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.printf("%d, %s, %s\n",deptno, dname, loc);
		}
		
		ResultSet rs2 = stmt.executeQuery("select * from emp");
		while(rs2.next()) {
			int empno = rs2.getInt("empno");
			String ename = rs2.getString("ename");
			String job = rs2.getString("job");
			int mgr = rs2.getInt("mgr");
			String hiredate = rs2.getString("hiredate");
			double sal = rs2.getDouble("sal");
			double comm = rs2.getDouble("comm");
			int deptno = rs2.getInt("deptno");
			System.out.printf("%d, %s, %s, %d, %s, %.2f, %.2f, %d\n",
							empno, ename, job, mgr, hiredate, sal, comm, deptno);
		}
		System.out.println("----------------------------------------------------");
		ResultSet rs3 = stmt.executeQuery("select "
				+ "ename, sal from emp");
		while(rs3.next()) {
			String ename = rs3.getString("ename");
			double sal = rs3.getDouble("sal");
			System.out.printf("%s, %.2f\n", ename, sal);
		}
		
	}
}
