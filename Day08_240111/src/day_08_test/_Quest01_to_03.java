package day_08_test;

public class _Quest01_to_03 {
	public static void main(String[] args) {
		int a[] = {1, 3, 10, 2, 8};
		int sum = 0;
		double avg;
		int max = 0;
		
		// Q1. 합계 구하기
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("합계 : " + sum);
		
		// Q2. 평균 구하기
		avg = (double)sum / (double)a.length;
		System.out.println("평균 : " + avg);
		
		// Q3. 최대값 구하기
		for(int i = 0 ; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("최대값 : " + max);
		
		
	}
}
