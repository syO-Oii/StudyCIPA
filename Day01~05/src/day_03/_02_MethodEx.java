package day_03;

import java.util.Scanner;

public class _02_MethodEx {

	
	// 1. 메소드 안에 생성자를 만들 경우
//	public static void main(String[] args) {
//		sum();
//	}
	
//	public static void sum() {	// 정적 메소드
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 수 : ");
//		String strNum1 = sc.nextLine();
//		System.out.print("두번째 수 : ");
//		String strNum2 = sc.nextLine();
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);
//		int result = num1 + num2;
//		System.out.println("덧셈 결과 : " +  result);
//		
//	}

	// 2. main에 생성자를 만들 경우
	
//	public static void main(String[] args) {
//		int x = 100;	
//		{
//			System.out.println(x);	// main의 블록 범위 내에 있기 때문에 x값 출력이 가능
//			int y = 50;				// 블럭 내에서 생성된 값은 블럭을 벗어나는 순간 사라짐
//		}
//		//System.out.println(y);	// 오류 발생 : 블럭 밖에서는 y값이 없는것으로 인식되기 때문
//		
//	}
//	
//	public static void sum() {
//		
//	}
	public static void multi(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);
	}
	
	public static void multi(Scanner sc){
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		int result = num1 * num2;
		System.out.println("결과 : " + result);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		multi(3,6);
		multi(sc);
		
		sc.close();
	}
	
	
}












































