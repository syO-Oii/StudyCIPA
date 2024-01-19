package day_13_swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame_ver2 extends JFrame implements ActionListener, MouseListener{
	JButton playerListButton = new JButton("선수 명단");
	JButton addPlayerButton = new JButton("선수 등록");
	JButton playerInfoButton = new JButton("선수 정보 조회");
	
	
	public MyFrame_ver2() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		Container con = this.getContentPane();		// 컴포넌트 붙이는곳
		this.setVisible(true);
		this.setSize(500, 300);
		this.setLocation(300, 300);
		this.setTitle("이벤트 처리 테스트");
		con.addMouseListener(this);		// 마우스리스너 동작 예제
		con.setLayout(new FlowLayout());
		con.add(playerListButton); 
		playerListButton.addActionListener(this);
		con.add(addPlayerButton);
		addPlayerButton.addActionListener(this);
		con.add(playerInfoButton);
		playerInfoButton.addActionListener(this);
			
		
	}
	
	public static void main(String[] args) {
		new MyFrame_ver2();
	}
	
	// 동작 확인 메소드
	public void actionPerformed(ActionEvent e) {
		// getSource = 액션 이벤트의 값
		if(e.getSource() == playerListButton) {
			System.out.println("선수 명단");
		} else if(e.getSource() == addPlayerButton) {
			System.out.println("선수 등록");
		} else if(e.getSource() == playerInfoButton) {
			System.out.println("선수 정보 조회");
		}
		
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() + ", " + e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
























