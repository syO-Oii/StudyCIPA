package day_13_02_design.pattern;

// 미국산 타이어 생산
public class StateDoorProduct extends DoorProduct{
	@Override
	public String makeAssemble() {
		return "미국산 차문";
	}
	
	
}
