package day_12_swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	public MyFrame() {
		
		this.setVisible(true);	// 윈도우 프레임을 보이도록 설정
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 프레임 x 표시를 누르면 동작을 끝내는 명령어
		this.setLocation(800, 400);
		
		this.setTitle("로또번호 추출기");	// 프로그램명
		
		Container con = this.getContentPane();
		
		JButton jb1 = new JButton();	// 버튼 만들기
		
		jb1.setSize(100,30);
		jb1.setLocation(20,20);
		con.add(jb1);
				
		// 글자 추가
		JLabel printLottoNum = new JLabel(makeLotto());
		printLottoNum.setLocation(100, 200);
		this.add(printLottoNum);
		
		JTextField jt1 = new JTextField();
		con.add(jt1);
		jt1.setLocation(220, 20);
		jt1.setSize(100,30);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
	
	
	
	public String makeLotto() {
		int[] lNum = new int[6];
		int result = 0;
		
		// 로또 번호 추출
		for(int i = 0; i < 6; i++) {
			lNum[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				while (lNum[i] == lNum[j]) {
					lNum[i] = (int) (Math.random() * 45 + 1);
					j = 0;
				}
			}
		}


		for(int i = 0; i < lNum.length; i++) {			// 버블소트 반복횟수
			for(int j = 0; j < lNum.length-1; j++) { 	// 숫자 탐색
				if(lNum[j] > lNum[j+1] ) {				// 앞 뒤 자리 비교 후 숫자가 크면 자리를 바꿈
					result = lNum[j];
					lNum[j] = lNum[j+1];
					lNum[j+1] = result;
				}
			}
		}
		String stringLottoNum = lNum[0] + " " + lNum[1] + " " +lNum[2] + " " +lNum[3] + " " +lNum[4] + " " +lNum[5];
		
		return stringLottoNum;
	}
}
