package GreetingTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GreetingTest {
	private Greeting target = new Greeting();
	
	@Test
	public void getMessage_아침인사() {
		String msg = this.target.getMessage(5);
		assertThat(msg, is("좋은 아침입니다~"));
	}
}
