package com.ravie.learnspringframework.gamingconsolewithspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ravie.learnspringframework.gamingconsole.GameRunner;
import com.ravie.learnspringframework.gamingconsole.GamingConsole;
import com.ravie.learnspringframework.gamingconsole.PacMan;

@Configuration
public class GamingConfiguration {
 
	//This Bean returns a PacMan game
	@Bean
	public GamingConsole game() {
		var gamingConsole = new PacMan();
		return gamingConsole;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {   //passing Bean for autowiring
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
}
