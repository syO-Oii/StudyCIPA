package day_08_test;

public class _Quest04 {
	public static void main(String[] args) {
		int a[] = {10, 3, 1, 4, 2};
		// 값 4가 있는 인덱스를 출력하는 프로그램
		int index = 0;
		
		for(int i = 0 ; i < a.length; i++) {
			if(a[i] == 4) {
				index = i;
			}
		}
		
		System.out.println("인덱스 위치 : " + index);
	}
}
