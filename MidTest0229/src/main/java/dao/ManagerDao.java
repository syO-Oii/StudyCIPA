package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import dto.Manager;

public class ManagerDao {
	private static Connection conn;
	private static ManagerDao dao = new ManagerDao();
	private ManagerDao() {} // 생성자
	public static ManagerDao getInstance() {
		ManagerDao.getConnection();
		return dao;
	}
	
	private static void getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
	        		"jdbc:oracle:thin:@localhost:1521:xe",  "manager", "rlaxogud");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public Manager selectForLogin(String id, String password) {
		Manager manager = null;
		String sql = "select * from manager where id = ? and password = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				manager = new Manager(rs.getInt("num"), 
									  rs.getString("name"), 
									  rs.getString("job"), 
									  rs.getString("id"), 
									  rs.getString("password"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return manager;
		
	}
	
	public Manager select(String id) {
		Manager manager = null;
		String sql = "select * from manager where id = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				manager = new Manager(rs.getInt("num"), 
						  rs.getString("name"), 
						  rs.getString("job"), 
						  rs.getString("id"), 
						  rs.getString("password"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return manager;
		
	}
	
	public int insert(Manager manager) {
		String sql = "insert into manager(name, job, id, password) values (?,?,?,?)";
	    try ( 
	        PreparedStatement pstmt = conn.prepareStatement(sql);            
	    ) {
	        
	        // 쿼리 실행
	    	pstmt.setString(1, manager.getName());
	    	pstmt.setString(2, manager.getJob());
	    	pstmt.setString(3, manager.getId());
	    	pstmt.setString(4, manager.getPassword());

	        return pstmt.executeUpdate();
	    
	    } catch(Exception e) {
	        e.printStackTrace();
	    } 
		return 0;
	}
	
	public int update(Manager manager) {
		String sql = "update manager set name = ?, job = ?, password = ? where id = ?";
	    try ( 
	        PreparedStatement pstmt = conn.prepareStatement(sql);            
	    ) {
	        
	        // 쿼리 실행
	    	pstmt.setString(1, manager.getName());
	    	pstmt.setString(2, manager.getJob());
	    	pstmt.setString(3, manager.getPassword());
	    	pstmt.setString(4, manager.getId());
	        return pstmt.executeUpdate();
	    
	    } catch(Exception e) {
	        e.printStackTrace();
	    } 
		return 0;
	}
	
	public HashMap<String, Manager> selectmanagers() {
		HashMap<String, Manager> map = new HashMap<>();
		String sql = "select * from manager";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Manager manager = new Manager(rs.getInt("num"), 
						  rs.getString("name"), 
						  rs.getString("job"), 
						  rs.getString("id"), 
						  rs.getString("password"));
				map.put(manager.getId(), manager);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return map;
	}
}