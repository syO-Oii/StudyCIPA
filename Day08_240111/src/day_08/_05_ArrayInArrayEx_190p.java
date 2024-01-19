package day_08;

public class _05_ArrayInArrayEx_190p {
	//이차원배열 테스트
	
	public static void main(String[] args) {
		int[][] scores = {{95,80}, {92,96}};	// 2차원 배열
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);		// 오류 발생
		}
		
		for(int i = 0; i < scores.length; i++) {			// 1단 배열의 길이만큼 루프
			for(int j = 0 ; j < scores[i].length; j++) {	// 2단 배열의 길이만큼 루프
				System.out.printf("[%d], [%d] : ", i, j);
				System.out.println(scores[i][j]);
			}
		}
		
	}
}
