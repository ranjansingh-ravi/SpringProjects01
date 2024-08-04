package com.ravie.learnspringframework.gamingconsolewithspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ravie.learnspringframework.gamingconsole.GameRunner;
import com.ravie.learnspringframework.gamingconsole.GamingConsole;

public class App03GamingSpringBean {
	
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
		// context.getBean("game").up(); This wont work, because of the way spring works.Here we are looking for a 
		// bean named "game". Spring is still not sure what is the type of object that will be returned with this bean name. Thus
		// we can't call specific methods
		
		//loading game to console
		context.getBean(GamingConsole.class).up(); // but this can call up() method because here we are specifically looking for bean
		                                           // that returns Bean (managed instance) of type GamingConsole.class which has up() method
		//running the game
		context.getBean(GameRunner.class).run();
	 }
	}

}
