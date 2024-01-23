package _02_P412;

// 클래스 외부에 변수를 작성해도 상관 없음
// Name name;
// School school

class Name {}
class School{}

// 그러나 static을 구성하는 경우는 잘 없음
// static class Name
// static class School


public class Account {
	// 다만 클래스 안에 두는 경우는
	// 객체가 생성되었을 때만 멤버를 생성하기 위함
	Name name = new Name();
	School school = new School();
	
	class Name {}
	class School{}
	class Location{}
	
	/*
	 * 만약 객체 앞에 static을 붙이려면
	 * 1. 클래스가 static이거나
	 * 2. 클래스 밖의 다른 클래스를 객체로 생성 할 경우이다
	 * 따라서 지금 코드 상황에서 아래와 같은 코드는 오류가 발생한다.
	 * static Location location = new Location();
	*/
	
}
