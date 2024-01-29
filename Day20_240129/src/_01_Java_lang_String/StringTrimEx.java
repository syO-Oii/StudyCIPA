package _01_Java_lang_String;

public class StringTrimEx {
	public static void main(String[] args) {
		String str = "          가나   다            ..";
		System.out.println(str.length());
		System.out.println(str);
		System.out.println(str.trim().length());
		System.out.println(str.trim());
		
	}
}
