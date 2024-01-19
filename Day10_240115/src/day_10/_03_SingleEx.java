package day_10;

// 싱글톤 디자인 = 자바 디자인 패턴 중 하나
// https://catsbi.oopy.io/344dbe7b-9774-48fc-9c95-b554e9c1c4bc
// https://injae-kim.github.io/dev/2020/08/06/singleton-pattern-usage.html
// p279 ~


public class _03_SingleEx {
	public static void main(String[] args) {
		//_03_Singleton sing1 = new _03_Singleton();		// 생성자를 private 했기 때문에 생성 불가
		_03_Singleton sing2 = _03_Singleton.getInstance();
		_03_Singleton sing3 = _03_Singleton.getInstance();
		
		if(sing2 == sing3) {	// 객체의 메모리 주소 비교
			System.out.println("싱글턴은 항상 같은 객체가 서비스된다.");
		}
		
		if (sing2.equals(sing3)) {
			System.out.println("싱글턴은 항상 같은 객체가 서비스된다.");
		}
		
		
	}
}
