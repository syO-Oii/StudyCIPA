package _04_P415;

public class Outter {
	public void method2(int arg) {		// -> final int arg
		int localVar = 1;		// 지역 변수
		arg = 100;				
		localVar = 100;			// 지역 변수 값 바꿈
		
		final int localVar1 = 1;
		
		
		
		
		// 중첩 클래스 내부에 메소드 생성
		// 로컬 클래스의 객체는 메소드 실행이 되면 없어지는게 일반적이지만
		// 메소드가 종료되어도 계속 실행상태로 존재할 수 있음 (ex 스레드)
		// 매개변수나 로컬 변수가 수정되었을 경우 로컬클래스에 복사해둔 값과 달라지기 떄문에
		// 매개 변수나 로컬 변수를 final로 처리해서 값이 변하지 않는다는것을 지정해줘야 한다.

		class Inner {
			public void method() {
				int result = arg + localVar;
				
				int result1 = arg + localVar1;
				
				System.out.println(result);
				System.out.println(result1);
				
			}
		}
	}
}

// 프로세스 : 실행중인 프로그램
// 프로세서 : CPU 같은 하드웨어
