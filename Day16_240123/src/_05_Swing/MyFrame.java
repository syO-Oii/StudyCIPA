package _05_Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	JTextField tf = new JTextField(10);
	JButton bt = new JButton("실행");
	static String str = "안녕하세요.";
	
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 컨테이너 설정
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		this.setLocation(500, 400);
		this.setSize(400, 300);
		this.setVisible(true);
		
		con.add(tf);		// 텍스트 필드 등록
		con.add(bt);		// 버튼 등록
		
		
		String strTest = "테스트스트링";
		// 버튼 이벤트 등록
		bt.addActionListener(new MyEvent(strTest));
		
		
		
	}
	
	// 클릭 이벤트 설정
	class MyEvent implements ActionListener{
		String str;
		
		MyEvent(String str){
			this.str = str;
			//actionPerformed();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(str);
			System.out.println(tf.getText());	// 이벤트 실행 때 마다 텍스트박스 내용을
		}
		
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
