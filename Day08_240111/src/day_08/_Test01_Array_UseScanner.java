package day_08;

import java.util.Scanner;

public class _Test01_Array_UseScanner {
	// 스캐너를 이용하여 2차원 배열의 크기를 입력받아 점수를 입력받도록 만들어보자
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1차원 배열의 크기를 정하시오 : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("2차원 배열의 크기를 정하시오 : ");
		int b = Integer.parseInt(sc.nextLine());
		int[][] score = new int[a][b];
		double[] avg = new double[a];
		
		for(int i = 0 ; i < score.length; i++) {
			for(int j = 0 ; j < score[i].length; j++) {
				System.out.println((i + 1) + "번 학생 - " + (j + 1) + "번째 과목 점수 입력");
				score[i][j] = Integer.parseInt(sc.nextLine());
				avg[i] += score[i][j];
			}
			avg[i] /= (double)score[i].length; 
		}
		
		for(int i = 0 ; i < score.length; i++) {
			System.out.printf("%d번 학생 점수 : ", i+1);
			for(int j = 0 ; j < score[i].length; j++) {
				System.out.printf("%d점 ",score[i][j]);
			}
			System.out.println("평균 : " + avg[i]);
			System.out.println();
		}
		sc.close();
	}
}
