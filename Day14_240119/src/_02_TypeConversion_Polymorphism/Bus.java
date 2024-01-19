package _02_TypeConversion_Polymorphism;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
		
	}

	public void checkFare() {
		System.out.println("버스 요금을 확인합니다.");
		
	}
	
	
}
