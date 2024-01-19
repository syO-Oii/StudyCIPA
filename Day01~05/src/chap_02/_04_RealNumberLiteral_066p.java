package chap_02;

public class _04_RealNumberLiteral_066p {
	public static void main(String[] args) {
		// float, long타입은 변수에 저장하기 전에 임시로 메모리에 저장되는데
		// float 타입(4byte)은 double(8byte)로, long타입은 int형으로 저장되기 때문에
		// 범주를 벗어난 값을 저장 시 오류가 발생한다.
		// (double이 더 큰 값의 범주를 표현하므로 큰 값이 float에 저장되면 범주를 벗어나게 됨)
		
		// 따라서 각 변수 뒤에 f, F, 혹은 l, L을 입력 해 주어야 정상적으로 해당 형태로 인식한다.
		
		// long lVar1 = 2150000000; 범위 내에 있다고 하더라도 인식하지 않음
		long lVar2 = 2150000000L;
		System.out.println(lVar2);
		
		// 정밀도 테스트
		// double 형태가 보다 더 정밀한 값을 출력함
		float fVar1 = 0.1234567890123456789f;	// 0.12345679
		double dVar1 = 0.1234567890123456789;	// 0.12345678901234568
		System.out.println(fVar1);
		System.out.println(dVar1);
		
		// e 사용하기
		double dVar = 3e6;		// 3000000.0
		float fVar = 3e6F;		// 3000000.0
		double dVar3 = 2e-3;	//0.002
		System.out.println(dVar);
		System.out.println(fVar);
		System.out.println(dVar3);
		
		
	}
}
