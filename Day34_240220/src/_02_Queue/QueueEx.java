package _02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "강감찬"));
		messageQueue.offer(new Message("sendKakaoTalk", "박말례"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 문자를 보냅니다.");
					break;
				case "sendKakaoTalk":
					System.out.println(message.to + "님에게 카톡을 보냅니다.");
					break;
			}
		}
	}
}
