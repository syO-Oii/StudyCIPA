package MasterQuiz;

import java.util.Random;
import java.util.Scanner;

public class _04_GameMulti {
	// 구구단을 맞추는 프로그램
	
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int gameCount = 1;
		System.out.println("-------------------------------------------");
		System.out.println("------------ 게임을 시작합니다. -----------");
		System.out.println("-- 총 5문제를 맞출 시 게임이 종료됩니다. --");
		System.out.println("-------------------------------------------");
		
		
		for(;;) {
			int num1 = rd.nextInt(99) + 1;	// 최대 2자리 수
			int num2 = rd.nextInt(9) + 1;	// 1자리 수 
			int multi = num1 * num2;		// 합계
			
			// 문제 제시
			System.out.printf("%d번째 문제 : %d * %d = ?\n",gameCount, num1, num2);
			System.out.print("입력 : ");
			
			// 정답 입력값 저장
			int answer = Integer.parseInt(sc.nextLine());
			
			// 정답 시 
			if(answer == multi) {
				// 점수 및 남은 게임 횟수 조작
				score++;
				gameCount++;
				System.out.printf(" * 정답입니다! *\n * 현재 점수 : %d점\n\n", score);
				// 점수 5점 획득 시 종료
				if(score == 5) {
					System.out.println("5점을 획득하여 게임이 종료됩니다!!!");
					break;
				}
				// 점수가 5점이 아니라면 계속 진행
			} else {
				System.out.printf(" * 오답입니다! *\n * 현재 점수 : %d점\n\n", score);
				gameCount++;
			}
		}
		sc.close();
		System.out.println("종료");
		
	}

}
