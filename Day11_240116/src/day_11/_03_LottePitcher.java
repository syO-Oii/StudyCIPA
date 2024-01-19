package day_11;

public class _03_LottePitcher extends _03_LotteTraining{
	String mainWeapon;
	
	public _03_LottePitcher(String name, int backNum, String mainWeapon) {
		super(name,backNum);
		this.mainWeapon = mainWeapon;
		this.position = "투수";
	}
	
	void fastBallTraining() {
		System.out.println("직구 훈련을 시작합니다.");
	}
	
	void curveTraining() {
		System.out.println("커브 훈련을 시작합니다.");
	}
	
	void endPitcherTraining() {
		System.out.println("투구 훈련을 종료합니다.");
	}
	
	void callMainWeapon() {
		System.out.println(name + "선수의 주 무기 : " + mainWeapon);
	}
	
	@Override
	void startTraining() {
		System.out.println(name + "선수의 훈련을 시작합니다.");
	}
	
	
}
