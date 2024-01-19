package day_13_02_design.pattern;

// 자동차 생성 공장 규격
public abstract class CarFactory {
	public abstract TireProduct createTire();
	public abstract DoorProduct createDoor();
}
