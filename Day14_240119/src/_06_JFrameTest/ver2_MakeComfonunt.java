package _06_JFrameTest;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// 1. 윈도우를 만들어보자 (JFrame 사용, 크기, 위치, 타이틀 등)
// 2. 컴포넌트를 만들어서 붙여보자 (JLabel, JButton, JTextField 2개씩 생성)
// 3. 버튼 이벤트 처리 (2가지 방법 이용)


public class ver2_MakeComfonunt extends JFrame {
	public static void main(String[] args) {
		// 2단계
		new ver2_MakeComfonunt();
		
	}
	
	public ver2_MakeComfonunt(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 닫기
		this.setVisible(true);			// 프레임 보이기
		this.setLocation(300,100);		// 프레임창 시작 위치
		this.setSize(500, 500);			// 프레임창 사이즈 조절
		this.setTitle("프레임 테스트 # 2");
		
		Container con = this.getContentPane();
		
		con.setLayout(null);		// FlowLayout : 레이아웃 크기에 따라 내용물 값의 위치가 자동으로 이동함
		JButton btn1 = new JButton("버튼 1번");
		con.add(btn1); 
		btn1.setLocation(0, 50);
		btn1.setSize(100, 30);
		
		JLabel lb1 = new JLabel("1번 라벨");
		con.add(lb1);
		lb1.setLocation(120, 50);
		lb1.setSize(100, 30);
		
		JButton btn2 = new JButton("버튼 2번");
		con.add(btn2);
		btn2.setLocation(250, 50);
		btn2.setSize(100, 30);
		
		JLabel lb2 = new JLabel("2번 라벨");
		con.add(lb2);
		lb2.setLocation(370, 50);
		lb2.setSize(100, 30);
		
		JTextField tf1 = new JTextField();
		con.add(tf1);
		tf1.setLocation(0,100);
		tf1.setSize(200,30);
		
		JTextField tf2 = new JTextField();
		con.add(tf2);
		tf2.setLocation(250,100);
		tf2.setSize(200,30);
		
		
	}
	
}


