package test;

import java.sql.SQLException;
import java.util.List;

import dao.BoardDao;
import dto.Board;

public class DaoEx1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		BoardDao dao = BoardDao.getInstanse();
		List<Board> list = dao.selectList();	// selectList() 호출
		// list 객체 출력
		
		for(Board board : list) {
			System.out.println(board);
		}		
	}
}
