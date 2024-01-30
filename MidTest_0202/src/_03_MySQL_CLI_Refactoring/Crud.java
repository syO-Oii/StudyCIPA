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
	
	Screen screen = new Screen();	
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
	
	Crud(Connection connection){
		this.connection = connection;
	}
	
	
	// Read : 자료 읽는 기능
	void readData() throws SQLException {
		int checkMenu = Integer.parseInt(sc.nextLine());
		
		switch(checkMenu) {
		case 1:
			screen.readAllScreen();
			readAll();
			break;
			
		case 2:
			screen.readEmpScreen();
			System.out.println("정보를 조회 할 사원 번호를 입력하세요.");
			System.out.print(" * 사원 번호 : ");
			int empno = Integer.parseInt(sc.nextLine());
			readEmpno(empno);
		}
		screen.insertAnyKey();
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
	void createData(Connection connection) throws SQLException {
		stmt = connection.createStatement();
		sql = "insert into emp values(9876, '홍길동', '사원', '7900', '2024-01-25', '3800', '200', '20')";
		result = stmt.executeUpdate(sql);
		if(result == 1) {
			System.out.println("입력 성공!");
		}		
		screen.insertAnyKey();
	}
	
	void updateData(Connection connection) throws SQLException {
		screen.updateScreen();
		int selectMenu = 0;
		boolean check = false;
		
		
		while(!check) {
			screen.selectMessage();
			selectMenu = Integer.parseInt(sc.nextLine());
			
			switch(selectMenu) {
			case 1:
				jobUpdateData(connection);
				check = true;
				break;
			case 2:
				screen.mgrUpdateScreen();
				mgrUpdateData(connection);
				check = true;
				break;
			case 3:
				screen.salUpdateScreen();
				salUpdateData(connection);
				check = true;
				break;
			case 4:
				screen.deptnoUpdateScreen();
				deptnoUpdateData(connection);
				check = true;
				break;
			case 0:
				check = true;
				break;
			default:
				System.out.println("다시 선택하세요.");
			}
		}
	}
	
	void jobUpdateData(Connection connection) throws SQLException {
		screen.jobUpdateScreen();
		
		System.out.print("수정 할 사원의 사원번호를 입력하세요 : ");
		int empno = Integer.parseInt(sc.nextLine());
		System.out.print("바꾸실 직급 명을 입력하세요 : ");
		String job = sc.nextLine();
		
		stmt = connection.createStatement();
		sql = "update emp set job = '" + job + "' where empno = " + empno;
		result = stmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("정보 수정이 완료되었습니다.");
		} else {
			System.out.println("정보 수정이 실패했습니다.");
		}
		screen.insertAnyKey();
	}
	
	void mgrUpdateData(Connection connection) throws SQLException {
		screen.jobUpdateScreen();
		
		System.out.print("수정 할 사원의 사원번호를 입력하세요 : ");
		int empno = Integer.parseInt(sc.nextLine());
		System.out.print("새로운 사수 번호를 입력하세요 : ");
		int mgr = Integer.parseInt(sc.nextLine());
		
		stmt = connection.createStatement();
		sql = "update emp set mgr = '" + mgr + "' where empno = " + empno;
		result = stmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("정보 수정이 완료되었습니다.");
		} else {
			System.out.println("정보 수정이 실패했습니다.");
		}
		screen.insertAnyKey();
	}
	
	void salUpdateData(Connection connection) throws SQLException {
		screen.jobUpdateScreen();
		
		System.out.print("수정 할 사원의 사원번호를 입력하세요 : ");
		int empno = Integer.parseInt(sc.nextLine());
		System.out.print("연봉 정보를 입력하세요 : ");
		double sal = Double.parseDouble(sc.nextLine());
		
		stmt = connection.createStatement();
		sql = "update emp set sal = '" + sal + "' where empno = " + empno;
		result = stmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("정보 수정이 완료되었습니다.");
		} else {
			System.out.println("정보 수정이 실패했습니다.");
		}
		screen.insertAnyKey();
	}
	
	void deptnoUpdateData(Connection connection) throws SQLException {
		screen.jobUpdateScreen();
		
		System.out.print("수정 할 사원의 사원번호를 입력하세요 : ");
		int empno = Integer.parseInt(sc.nextLine());
		System.out.print("바꿀 부서 번호를 입력하세요 : ");
		int deptno = Integer.parseInt(sc.nextLine());
		
		stmt = connection.createStatement();
		sql = "update emp set deptno = '" + deptno + "' where empno = " + empno;
		result = stmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("정보 수정이 완료되었습니다.");
		} else {
			System.out.println("정보 수정이 실패했습니다.");
		}
		screen.insertAnyKey();
	}
	
	void deleteData(Connection connection, int empno) throws SQLException {
		stmt = connection.createStatement();
		sql = "delete from emp where empno = " + empno;		// 따옴표 맞는지 보기
		result = stmt.executeUpdate(sql);
		
		if(result >= 1) {
			System.out.println("삭제 성공!");
		} else {
			System.out.println("삭제 실패!");
		}
		screen.insertAnyKey();
	}
	
	int getEmpno() {
		boolean check = false;
		int putEmpno = 0;
		while(!check) {
			try {
				screen.deleteMessage();
			    putEmpno = Integer.parseInt(sc.nextLine());
			    check = true;
			    return putEmpno;
			} catch (NumberFormatException e) {
			    // 예외 발생 시 처리
			    System.out.println("올바른 숫자를 입력하세요.");
			    putEmpno = -1;
			}
		}
		return putEmpno;	
	}
}
