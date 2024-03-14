package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import spring.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx 
	      = new AnnotationConfigApplicationContext(AppCtx.class);
		Client client = ctx.getBean(Client.class);
		client.send();
		ctx.close();
	}

}
