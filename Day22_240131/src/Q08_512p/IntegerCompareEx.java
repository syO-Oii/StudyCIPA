package Q08_512p;

public class IntegerCompareEx {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		
		// 기본적으로 박싱을 하면 참조영역이 생성된다.
		// Integer의 값의 범위는 -128 ~ 127이며,
		// 해당 값 범위 내일때는 내부 자료를 바로 비교할 수 있지만
		// 범위 밖의 값을 비교할때는 반드시 언박싱하여 비교해야한다.
		// 언박싱 방법
		// 1. 객체.intValue();
		// 2. 객체1.equals(객체2);
	}
}
