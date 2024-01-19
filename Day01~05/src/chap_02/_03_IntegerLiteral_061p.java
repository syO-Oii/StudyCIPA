package chap_02;

public class _03_IntegerLiteral_061p {
	public static void main(String[] args) {

		// Literal : 소스코드에서 프로그래머에 의해 직접 입력된 값
		// 2진수 : 0b 또는 0B로 시작하고 0과 1로 구성됨
		// 8진수 : 0으로 시작하고 0 ~ 7 숫자로 구성됨
		// 10진수 : 소수점이 없는 0 ~ 9 숫자로 구성됨
		// 16진수 : 0x 또는 0X로 시작하고 0 ~ 9 숫자와 A, B, C, D, E, F 또는 a, b, c, d, e, f로 구성됨 
		
		// 예시
		int iVar1 = 0b1011;		// 2진수, 출력값 : 11
		int iVar2 = 0206;		// 8진수, 출력값 : 134
		int iVar3 = 365;		// 10진수, 출력값 : 365
		int iVar4 = 0xB3;		// 16진수, 출력값 : 179
		
		System.out.println(iVar1);
		System.out.println(iVar2);
		System.out.println(iVar3);
		System.out.println(iVar4);
		
		
		// byte 범위 : -128 ~ 127 = -2^7 ~ 2^7-1
		byte bVar1 = -128;
		// byte bVar2 = -129;	// byte의 허용범위가 넘어가므로 컴파일 에러 발생
		System.out.println(bVar1);
		
		

		
		
		
	}

}
