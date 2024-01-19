package day_08;

import java.util.Random;

public class _04_BubbleSort {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] a = new int[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(50) + 1;
			System.out.print(a[i] + " ");
		}
		
		for(int i = 0; i < a.length; i++) {			// 버블소트 반복횟수
			for(int j = 0; j < a.length-1; j++) { 	// 숫자 탐색
				if(a[j] > a[j+1] ) {				// 앞 뒤 자리 비교 후 숫자가 크면 자리를 바꿈
					int result = a[j];
					a[j] = a[j+1];
					a[j+1] = result;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
}
