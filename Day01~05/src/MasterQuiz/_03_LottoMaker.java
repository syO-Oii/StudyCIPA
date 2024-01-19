package MasterQuiz;

// p 140 참조

public class _03_LottoMaker {
	public static void main(String[] args) {
		// 조건
		// * 배열을 사용하지 않기
		// * 클래스 만들지 않기

		int lottoNum1;
		int lottoNum2;
		int lottoNum3;
		int lottoNum4;
		int lottoNum5;
		int lottoNum6;

		// 1번 번호 추출
		lottoNum1 = (int) (Math.random() * 45 + 1);

		// 2번 번호 추출
		lottoNum2 = (int) (Math.random() * 45 + 1);
		while (lottoNum1 == lottoNum2) {
			lottoNum2 = (int) (Math.random() * 45 + 1);
		}

		// 3번 번호 추출
		lottoNum3 = (int) (Math.random() * 45 + 1);
		while (lottoNum1 == lottoNum3 || lottoNum2 == lottoNum3) {
			lottoNum3 = (int) (Math.random() * 45 + 1);
		}

		// 4번 번호 추출
		lottoNum4 = (int) (Math.random() * 45 + 1);
		while (lottoNum1 == lottoNum4 || lottoNum2 == lottoNum4 || lottoNum3 == lottoNum4) {
			lottoNum4 = (int) (Math.random() * 45 + 1);
		}

		// 5번 번호 추출
		lottoNum5 = (int) (Math.random() * 45 + 1);
		while (lottoNum1 == lottoNum5 || lottoNum2 == lottoNum5 || lottoNum3 == lottoNum5 || lottoNum4 == lottoNum5) {
			lottoNum5 = (int) (Math.random() * 45 + 1);
		}

		// 6번 번호 추출
		lottoNum6 = (int) (Math.random() * 45 + 1);
		while (lottoNum1 == lottoNum6 || lottoNum2 == lottoNum6 || lottoNum3 == lottoNum6 || lottoNum4 == lottoNum6
				|| lottoNum5 == lottoNum6) {
			lottoNum6 = (int) (Math.random() * 45 + 1);
		}

		/*
		 * System.out.println("-------------------------------------");
		 * System.out.println("---------배열 없이 로또 추출---------");
		 * System.out.println("-------------------------------------");
		 */

		System.out.println("1번 번호 : " + lottoNum1);
		System.out.println("2번 번호 : " + lottoNum2);
		System.out.println("3번 번호 : " + lottoNum3);
		System.out.println("4번 번호 : " + lottoNum4);
		System.out.println("5번 번호 : " + lottoNum5);
		System.out.println("6번 번호 : " + lottoNum6);

		System.out.println("-------------------------------------");
		System.out.println("-------배열을 이용한 로또 추출-------");
		System.out.println("-------------------------------------");
		
		for (int k = 0; k < 10; k++) {

			

			// 배열을 이용한 로또 추출 
			int[] lNum = new int[6];

			for (int i = 0; i < lNum.length; i++) {
				lNum[i] = (int) (Math.random() * 45 + 1);

				for (int j = 0; j < i; j++) {
					while (lNum[i] == lNum[j]) {
						lNum[i] = (int) (Math.random() * 45 + 1);
						j = 0;
					}
				}

			}

			for (int j = 0; j < 6; j++) {
				System.out.print(lNum[j] + " ");
			}
			System.out.println();

		}
		 

	}
}
