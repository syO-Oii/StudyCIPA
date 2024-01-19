package day_13_03_InterfaceTest;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;	// public~ int와
	int MIN_VOLUME = 0;						// int가 실제 사용에 동일한 역할을 함 (public static final이 생략됨)
	int x = 100;								// 상수
	
	public abstract void turnOn();				// 추상메소드인 public abstract void 와
	void turnOff();								// void가 실제 사용에 동일한 역할을 함(public abstract 부분이 생략됨)
}
