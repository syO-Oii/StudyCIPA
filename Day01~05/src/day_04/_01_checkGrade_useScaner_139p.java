package day_04;

import java.util.Scanner;

public class _01_checkGrade_useScaner_139p {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		/*
		 * if(score >= 90) { System.out.printf("점수는 %d점 입니다.\n",score);
		 * System.out.println("등급은 A 입니다."); } else if(score >= 80) {
		 * System.out.printf("점수는 %d점 입니다.\n",score); System.out.println("등급은 B 입니다.");
		 * } else if(score >= 70) { System.out.printf("점수는 %d점 입니다.\n",score);
		 * System.out.println("등급은 C 입니다."); } else if(score >= 65) {
		 * System.out.printf("점수는 %d점 입니다.\n",score); System.out.println("등급은 C- 입니다.");
		 * } else { System.out.printf("점수는 %d점 입니다.\n",score);
		 * System.out.println("등급은 F 입니다."); }
		 */
		
		switch(score - (score%10)) {		// 혹은 (score / 10)으로 처리해도 된다. 이때 case 값은 10, 9, 8, 7이 된다.
											// 이때, 101~109까지는 거르지 못한다..ㅠㅠ
			case 100:
			case 90:
				System.out.println("등급은 A 입니다.");
				break;
			case 80:
				System.out.println("등급은 B 입니다.");
				break;
			case 70:
				System.out.println("등급은 C 입니다.");
				break;
			default:
				System.out.println("등급은 F 입니다.");
		}
		sc.close();
	}
}
