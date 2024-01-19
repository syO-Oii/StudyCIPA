package day_13_swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		Container con = this.getContentPane();		// 컴포넌트 붙이는곳
		this.setVisible(true);
		this.setSize(500, 300);
		this.setLocation(300, 300);
		this.setTitle("이벤트 처리 테스트");
		
		con.setLayout(new FlowLayout());
		
		JButton playerListButton = new JButton("선수 명단");
		con.add(playerListButton); 
		playerListButton.addActionListener(new MyAction());
		JButton addPlayerButton = new JButton("선수 등록");
		con.add(addPlayerButton);
		addPlayerButton.addActionListener(new MyAction());
		JButton playerInfoButton = new JButton("선수 정보 조회");
		con.add(playerInfoButton);
		playerInfoButton.addActionListener(new MyAction());
		JButton saveButton = new JButton("파일 저장");
		con.add(saveButton);
		saveButton.addActionListener(new MyAction());
		JButton loadButton = new JButton("파일 불러오기");
		con.add(loadButton);
		loadButton.addActionListener(new MyAction());
		
		
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}

class MyAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		System.out.println(e.getSource());
	}
	
}























