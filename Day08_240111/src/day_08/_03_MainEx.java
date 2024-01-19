package day_08;

public class _03_MainEx {
	
	public static void main(String[] args) {	// args에 값 넣는 방법 - Run - Run Configuration-Argument 항목에서 값 수정
		
		// 메인에 사전 입력된 값
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.out.println("시스템을 종료합니다.");
			System.exit(0);		// 0 : 정상 종료
		}
		String str = args[0];
		System.out.println(str);
		
	}
	
}
