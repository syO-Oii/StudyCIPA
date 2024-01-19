package day_03;


public class _05_CoOpEX_126p {
	public static void main(String[] args) {
		int score = 95;
		char grade1;
		if(score > 90) {
			grade1 = 'A';
		} else {
			grade1 = 'B';
		}
		System.out.println(grade1);
		
		
		// 삼항연산자 실습
		char grade2 = (score > 90) ? 'A' : 'B';
		System.out.println(grade2);
		
		char grade3 = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
		System.out.println(grade3);
		
		
	}
}
