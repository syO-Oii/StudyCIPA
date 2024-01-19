package day_06;

public class _02_Car {
	String company;
	String model;
	String color;
	int cc;
	double price;
	int maxSpeed;
	
	// 생성자
	public _02_Car() {
		System.out.println("Car()");
	}
	
	public _02_Car(String company) {
		this.company = company;
	}
	
	public _02_Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
		
	public _02_Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	
	public _02_Car(String company, String model, String color, int cc) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.cc = cc;
	}

	
	
	
	public _02_Car(String company, String model, String color, int cc, double price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.cc = cc;
		this.price = price;
	}

	
	
	public _02_Car(String company, String model, String color, int cc, double price, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.cc = cc;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}

	// 마우스 우클릭 -> Source -> Generate toString()
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", cc=" + cc + ", price=" + price
				+ ", maxSpeed=" + maxSpeed + "]";
	}
	

}
