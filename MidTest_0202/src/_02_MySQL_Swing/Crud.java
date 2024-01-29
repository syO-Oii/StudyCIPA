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
	
	public Crud(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
		
	// Read - 직원 사번으로 검색
	void searchEmpno(Connection connection, int empno) throws SQLException {
		sql = "select * from emp where empno = '" + empno + "'";
		stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			mainFrame.printTa.append(" * 이름 : " + rs.getString("ename"));
			mainFrame.printTa.append(" * 직급 : " + rs.getString("job"));
			mainFrame.printTa.append(" * 사수 번호 : " + rs.getInt("mgr"));
			mainFrame.printTa.append(" * 입사일 : " + rs.getString("hiredate"));
			mainFrame.printTa.append(" * 연봉 : " + rs.getDouble("sal"));
			mainFrame.printTa.append(" * 성과급 : " + rs.getDouble("comm"));
			mainFrame.printTa.append(" * 부서 번호 : " + rs.getInt("deptno"));
		}
	}
	
	void searchAll(Connection connection) throws SQLException {
		sql = "select * from emp";
		stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			mainFrame.printTa.append(rs.getInt("empno") + " \t");
			mainFrame.printTa.append(rs.getString("ename") + " \t");
			mainFrame.printTa.append(rs.getString("job") + " \t");
			mainFrame.printTa.append(rs.getInt("mgr") + " \t");
			mainFrame.printTa.append(rs.getString("hiredate") + " \t");
			mainFrame.printTa.append(rs.getDouble("sal") + " \t");
			mainFrame.printTa.append(rs.getDouble("comm") + " \t");
			mainFrame.printTa.append(rs.getInt("deptNo") + "\n");
		}
		
	}

	// insert 기능 구현
	void createData(Connection connection) throws SQLException {
		sql = "insert into emp values(9876, '홍길동', '사원', '7900', '2024-01-25', '3800', '200', '20')";
		try(Statement stmt = connection.createStatement()) {
			result = stmt.executeUpdate(sql);
			mainFrame.printTa.setText("");
			mainFrame.systemTa.setText("");
			if(result == 1) {
				String str = "9876, 홍길동, 사원, 7900, 2024-01-25, 3800.0, 200.0";
				mainFrame.printTa.append(str);
				mainFrame.systemTa.append(" 정보 입력이 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			mainFrame.systemTa.setText("에러 발생: " + e.getMessage());
		}

	}
	
	void updateData(Connection connection) throws SQLException {
		stmt = connection.createStatement();
		sql = "update emp set sal = 5800 where empno = 9876";
		result = stmt.executeUpdate(sql);
		mainFrame.systemTa.append("홍길동님의 연봉 정보 수정이 완료되었습니다.");
	}
	
	void deleteData(Connection connection) throws SQLException {
		stmt = connection.createStatement();
		sql = "delete from emp where empno = 9876";
		result = stmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("삭제 성공!");
		} else {
			System.out.println("삭제 실패!");
		}
	}
	

	
}
