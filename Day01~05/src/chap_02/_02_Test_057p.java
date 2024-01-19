package chap_02;

public class _02_Test_057p {
	public static void main(String[] args) {
		int v1 = 0;
		if(true) {
			int v2 = 0;
			if(true) {
				int v3 = 0;
				v1 = 1;
				v2 = 1;
				v3 = 1;
				v1 = v2 + v3;	// v3은 해당 블록에서만 동작하게 되므로 블록을 벗어나는 순간 사용 불가
			}
			// v1 = v2 + v3; 따라서 여기가 아닌 위의 위치로 해당 코드를 이동 해 주어야 함
		}
		System.out.println(v1);
	}

}
