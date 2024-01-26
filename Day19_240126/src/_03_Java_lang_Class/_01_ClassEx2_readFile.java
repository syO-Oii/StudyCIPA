package _03_Java_lang_Class;


class Car { }


public class _01_ClassEx2_readFile {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Car.class;
		String photo1Path = clazz.getResource("photo2.jpg").getPath();
		System.out.println(photo1Path);
		
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		System.out.println(photo2Path);
		
		
	}
}
