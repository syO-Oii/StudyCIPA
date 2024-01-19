package day_11;




// 부모 클래스
class Parent{
	int money = 100;
	void display() {
		System.out.println(money);
	}
}

// 자식 클래스
public class _02_ChildEx extends Parent {		// extends 클래스 => 상속
	// 생성자, 처음 상속 받을 때 500을 추가함
	public _02_ChildEx() {
		this.money += 500;
	}
	
	
	public static void main(String[] args) {
		_02_ChildEx syong = new _02_ChildEx();
		System.out.println(syong.money);		// Parent 클래스의 money 변수를 가져다 쓸 수 있음
		syong.display();						// Parent 클래스의 메소드를 가져다 쓸 수 있음
		
		
	}

}
