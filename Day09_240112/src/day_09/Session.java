package day_09;

public class Session {
	// private를 선언 할 경우 클래스 내에서만 동작한다.
	private boolean run1;
	private boolean run2;
	
	// 필드 값을 받는 생성자
	public Session(boolean run1, boolean run2) {
		super();
		this.run1 = run1;
		this.run2 = run2;
	}

	public boolean isRun1() {
		return run1;
	}

	public void setRun1(boolean run1) {
		this.run1 = run1;
	}

	public boolean isRun2() {
		return run2;
	}

	public void setRun2(boolean run2) {
		this.run2 = run2;
	}
	
}
