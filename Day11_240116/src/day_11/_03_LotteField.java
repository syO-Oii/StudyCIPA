package day_11;

public class _03_LotteField {
	public static void main(String[] args) {
		_03_LottePitcher wjKim = new _03_LottePitcher("김원중", 34, "포크볼");
		wjKim.callMainWeapon();
		wjKim.managerIsCall(wjKim.name);	// 부모 클래스 LotteTraining 메소드
		wjKim.startTraining();				// 부모 클래스 LotteTraining 메소드
		wjKim.fastBallTraining();			// 자식 클래스 LottePitcher 메소드
		wjKim.curveTraining();				// 자식 클래스 LottePitcher 메소드
		wjKim.defenceTrainging();			// 부모 클래스 LotteTraining 메소드
		wjKim.endPitcherTraining();			// 자식 클래스 LottePitcher 메소드
		
	}

}
