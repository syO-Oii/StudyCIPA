package _08_Question;

public class _04_Chatting {
	void startChat(String chatId) {
		String nickName = chatId;
		
		class Chat{
			// 메소드
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
			
			void sendMessage(String message) {
			}
		}	
		Chat chat = new Chat();
		chat.start();
	}
}
