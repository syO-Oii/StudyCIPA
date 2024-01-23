package _08_Question;

public class _03_NestedClassEx {
	public static void main(String[] args) {
		_03_Car car = new _03_Car();
		
		_03_Car.Tire tire = car.new Tire();			// 로컬 클래스 호출
		_03_Car.Engine engine = new _03_Car.Engine();	// static 클래스 호출
	}
}
