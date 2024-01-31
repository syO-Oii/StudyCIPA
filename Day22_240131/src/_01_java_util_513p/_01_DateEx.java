package _01_java_util_513p;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class _01_DateEx {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		System.out.println(sdf.format(now));
		
		// 이 유형을 추천함
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
	}
}
