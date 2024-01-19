package day_05;

import java.util.Scanner;

public class _04_Test02_200p_Q4 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i = 0 ; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);
		
		System.out.println("=====================================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 할 숫자의 갯수는 ? : ");
		int count = sc.nextInt();
		int[] intNum = new int[count];
		int index = 0;
		max = 0;
		
		for(int i = 0; i < intNum.length; i++) {
			System.out.print((i+1) + "번째 숫자 : ");
			intNum[i] = sc.nextInt();
			System.out.println();
		}
		
		for(int i = 0 ; i < intNum.length; i++) {
			if(intNum[index] < intNum[i]) {
				index = i;
			}
			
		}
		System.out.println("\n최대값 : " + intNum[index]);
		sc.close();
		
		
		
		
	}
}
