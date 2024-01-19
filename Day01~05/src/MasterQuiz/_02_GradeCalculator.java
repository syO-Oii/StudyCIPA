package MasterQuiz;

import java.util.Scanner;

/*
점수를 입력받아서
- 90~100점이면 A
- 80~89점이면 B
- 70~79점이면 C
- 70점 미만이면 F를 출력하세요.

5명의 점수를 입력받아보세요.
*/
public class _02_GradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;
		int score;
		
		for(int i = 0 ; i < 5; i++) {
			score = sc.nextInt();
			if(score >= 90) {
				grade = 'A';
			} else if(score >= 80) {
				grade = 'B';
			} else if(score >= 70) {
				grade = 'C';
			} else {
				grade = 'F';
			}
			
			System.out.println((i+1) + "번째 학생 등급 : " + grade);
		}
		
		
		sc.close();
	}

}
