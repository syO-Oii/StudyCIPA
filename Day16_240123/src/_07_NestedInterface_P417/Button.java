package _07_NestedInterface_P417;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	// 중첩 인터페이스
	static interface OnClickListener{
		void onClick();
	}
	
}
