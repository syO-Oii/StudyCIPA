package _05_Annonymous_424p;

class Vehecle{
	void run() {
		System.out.println("차량이 달린다.");
	}
}



public class VehecleEx {
	public static void main(String[] args) {
		// Vehecle vh = new Vehecle(); => 부모 객체 선언
		// 그러나 new Vehecle() 뒤에 중괄호블록{} 을 넣는 순간 익명의 자녀 객체를 선언하게 됨
		Vehecle vh = new Vehecle() {
			// 그 증거로, 부모 객체는 부모 객체 스스로를 재정의 할 수 없음
			// 그러나 익명 객체는 재정의를 하고 있음
			@Override
			void run() {
				System.out.println("미상의 차량이 달린다.");
			}			
		};
		vh.run();
	}
}
