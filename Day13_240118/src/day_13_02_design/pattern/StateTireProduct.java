package day_13_02_design.pattern;

public class StateTireProduct extends TireProduct{
	@Override
	public String makeAssemble() {
		return "미국산 타이어";
	}
}
