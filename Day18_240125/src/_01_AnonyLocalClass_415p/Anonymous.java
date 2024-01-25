package _01_AnonyLocalClass_415p;

public class Anonymous {
	int field;
	
	void method(int arg1, int arg2) {
		int var1 = 0;
		int var2 = 0;
		
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		calc.sum();
	}
	
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.method(10, 10);	
	}
}
