package chap_01;

public class test_01_sum {
	public static void main(String[] args) {
		// 1에서 10까지의 합 구하기 예시
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += (i+1);
		}
		System.out.println(sum);
		
		int start = 1;
		int end = 10;
		sum = 0;
		for(int j = start; j <= end; j++) {
			sum += j;
		}
		System.out.println(sum);
		
		
	}
}
