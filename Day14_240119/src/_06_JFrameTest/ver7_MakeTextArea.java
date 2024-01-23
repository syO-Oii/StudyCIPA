package _06_JFrameTest;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 7단계 : 텍스트필드에 불러온 값 출력하기

public class ver7_MakeTextArea extends JFrame {
	JButton btn1 = new JButton("버튼 1번");
	JButton btn2 = new JButton("버튼 2번");
	JLabel lb1 = new JLabel("1번 라벨");
	JLabel lb2 = new JLabel("2번 라벨");
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JLabel lbState = new JLabel("메세지를 보여 줍니다.");
	JTextArea ta = new JTextArea(10,50);
	
	
	public ver7_MakeTextArea() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 닫기
		this.setVisible(true);			// 프레임 보이기
		this.setLocation(300,100);		// 프레임창 시작 위치
		this.setSize(500, 500);			// 프레임창 사이즈 조절
		this.setTitle("프레임 테스트 # 2");
		
		Container con = this.getContentPane();
		
		con.setLayout(null);		// FlowLayout : 레이아웃 크기에 따라 내용물 값의 위치가 자동으로 이동함
		JButton btn1 = new JButton("버튼 1번");
		con.add(btn1); 
		btn1.setLocation(20, 50);
		btn1.setSize(100, 30);
		
		
		
		btn1.addActionListener(new ActionListener() {		// 익명 객체 생성
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1");
				lbState.setText("버튼1을 클릭했습니다.");
			}
		});
		
		JLabel lb1 = new JLabel("1번 라벨");
		con.add(lb1);
		lb1.setLocation(140, 50);
		lb1.setSize(100, 30);
		
		JButton btn2 = new JButton("종료");
		con.add(btn2);
		btn2.setLocation(250, 50);
		btn2.setSize(100, 30);
		
		btn2.addActionListener(new ActionListener() {		// 익명 객체 생성
			@Override
			public void actionPerformed(ActionEvent e) {
				confirmExit();
			}
		});
		
		JLabel lb2 = new JLabel("2번 라벨");
		con.add(lb2);
		lb2.setLocation(370, 50);
		lb2.setSize(100, 30);
		
		JTextField tf1 = new JTextField();
		con.add(tf1);
		tf1.setLocation(20,100);
		tf1.setSize(200,30);
		
		JTextField tf2 = new JTextField();
		con.add(tf2);
		tf2.setLocation(250,100);
		tf2.setSize(200,30);
		
		con.add(lbState);
		
		JOptionPane.showMessageDialog(this, "파일을 읽었습니다.", "파일읽기",JOptionPane.ERROR_MESSAGE);
		
		// JLabel
		lbState.setLocation(200, 250);
		lbState.setSize(200,50);
		
		// TextArea
		con.add(ta);
		ta.setLocation(20,150);
		ta.setSize(440,50);
		ta.setVisible(true);
		
		JScrollPane scroll = new JScrollPane(ta);
	}
	
	public static void main(String[] args) {
		new ver7_MakeTextArea();
	}
		
	public void confirmExit() {
		int answer = JOptionPane.showConfirmDialog(this, "종료하시겠습니까?",
													"확인", JOptionPane.YES_NO_CANCEL_OPTION);
		
		if(answer==JOptionPane.YES_OPTION) {
			System.out.println("프로그램을 종료합니다.");
			
			// 종료하기 전에 파일을 자동 저장하도록 세팅
			
			
			System.exit(0);
		} else if (answer==JOptionPane.NO_OPTION) {
			System.out.println("종료를 취소합니다.");
		}
	}
}
