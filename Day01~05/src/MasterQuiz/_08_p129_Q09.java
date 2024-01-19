package MasterQuiz;

import java.util.Scanner;

public class _08_p129_Q09 {
	public static void main(String[] args) {
		// Q9
		Scanner sc = new Scanner(System.in);
		double num1;
		double num2;
		double result;
		
		System.out.print("첫 번째 수 : ");
		num1 = Double.parseDouble(sc.nextLine());
		System.out.print("두 번째 수 : ");
		num2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("------------------");
		
		result = (double)num1 / (double)num2;
		if(num2 == 0 || num2 == 0.0) {
			System.out.println("결과 : 무한대");
		} else {
			System.out.println("결과 : " + result);
		}
		sc.close();		
	}
}
