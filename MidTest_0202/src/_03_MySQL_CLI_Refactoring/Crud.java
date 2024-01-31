package _03_MySQL_CLI_Refactoring;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Crud {
	Connection connection;
	String sql = null;
	Statement stmt = null;
	Resultset rs = null;
	Scanner sc = new Scanner(System.in);
	int result = 0;	
	int empno;			// 사번
	String ename;		// 직원명
	String job;			// 직급
	int mgr;			// 사수 사번
	String hiredate;	// 입사일
	double sal;			// 연봉
	double comm;		// 커미션
	String deptno;		// 부서번호
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	void readAll() throws SQLException {
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
	
	// Read - 직원 사번으로 검색
	void readEmpno(int empno) throws SQLException {
		sql = "select * from emp where empno = '" + empno + "'";
		stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		// 여기에 이상한 값 입력되었을 때의 해결코드를 쓰기
		
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

	// insert 기능 구현
	void createData() throws SQLException {
		stmt = connection.createStatement();
		sql = "insert into emp values(9876, '홍길동', '사원', '7900', '2024-01-25', '3800', '200', '20')";
		result = stmt.executeUpdate(sql);
		if(result == 1) {
			System.out.println("입력 성공!");
		}		
	}
		
	void changeJob(int empno, String job) throws SQLException {		
		stmt = connection.createStatement();
		sql = "update emp set job = '" + job + "' where empno = " + empno;
		result = stmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("정보 수정이 완료되었습니다.");
		} else {
			System.out.println("정보 수정이 실패했습니다.");
		}
	}
	
	void changeMgr(int empno, int mgr) throws SQLException {		
		stmt = connection.createStatement();
		sql = "update emp set mgr = '" + mgr + "' where empno = " + empno;
		result = stmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("정보 수정이 완료되었습니다.");
		} else {
			System.out.println("정보 수정이 실패했습니다.");
		}
	}
	
	void changeSal(int empno, double sal) throws SQLException {
		stmt = connection.createStatement();
		sql = "update emp set sal = '" + sal + "' where empno = " + empno;
		result = stmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("정보 수정이 완료되었습니다.");
		} else {
			System.out.println("정보 수정이 실패했습니다.");
		}
	}
	
	void changeDeptno(int empno, int deptno) throws SQLException {	
		stmt = connection.createStatement();
		sql = "update emp set deptno = '" + deptno + "' where empno = " + empno;
		result = stmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("정보 수정이 완료되었습니다.");
		} else {
			System.out.println("정보 수정이 실패했습니다.");
		}
	}
	
	void deleteData(int empno) throws SQLException {
		stmt = connection.createStatement();
		sql = "delete from emp where empno = " + empno;		// 따옴표 맞는지 보기
		result = stmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("삭제 성공!");
		} else {
			System.out.println("삭제 실패!");
		}
	}
}
