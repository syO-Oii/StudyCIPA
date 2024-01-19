package _02_TypeConversion_Polymorphism;


// 강제 형변환 설명 예제
public class VehicleEx {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		// vehicle.checkFare(); 	// vehicle 인터페이스에는 checkFare() 메소드가 없음
		
		Bus bus = (Bus) vehicle;	// 강제 형변환
		
		bus.run();
		bus.checkFare();			// bus 인터페이스에는 checkFare() 메소드가 있음
		
	}
}
