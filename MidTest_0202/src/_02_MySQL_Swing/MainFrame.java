package _02_MySQL_Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends JFrame{
	Container conn;
	JButton createButton = new JButton("데이터 추가");
	JButton readAllButton = new JButton("전체 데이터 조회");
	JButton readButton = new JButton("사원 조회");
	JButton updateButton = new JButton("데이터 수정");
	JButton deleteButton = new JButton("데이터 삭제");
	JPanel buttonPanel = new JPanel(new FlowLayout());
	JPanel textPanel = new JPanel(new FlowLayout());
	JPanel insertPanel = new JPanel();
	// 입력값을 받을 수 있는 텍스트필드 생성
	JTextArea systemTa = new JTextArea("시스템 메세지",10,15);
	JScrollPane scroll1 = new JScrollPane(systemTa);
	JTextArea printTa = new JTextArea("결과값",10,15);
	JScrollPane scroll2 = new JScrollPane(printTa);

	Crud crud = new Crud();
	Connection sqlConn;
	Statement stmt;
	
	int empno;
	String ename;
	String job;
	int mgr;
	String hiredate;
	Double sal;
	Double comm;
	int deptno;
	
	public MainFrame() {
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";		// 로그인 계정
		String pass = "mysql";  // 비밀번호
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			sqlConn = DriverManager.getConnection(url, id, pass);
			stmt = sqlConn.createStatement();
			
			// 버튼 동작 리스너
			
			
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		
		drowFrame();
	}
	void drowFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		conn = this.getContentPane();
		this.setLocation(500, 400);
		this.setSize(550, 300);
		
		
		JPanel insertJobPanel = new JPanel();
		JPanel insertMgrPanel = new JPanel();
		JPanel insertSalPanel = new JPanel();
		JPanel insertDeptnoPanel = new JPanel();
		
		// insertPanel 내부 자료 세팅
		JLabel jobLabel = new JLabel("직급 변경");
		JLabel mgrLabel = new JLabel("사수 변경");
		JLabel salLabel = new JLabel("연봉 변경");
		JLabel deptnoLabel = new JLabel("부서 변경");
				
		JTextField jobTa = new JTextField(7);
		JTextField mgrTa = new JTextField(7);
		JTextField salTa = new JTextField(7);
		JTextField deptnoTa = new JTextField(7);
		
		jobTa.setSize(100, 30);
		mgrTa.setSize(100, 30);
		salTa.setSize(100, 30);
		deptnoTa.setSize(100, 30);
		
		insertJobPanel.add(jobLabel);
		insertJobPanel.add(jobTa);
		insertMgrPanel.add(mgrLabel);
		insertMgrPanel.add(mgrTa);
		insertSalPanel.add(salLabel);
		insertSalPanel.add(salTa);
		insertDeptnoPanel.add(deptnoLabel);
		insertDeptnoPanel.add(deptnoTa);
		
		insertPanel.add(insertJobPanel);
		insertPanel.add(insertMgrPanel);
		insertPanel.add(insertSalPanel);
		insertPanel.add(insertDeptnoPanel);
		
		
		// buttonPanel 내부 자료 세팅
		createButton.setSize(100, 30);
		readAllButton.setSize(100, 30);
		readButton.setSize(100, 30);
		updateButton.setSize(100, 30);
		deleteButton.setSize(100, 30);
				
		buttonPanel.add(createButton);
		buttonPanel.add(readAllButton);
		buttonPanel.add(readButton);
		buttonPanel.add(updateButton);
		buttonPanel.add(deleteButton);
		
		// textPanel 내용 세팅
		
		textPanel.add(systemTa);
		textPanel.add(printTa);
		
		conn.add(insertPanel,BorderLayout.CENTER);
		conn.add(textPanel,BorderLayout.WEST);
		conn.add(buttonPanel, BorderLayout.SOUTH);
	}
	
	public void actionPerformed(ActionEvent e) throws SQLException {
		if(e.getSource().equals(createButton)) {
			crud.createData(sqlConn);
		} else if(e.getSource().equals(readAllButton)) {
			crud.searchAll(sqlConn);
		} else if(e.getSource().equals(readButton)) {
			crud.searchEmpno(sqlConn, empno);
		} else if(e.getSource().equals(updateButton)) {
			crud.updateData(sqlConn);
		} else if(e.getSource().equals(deleteButton)) {
			crud.deleteData(sqlConn);
		}

	}
	
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
