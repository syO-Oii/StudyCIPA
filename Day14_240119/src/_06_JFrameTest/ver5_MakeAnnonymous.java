package _06_JFrameTest;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ver5_MakeAnnonymous extends JFrame {
	public static void main(String[] args) {
		// 4단계 익명객체 테스트
		new ver5_MakeAnnonymous();	// 익명 객체
		
	}
	
	public ver5_MakeAnnonymous(){
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
		
		
		
		btn1.addActionListener(new ActionListener() {		// 익명 객체 생성
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 1");
			}
		});
		
		
		
		JLabel lb1 = new JLabel("1번 라벨");
		con.add(lb1);
		lb1.setLocation(120, 50);
		lb1.setSize(100, 30);
		
		JButton btn2 = new JButton("버튼 2번");
		con.add(btn2);
		btn2.setLocation(250, 50);
		btn2.setSize(100, 30);
		
		btn2.addActionListener(new ActionListener() {		// 익명 객체 생성
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 2");
			}
		});
		
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
