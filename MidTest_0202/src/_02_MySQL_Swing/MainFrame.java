package _02_MySQL_Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class MainFrame extends JFrame implements ActionListener{
	Container conn;
	JButton createButton = new JButton("데이터 추가");
	JButton readAllButton = new JButton("전체 데이터 조회");
	JButton readButton = new JButton("사원 조회");
	JButton deleteButton = new JButton("데이터 삭제");
	
	
	JButton updateJobButton = new JButton("변경");
	JButton updateMgrButton = new JButton("변경");
	JButton updateSalButton = new JButton("변경");
	JButton updateDeptnoButton = new JButton("변경");
	
	
	JPanel buttonPanel = new JPanel(new FlowLayout());
	JPanel textPanel = new JPanel(new FlowLayout());
	JPanel insertPanel = new JPanel();
	// 입력값을 받을 수 있는 텍스트필드 생성
	JTextArea systemTa = new JTextArea("시스템 메세지\n", 20, 15);
	JTextArea printTa = new JTextArea("결과값\n", 20, 30);
	JScrollPane scroll1 = new JScrollPane(systemTa);
	JScrollPane scroll2 = new JScrollPane(printTa);

	JTextField jobTa = new JTextField(7);
	JTextField mgrTa = new JTextField(7);
	JTextField salTa = new JTextField(7);
	JTextField deptnoTa = new JTextField(7);
	JTextField searchTa = new JTextField(7);
	
	Crud crud;
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
		crud = new Crud(this);
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";		// 로그인 계정
		String pass = "mysql";  // 비밀번호
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			sqlConn = DriverManager.getConnection(url, id, pass);
			stmt = sqlConn.createStatement();	
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
		this.setSize(750, 450);
		
		JPanel insertJobPanel = new JPanel();
		JPanel insertMgrPanel = new JPanel();
		JPanel insertSalPanel = new JPanel();
		JPanel insertDeptnoPanel = new JPanel();
		JPanel insertSearchPanel = new JPanel();
		
		
		// insertPanel 내부 자료 세팅
		JLabel searchLabel = new JLabel("사번 검색");
		JLabel jobLabel = new JLabel("직급 변경");
		JLabel mgrLabel = new JLabel("사수 변경");
		JLabel salLabel = new JLabel("연봉 변경");
		JLabel deptnoLabel = new JLabel("부서 변경");
		
		jobTa.setSize(100, 30);
		mgrTa.setSize(100, 30);
		salTa.setSize(100, 30);
		deptnoTa.setSize(100, 30);
		searchTa.setSize(100, 30);

		insertSearchPanel.add(searchLabel);
		insertSearchPanel.add(searchTa);
		insertJobPanel.add(jobLabel);
		insertJobPanel.add(jobTa);
		insertJobPanel.add(updateJobButton);
		insertMgrPanel.add(mgrLabel);
		insertMgrPanel.add(mgrTa);
		insertMgrPanel.add(updateMgrButton);
		insertSalPanel.add(salLabel);
		insertSalPanel.add(salTa);
		insertSalPanel.add(updateSalButton);
		insertDeptnoPanel.add(deptnoLabel);
		insertDeptnoPanel.add(deptnoTa);
		insertDeptnoPanel.add(updateDeptnoButton);
		
		
		insertPanel.add(insertSearchPanel);
		insertPanel.add(insertJobPanel);
		insertPanel.add(insertMgrPanel);
		insertPanel.add(insertSalPanel);
		insertPanel.add(insertDeptnoPanel);
		
		// buttonPanel 내부 자료 세팅
		createButton.setSize(100, 30);
		readAllButton.setSize(100, 30);
		readButton.setSize(100, 30);
		deleteButton.setSize(100, 30);
				
		buttonPanel.add(createButton);
		buttonPanel.add(readAllButton);
		buttonPanel.add(readButton);
		buttonPanel.add(deleteButton);
		
		// 버튼 동작 구현
		createButton.addActionListener(this);
		readAllButton.addActionListener(this);
		readButton.addActionListener(this);
		updateJobButton.addActionListener(this);
		updateMgrButton.addActionListener(this);
		updateSalButton.addActionListener(this);
		updateDeptnoButton.addActionListener(this);
		deleteButton.addActionListener(this);
		
		
		// textPanel 내용 세팅
		textPanel.add(scroll1);
		textPanel.add(scroll2);
		
		conn.add(insertPanel,BorderLayout.CENTER);
		conn.add(textPanel,BorderLayout.WEST);
		conn.add(buttonPanel, BorderLayout.SOUTH);
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			resetText();
			
			if(e.getSource().equals(createButton)) {
				crud.createData(sqlConn);
			} else if(e.getSource().equals(readAllButton)) {
				crud.searchAll(sqlConn);
			} else if(e.getSource().equals(readButton)) {
				empno = Integer.parseInt(searchTa.getText());
				crud.searchEmpno(sqlConn, empno);
			} else if(e.getSource().equals(updateJobButton)) {
				empno = Integer.parseInt(searchTa.getText());
				crud.updateJobData(sqlConn, empno);
			} else if(e.getSource().equals(updateMgrButton)) {
				empno = Integer.parseInt(searchTa.getText());
				crud.updateMgrData(sqlConn, empno);
			} else if(e.getSource().equals(updateSalButton)) {
				empno = Integer.parseInt(searchTa.getText());
				crud.updateSalData(sqlConn, empno);
			} else if(e.getSource().equals(updateDeptnoButton)) {
				empno = Integer.parseInt(searchTa.getText());
				crud.updateDeptnoData(sqlConn, empno);
			} else if(e.getSource().equals(deleteButton)) {
				empno = Integer.parseInt(searchTa.getText());
				crud.deleteData(sqlConn, empno);
			}
		} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				systemTa.setText("에러 발생: " + e1.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
	
	public void resetText() {
		printTa.setText("");
		systemTa.setText("");
	}
	
}
