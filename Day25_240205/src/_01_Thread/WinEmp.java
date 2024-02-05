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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 쓰레드 시간 설정하기


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
	

	class Clock implements Runnable{
		@Override
		public void run() {
			for(;;) {
				LocalDateTime localDateTime = LocalDateTime.now();
				String localDateTimeFormat1 =
						localDateTime.format(
								DateTimeFormatter.ofPattern
								("yyyy년 MM월 dd일 HH시 mm분 ss초"));
				WinEmp.this.setTitle(localDateTimeFormat1);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	
	public WinEmp() {
		Clock clock = new Clock();
		Thread th = new Thread(clock);
		th.start();
		
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
		
		
		Container con = this.getContentPane();

		
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
