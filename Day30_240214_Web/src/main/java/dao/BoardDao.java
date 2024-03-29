package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Board;

// 싱글톤으로 구현
public class BoardDao {
	private static Connection conn;
	private static BoardDao dao = new BoardDao();
	
	private BoardDao() {}	// 생성자, 객체 내에서만 쓸 수 있게 만듦
	
	public static BoardDao getInstanse() {
		BoardDao.getConnection();
		return dao;
	}
	
	private static void getConnection(){		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/project1", "root", "mysql");
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Board> selectList(){
		ArrayList<Board> list = new ArrayList<Board>();
		String sql = "select * from board order by num desc";
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				// Board 객체 생성 후 DB값 받음
				Board board = new Board(rs.getInt("num"), 
										rs.getString("writer"),
										rs.getString("title"),
										rs.getString("content"),
										rs.getString("regtime"),
										rs.getInt("hits"));
				list.add(board);	// list에 board값 추가
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Board selectOne(int num, boolean inc) {	
	    Board board = null;
	    
	    String sql = "select * from board where num=" + num;
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
	            
	            // 글 데이터를 변수에 저장
				board = new Board(rs.getInt("num"),
								  rs.getString("writer"),
								  rs.getString("title"),
								  rs.getString("content"),
								  rs.getString("regtime"),
								  rs.getInt("hits"));
	            
				if(inc) {
					pstmt.executeUpdate("update board set hits = hits+1 where num = " + num);
				}

	        }
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return board;
	}
	
	public int delete(int num) {
		return 0;
	}
	
	public int insert(Board board) {
		return 0;
	}
	
	public int update(int num) {
		return 0;
	}
	
	
	
}
