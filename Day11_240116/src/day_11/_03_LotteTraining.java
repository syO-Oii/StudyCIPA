package day_11;

public class _03_LotteTraining {
	String name;
	int backNum;
	String position;
	
	public _03_LotteTraining (String name, int backNum) {
		this.name = name;
		this.backNum = backNum;
	}

	void startTraining() {
		System.out.println("훈련을 시작합니다.");
	}
	
	void endTraining() {
		System.out.println("훈련을 종료합니다.");
	}
	
	void managerIsCall(String name) {
		System.out.println("감독님이 " + name + "선수를 부릅니다.");
	}
	
	void pitchTraining() {
		System.out.println("투구 훈련을 시작합니다.");
	}
	
	void attackTraining() {
		System.out.println("타격 훈련을 시작합니다.");
	}
	
	void runningTraining() {
		System.out.println("러닝 훈련을 시작합니다.");
	}
	
	void defenceTrainging() {
		System.out.println("수비 훈련을 시작합니다.");
	}
	
}
