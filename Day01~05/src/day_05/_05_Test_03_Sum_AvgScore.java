package day_05;

import java.util.Scanner;

public class _05_Test_03_Sum_AvgScore {
	public static void main(String[] args) {
		// 점수를 입력받아 총점과 평균을 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 할 과목의 갯수를 적어주세요 : ");
		int count = sc.nextInt();
		int[] score = new int[count];
		int sum = 0;
		float avg = 0;
		
		for(int i = 0 ; i < score.length; i++) {
			System.out.print((i+1) + "번째 과목 점수 : ");
			score[i] = sc.nextInt();
			sum += score[i];
			System.out.println();
		}
		avg = (float)sum / count;
		System.out.println("총점 : " + sum + "점 / 평균 : " + avg + "점");
	}
}
