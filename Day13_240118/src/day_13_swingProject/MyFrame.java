package day_13_swingProject;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	ArrayList<PlayerInfo> playerList = new ArrayList<>();
	MyFunction myFunction = new MyFunction();
	StringBuilder playerInfoString = new StringBuilder();
	JButton jb1 = new JButton("선수단 전체 정보");
	JButton jb2 = new JButton("선수 정보 저장");
	JButton jb3 = new JButton("선수 정보 수정");
	JButton jb4 = new JButton("파일 저장");
	JButton jb5 = new JButton("파일 삭제");
	
	JTextField jt1 = new JTextField();
	JTextField jt2 = new JTextField();
	JTextField jt3 = new JTextField();
	JTextField jt4 = new JTextField();
	JTextField jt5 = new JTextField();
	
	static JTextArea ta = new JTextArea();
	
	public MyFrame() {
		Container con = this.getContentPane();
		con.setLayout(null);
		
		JLabel lb1 = new JLabel("선수이름");
		con.add(lb1);
		lb1.setLocation(20, 50);
		lb1.setSize(100, 30);
		
		// jt1
		con.add(jt1);
		jt1.setLocation(80, 50);
		jt1.setSize(100, 30);
		
		JLabel lb2 = new JLabel("선수 등번호");
		con.add(lb2);
		lb2.setLocation(200, 50);
		lb2.setSize(100, 30);
		
		// jt2
		con.add(jt2);
		jt2.setLocation(280, 50);
		jt2.setSize(100, 30);
		
		JLabel lb3 = new JLabel("포지션");
		con.add(lb3);
		lb3.setLocation(400, 50);
		lb3.setSize(100, 30);
		
		// jt3
		con.add(jt3);
		jt3.setLocation(460, 50);
		jt3.setSize(100, 30);
		
		JLabel lb4 = new JLabel("연봉");
		con.add(lb4);
		lb4.setLocation(620, 50);
		lb4.setSize(100, 30);
		
		//jt4
		con.add(jt4);
		jt4.setLocation(670, 50);
		jt4.setSize(100, 30);
		
		JLabel lb5 = new JLabel("전화");
		con.add(lb5);
		lb5.setLocation(20, 80);
		lb5.setSize(100, 30);
		
		// jt5
		con.add(jt5);
		jt5.setLocation(80, 80);
		jt5.setSize(100, 30);
		
		JLabel lb6 = new JLabel("잔고");
		con.add(lb6);
		lb6.setLocation(200, 80);
		lb6.setSize(100, 30);
		
		JTextField jt6 = new JTextField();
		con.add(jt6);
		jt6.setLocation(280, 80);
		jt6.setSize(100, 30);
		
		
		// jb1 : 선수단 전체 정보
		jb1.setLocation(20, 350);
		jb1.setSize(130, 30);
		con.add(jb1);
		jb1.addActionListener(this);
		
		// jb2 : 선수 정보 저장
		jb2.setLocation(200, 350);
		jb2.setSize(130, 30);
		con.add(jb2);
		jb2.addActionListener(this);
		
		
		// jb3 : 선수 정보 수정
		jb3.setLocation(380, 350);
		jb3.setSize(130, 30);
		con.add(jb3);
		jb3.addActionListener(this);
				
		// jb4 : 파일 저장
		jb4.setLocation(560, 350);
		jb4.setSize(130, 30);
		con.add(jb4);
		jb4.addActionListener(this);
		
		// jb5 : 파일 삭제
		jb5.setLocation(740, 350);
		jb5.setSize(130, 30);
		con.add(jb5);
		jb5.addActionListener(this);
		
		
		// 선수 정보 조회 텍스트필드
		
		ta.setLocation(20, 120);
		ta.setSize(830, 200);
		con.add(ta);
		
		
		this.setLocation(200, 100);
		this.setTitle("스윙 연습");
		this.setVisible(true);  // 윈도우 프레임을 보이게
		this.setSize(900, 500);  // 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
	
	public void actionPerformed(ActionEvent e) {	
		switch(e.getActionCommand()) {
		case "선수단 전체 정보":	// ArrayList 내용을 그대로 출력하기
			playerInfoString.setLength(0);	// playerInfoString 초기화
		    for (PlayerInfo player : playerList) {
		        playerInfoString.append(player.toString()).append("\n");
		    }
						
		 // 텍스트 에어리어에 선수 정보 출력
		    ta.setText(" ");	// 공백 만들기
		    ta.setText(playerInfoString.toString());
		    
			break;
		case "선수 정보 저장":	// ArrayList에 값 나오게 하기
			System.out.println("입력 실행");
			String name = jt1.getText();
			int backNum = Integer.parseInt(jt2.getText());
			String position = jt3.getText();
			double salary = Double.parseDouble(jt4.getText());
			AddPlayer(playerList, name, backNum, position, salary);
			break;
		case "선수 정보 수정":
			String newName = jt1.getText();
			int newBackNum = Integer.parseInt(jt2.getText());
			String newPosition = jt3.getText();
			double newSalary = Double.parseDouble(jt4.getText());
			
			myFunction.modifyPlayerInfo(playerList, newBackNum, newName, newPosition, newSalary);

			break;
		case "파일 저장":
			System.out.println("수정 나오기");
			break;
		case "파일 삭제":
			System.out.println("삭제 나오기");
			break;
		}	
	}
	
	
	private static void AddPlayer(ArrayList<PlayerInfo> playerList, String name, int backNum, String position,
			double salary) {
		
		for(PlayerInfo player : playerList) {
			if(player.getBackNum() == backNum) {
				ta.setText("이미 등록된 선수입니다.");
				return;
			}
		}
		
		PlayerInfo player = new PlayerInfo(name, backNum, position, salary);
		playerList.add(player);
		
	}

}
























