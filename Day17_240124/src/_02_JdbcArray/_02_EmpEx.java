package _02_JdbcArray;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 *  Q) emp 테이블 중 사번, 이름, 직무, 월급을 ArrayList에 저장하고 내용을 출력하세요.
 * */

class Emp{
	int empno;
	String ename;
	String job;
	double sal;
	
	public Emp(int empno, String ename, String job, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
}


public class _02_EmpEx {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/baseballstats";
		String id = "root";
		String pass = "mysql";
		Connection conn = null;
		Statement stmt = null;
		String sql = "SELECT empno, ename, job, sal FROM emp";
		
		List<Emp> empList = new ArrayList<>();
		
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				Double sal = rs.getDouble("sal");
				
				Emp emp = new Emp(empno, ename, job, sal);
				empList.add(emp);
			}
			
		} catch (ClassNotFoundException e) {	// Class.forName 확인
			e.printStackTrace();
		} catch (SQLException e) {				// conn, stmt 확인
			e.printStackTrace();
		}
		
		for(Emp emp : empList) {
			System.out.println(emp.getEmpno() + ", " + 
							   emp.getEname() + ", " +
							   emp.getJob() + ", " +
							   emp.getSal());
		}
		
		
	
		
	}
}
