package _02_Exception_446p;

// RuntimeException : 실행시점의 예외상황
// 해당 클래스를 상속
public class _07_NewMyException extends RuntimeException{
	public _07_NewMyException(String msg) {
		super(msg);
	}
}
