package chap_02;

public class _Test01_093p {
	public static void main(String[] args) throws Exception {
		// 아스키코드 예제
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);

		// 입력값 : A
		// 출력값
		// keyCode : 65 // A 아스키코드 = 65
		// keyCode : 13	// Enter 키값 
		// keyCode : 10 // Enter를 표시하는 특수문자값
		
		for(;;) {
			System.out.print("입력 : ");
			keyCode = System.in.read();
			System.out.println(keyCode);
			if(keyCode == 113) {	// q 입력 시 종료
				break;
			}
		}
		System.out.println("종료되었습니다.");
		
	}
	
}
