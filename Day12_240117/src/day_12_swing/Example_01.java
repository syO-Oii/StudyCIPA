package day_12_swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Example_01 extends JFrame{
	public Example_01(){
		Container con = this.getContentPane();
		con.setLayout(null);
		JButton jb1 = new JButton("버튼");
		jb1.setLocation(20, 200);
		jb1.setSize(100, 30);
		con.add(jb1);
		
		JLabel name = new JLabel("이름");
		con.add(name);
		name.setLocation(20, 20);
		name.setSize(100, 30);
		
		JTextField nameTextField = new JTextField();
		con.add(nameTextField);
		nameTextField.setLocation(50, 20);
		nameTextField.setSize(100, 30);
		
		JLabel id = new JLabel("아이디");
		con.add(id);
		id.setLocation(200, 20);
		id.setSize(100, 30);
		
		
		JTextField idTextField = new JTextField();
		con.add(idTextField);
		idTextField.setLocation(250, 20);
		idTextField.setSize(100, 30);
		
		JLabel password = new JLabel("패스워드");
		con.add(password);
		password.setLocation(400, 20);
		password.setSize(100, 30);
		
		JTextField passwordTextField = new JTextField();
		con.add(passwordTextField);
		passwordTextField.setLocation(450, 20);
		passwordTextField.setSize(100, 30);
		
		JLabel ssn = new JLabel("생년월일");
		con.add(ssn);
		ssn.setLocation(600, 20);
		ssn.setSize(100, 30);
		
		JTextField ssnTextField = new JTextField();
		con.add(ssnTextField);
		ssnTextField.setLocation(650, 20);
		ssnTextField.setSize(100, 30);
		
		
		this.setLocation(200, 100);
		this.setTitle("스윙 연습");
		this.setVisible(true);  // 윈도우 프레임을 보이게
		this.setSize(1000, 1000);  // 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new Example_01();
		
	}
	
	
}
