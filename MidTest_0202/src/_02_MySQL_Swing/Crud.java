package _02_MySQL_Swing;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Crud {
	MainFrame mainFrame;
	Scanner sc = new Scanner(System.in);
	String sql = null;
	Statement stmt = null;
	Resultset rs = null;
	int result = 0;
		
	// Read - 직원 사번으로 검색
	void searchEmpno(Connection connection, int empno) throws SQLException {
		sql = "select * from emp where empno = '" + empno + "'";
		stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(" * 이름 : " + rs.getString("ename"));
			System.out.println(" * 직급 : " + rs.getString("job"));
			System.out.println(" * 사수 번호 : " + rs.getInt("mgr"));
			System.out.println(" * 입사일 : " + rs.getString("hiredate"));
			System.out.println(" * 연봉 : " + rs.getDouble("sal"));
			System.out.println(" * 성과급 : " + rs.getDouble("comm"));
			System.out.println(" * 부서 번호 : " + rs.getInt("deptno"));
		}
	}
	
	void searchAll(Connection connection) throws SQLException {
		sql = "select * from emp";
		stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.print(rs.getInt("empno") + " \t");
			System.out.print(rs.getString("ename") + " \t");
			System.out.print(rs.getString("job") + " \t");
			System.out.print(rs.getInt("mgr") + " \t");
			System.out.print(rs.getString("hiredate") + " \t");
			System.out.print(rs.getDouble("sal") + " \t");
			System.out.print(rs.getDouble("comm") + " \t");
			System.out.println(rs.getInt("deptno"));
		}
	}

	// insert 기능 구현
	void createData(Connection connection) throws SQLException {
		stmt = connection.createStatement();
		// 일단은 고정값으로 입력하기.
		sql = "insert into emp values(9876, '홍길동', '사원', '7900', '2024-01-25', '3800', '200', '20')";
		result = stmt.executeUpdate(sql);
		if(result == 1) {
			mainFrame.systemTa
		}		
	}
	
	void updateData(Connection connection) throws SQLException {
		stmt = connection.createStatement();
		sql = "update emp set sal = 5800 where empno = 9876";
		System.out.println("정보 수정이 완료되었습니다.");
	}
	
	void deleteData(Connection connection) throws SQLException {
		stmt = connection.createStatement();
		// SQL 명령어를 String으로 저장 후
		// int empno;
		// sql = "delete from emp where empno = " + empno + "\"";		// 따옴표 맞는지 보기
		sql = "delete from emp where empno = 9876";
		result = stmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("삭제 성공!");
		} else {
			System.out.println("삭제 실패!");
		}
	}
	

	
}
