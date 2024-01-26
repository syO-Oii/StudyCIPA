package _01_Java_lang_Object;

public class _01_ObjEx {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		// 내용이 같은가?
		boolean result = obj1.equals(obj2);
		System.out.println(result);		// false
		
		// 같은 객체 주소를 참고하는가?
		result = obj1 == obj2;			
		System.out.println(result);		// false
		
		String str1 = new String("가나다");
		String str2 = new String("가나다");
		
		System.out.println(str1 == str2);		// 주소 값이 같은가? false
		System.out.println(str1.equals(str2));	// 내용이 같은가?	 true
		
		
		
		
		
		/* [ 위의 결과가 나오는 이유 ]
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}
	
	
}
