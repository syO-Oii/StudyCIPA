package _02_JdbcArray;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// 아래 Q2에 대한 답 첫번째 : 테이블명과 같은 클래스 설계
class Dept{
	private int deptno;
	private String dname;
	private String loc;
	
	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}	
}

public class _01_JdbcArrayEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String url = "jdbc:mysql://localhost:3306/baseballstats";
		String id = "root";		// 로그인 계정
		String pass = "mysql";  // 비밀번호
		Connection conn = null;
		Statement stmt = null;
		String sql = "SELECT deptno, dname, loc FROM dept";
		// String sql2 = "SELECT dname, loc FROM dept";		// Test1. 만약 deptno가 없는 sql을 호출 할 경우
		
		List<Dept> deptList = new ArrayList<>();	// 아래 Q2에 대한 답 두번째 : 클래스배열 생성
		
		
		// 조건을 try에 한번에 넣어서 처리
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);				// 여기(try)에서만 사용할거라 내부에서 변수 선언
			
			while(rs.next()) {
				// int deptno = rs.getInt(1);		// 첫번째 칼럼 호출
				int deptno = rs.getInt("deptno"); 	// 칼럼명을 직접 적어도 같은 결과가 나옴(단, 칼럼 위치가 정확하다는 같다는 가정하에)
				
				//int deptno2 = rs.getInt(deptno);	// Test1. deptno가 없는 sql을 호출했기 때문에 오류 발생
				//System.out.println(deptno2);
				
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				String str = deptno + ", " + dname + ", " + loc;	// Q1에서 사용할 str		
				list.add(str);
				
				// Q2에 대한 답 세번째 : 클래스 생성자에 기본 값 넣어준 후 리스트에 추가
				Dept dept = new Dept(deptno, dname, loc);
				deptList.add(dept);
			}
			
		} catch (ClassNotFoundException e) {	// Class.forName 확인
			e.printStackTrace();
		} catch (SQLException e) {				// conn, stmt 확인
			e.printStackTrace();
		}
		
		// Q. list에 있는 자료를 모두 출력하세요.
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("------------------------------------");
		// Q2. 각 컬럼만 따로 쓰고 싶다면?
		for(Dept dept : deptList) {
			System.out.println(dept);
		}
		System.out.println("------------------------------------");
		// Q3. 각 칼럼별로 출력할 때
		for(Dept dept : deptList) {
			System.out.println(dept.getDeptno() + ", " + dept.getDname() + ", " + dept.getLoc());
		}
		
		
	
		
	}
}
