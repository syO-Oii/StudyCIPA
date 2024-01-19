package _06_JFrameTest;

import javax.swing.JFrame;

// 1. 윈도우를 만들어보자 (JFrame 사용, 크기, 위치, 타이틀 등)
// 2. 컴포넌트를 만들어서 붙여보자 (JLabel, JButton, JTextField 2개씩 생성)
// 3. 버튼 이벤트 처리 (2가지 방법 이용)


public class ver1_MakeWindow extends JFrame {
	public static void main(String[] args) {
		// 1단계
		new ver1_MakeWindow();
		
	}
	
	public ver1_MakeWindow(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 닫기
		this.setVisible(true);			// 프레임 보이기
		this.setLocation(300,100);		// 프레임창 시작 위치
		this.setSize(500, 500);			// 프레임창 사이즈 조절
		this.setTitle("프레임 테스트 # 1");
		
	}
	
}


