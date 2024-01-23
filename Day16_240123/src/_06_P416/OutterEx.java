package _06_P416;

import _06_P416.Outter.Nested;

public class OutterEx {
	public static void main(String[] args) {
		Outter outter = new Outter();
		Nested nested = outter.new Nested();
		
		nested.print();
	}
}
