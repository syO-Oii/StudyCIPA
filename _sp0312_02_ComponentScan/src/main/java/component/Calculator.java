package component;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	double a = 0.0;
	double b = 0.0;
	
	public double add(double a, double b) {
		return a + b;
	}
}
