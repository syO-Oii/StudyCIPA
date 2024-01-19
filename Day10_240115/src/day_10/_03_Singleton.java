package day_10;

public class _03_Singleton {
	
	// private 접근 제한은 자신 클래스 내에서만 접근 가능
	private static _03_Singleton singleton = new _03_Singleton();
	
	private _03_Singleton() {}	// 생성자를 private로 하면 ?
	
	static _03_Singleton getInstance() {
		return singleton;
	}

}
