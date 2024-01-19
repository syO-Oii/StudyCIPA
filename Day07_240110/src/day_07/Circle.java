package day_07;

public class Circle {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this(radius, "");
	}
	
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle(10);
		
		pizza.radius = 10;
		pizza.name = "인생피자";
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 : " + area);
		
		Circle donut = new Circle(2);
		donut.radius = 2;
		donut.name = "또 넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 : " + area);
		
	}

}
