package day_05;

import java.util.Random;

public class _03_Test01_ArrayTest_Lotto {
	public static void main(String[] args) {
		int[] lottoNum = new int[6];
		Random rNum = new Random();
		// 로또번호 추출
		for(int i = 0 ; i < lottoNum.length; i++) {
			lottoNum[i] = rNum.nextInt(45) + 1;
						
			for(int j = 0; j < i; j++) {
				while(lottoNum[i] == lottoNum[j]) {
					lottoNum[i] = lottoNum[i] = rNum.nextInt(45) + 1;
					j = 0;
				}
			}
					
		}
		
		// 번호 오름차순 정렬
		for(int i = 0 ; i < lottoNum.length; i++) {
			int minIndex = i;
			int result;
		
			for(int j = 0 ; j < lottoNum.length; j++) {
				if(lottoNum[minIndex] < lottoNum[j]) {		
					minIndex = j;	// 최소값 주소 확인
				} else {
					minIndex = i;
				}
				
				// 확인된 최소값의 주소값과 순서 변경
				result = lottoNum[i];
				lottoNum[i] = lottoNum[minIndex];
				lottoNum[minIndex] = result;
								
			}
		}
		
		// 최종 출력
		for(int i = 0 ; i < lottoNum.length; i++) {
			System.out.print(lottoNum[i] + " ");	
		}
		
		
	}
}
