package _01_Java_lang_Object;

// 객체 해시코드(hashcode) 비교 예제
public class _03_Key {
	public int number;
	
	public _03_Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof _03_Key) {
			_03_Key compareKey = (_03_Key) obj;
			
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	// --------------------------------------------------
	// 여기까지만 하면 저장된 값을 찾아오지 못함
	// 따라서 동일한 해시코드를 리턴해주는 내용을 추가해야함.
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return number;
	}
	
	
	
	
}
