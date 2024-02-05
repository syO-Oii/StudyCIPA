package _01_Thread;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WinEmp extends JFrame {
	JButton bt1 = new JButton("전체 내용");
	JButton bt2 = new JButton("입력");
	JButton bt3 = new JButton("이름 검색");
	JButton bt4 = new JButton("수정");
	JButton bt5 = new JButton("삭제");
	JTextArea ta = new JTextArea(10, 47);
	
	JLabel lb1 = new JLabel("부서 코드 :");
	JTextField tf1 = new JTextField(5);
	JLabel lb2 = new JLabel("부서명 :");
	JTextField tf2 = new JTextField(5);
	JLabel lb3 = new JLabel("부서 위치 :");
	JTextField tf3 = new JTextField(5);
	Connection conn;
	Statement stmt;
	
	
	
	
	public WinEmp() {
		String sql = "select deptno, dname, loc from dept";
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";		// 로그인 계정
		String pass = "mysql";  // 비밀번호
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				String str = String.format("%d, %s, %s", deptno, dname , loc);
				ta.append(str);
				
			}
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		JLabel lb1 = new JLabel("부서코드:");
		JLabel lb2 = new JLabel("부서명:");
		JLabel lb3 = new JLabel("부서위치:");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);			// 프레임 보이기
		this.setLocation(300,100);		// 프레임창 시작 위치
		this.setSize(550, 500);			// 프레임창 사이즈 조절
		this.setTitle("프레임 테스트 # 2");
		
		Container con = this.getContentPane();
		
		/*
		 * 
		 * // BorderLayout = 해당 방향에 위치시키는 레이아웃
		 * 
		 *  con.add(bt1, BorderLayout.EAST);
		 *  con.add(bt2, BorderLayout.WEST);
		 *  con.add(bt3, BorderLayout.SOUTH);
		 *  con.add(bt4, BorderLayout.NORTH);
		 *  con.add(bt5, BorderLayout.CENTER);
		 * 
		 */
		
		// 판넬 사용, 판넬에는 레이아웃을 사용할 수 있다
		JPanel jp1 = new JPanel(new FlowLayout());
		jp1.add(bt1);
		jp1.add(bt2);
		jp1.add(bt3);
		jp1.add(bt4);
		jp1.add(bt5);
		
		con.add(jp1, BorderLayout.SOUTH);
		JScrollPane scroll = new JScrollPane(ta);
		JPanel jp2 = new JPanel(new FlowLayout());
		con.add(jp2, BorderLayout.CENTER);
		jp2.add(scroll);
		
		JPanel jp3 = new JPanel(new FlowLayout());
		con.add(jp3, BorderLayout.NORTH);
		jp3.add(lb1); jp3.add(tf1);
		jp3.add(lb2); jp3.add(tf2);
		jp3.add(lb3); jp3.add(tf3);
		
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				select();
				
			}
		});
		
	}
	
	public void select() {
		String sql = "select deptno, dname, loc from dept";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			ta.setText("");
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				String str = String.format("%d, %s, %s\n", 
						                   deptno, dname, loc);
				ta.append(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insert() {
		String sql = String.format("insert into dept values(%s, '%s', '%s')",
				tf1.getText(), tf2.getText(), tf3.getText());
		
		try {
			int res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new WinEmp();
	}
}
