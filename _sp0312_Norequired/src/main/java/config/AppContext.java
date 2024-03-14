package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import autoEx.Car;
import autoEx.Engine;
import autoEx.Tire;

@Configuration
public class AppContext {
	
	@Bean
	public Car car() {
		return new Car();
	}
	
	@Bean
	public Engine engine() {
		return new Engine();
	}
	
	@Bean
	public Tire tire() {
		return new Tire();
	}

	@Bean
    public String tirePosition() {
        return "왼쪽 앞";
    }
}
