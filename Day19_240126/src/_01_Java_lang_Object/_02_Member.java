package _01_Java_lang_Object;

//객체 비교(Object 예제)

public class _02_Member {
	public String id;
	
	public _02_Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {		// 매개변수 다형성
		if(obj instanceof _02_Member) {		// Member로 객체 생성
			_02_Member member = (_02_Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode();
	}	
	
	
}
