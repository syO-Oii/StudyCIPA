package _01_Java_lang_String;

public class _01_ByteToString {
	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);	// 6 : 인덱스 위치, 4 : 인덱스로부터 4개
		System.out.println(str2);
		
		char[] chars = {'H', 'e', 'l', 'l', 'o'};
		String str3 = new String(chars);
		System.out.println(str3);
	}
}
