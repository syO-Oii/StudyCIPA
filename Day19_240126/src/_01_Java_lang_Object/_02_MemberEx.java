package _01_Java_lang_Object;

//객체 비교(Object 예제)

public class _02_MemberEx {
	public static void main(String[] args) {
		_02_Member obj1 = new _02_Member("blue");
		_02_Member obj2 = new _02_Member("blue");
		_02_Member obj3 = new _02_Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
		
	}
}
