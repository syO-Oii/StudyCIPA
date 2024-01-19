package day_06;

public class _02_CarEx {
	public static void main(String[] args) {
		// Car 객체에 생성자가 존재하므로 기본 생성자(new Car())는 지원하지 않는다.
		// Car car = new Car();
		
		_02_Car car = new _02_Car("KIA");	
		car.model = "K7";
		car.color = "Black";
		car.cc = 3000;
		car.price = 70000000;
		car.maxSpeed = 200;
		
		
		
		System.out.println(car);
			
		_02_Car car2 = new _02_Car();
		System.out.println(car2);
		
		_02_Car car3 = new _02_Car("르노삼성");
		System.out.println(car3);
		
		_02_Car car4 = new _02_Car("벤츠", "E3");
		System.out.println(car4);
		
		_02_Car car5 = new _02_Car("페라리", "Ferrari FXX", "White", 5998, 300000000d, 345);
		System.out.println(car5);
		
	}
}
