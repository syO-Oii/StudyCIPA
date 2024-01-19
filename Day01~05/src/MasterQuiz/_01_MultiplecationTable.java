package MasterQuiz;

import java.util.Scanner;

public class _01_MultiplecationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 입력 프로그램");

		int dan = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}

		sc.close();
	}

}
