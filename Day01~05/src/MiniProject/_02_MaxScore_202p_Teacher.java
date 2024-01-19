package MiniProject;
import java.util.Scanner;

public class _02_MaxScore_202p_Teacher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int studentNum = 0;
		int[] score = null;
		int sum;
		int max;
		double avg;
		boolean run = true;
		while (run) {
			
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				System.out.print("학생수 : ");
				studentNum = Integer.parseInt(scanner.nextLine());
				score = new int[studentNum];
				break;
			case 2:
				for(int i = 0 ; i < score.length ; i++) {
					System.out.print("점수입력 : ");
					score[i] = scanner.nextInt();
				}
				
				
				break;
			case 3:
				System.out.println("점수리스트 : ");
				for(int i = 0 ; i < score.length ; i++) {
					System.out.print(score[i] + " ");
				}
				
				break;
			case 4:
				sum = 0;
				max = 0;
				avg = 0;
				for(int i = 0; i < score.length; i++) {
					if(max < score[i]) {
						max = score[i];
					}
					sum += score[i];
				}
				avg = (double)sum / studentNum;
				System.out.println("분석결과 : 최대값 = " + max + " / 평균값 = " + avg);
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}