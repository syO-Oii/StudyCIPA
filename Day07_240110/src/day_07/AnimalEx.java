package day_07;

public class AnimalEx {
	public static void main(String[] args) {
		Animal tiger = new Animal();
		tiger.setName("호랑이");
		tiger.setAge(3);
		System.out.println("동물 이름 : " + tiger.getName() + " / 나이 : " + tiger.getAge());
	}
	
}
