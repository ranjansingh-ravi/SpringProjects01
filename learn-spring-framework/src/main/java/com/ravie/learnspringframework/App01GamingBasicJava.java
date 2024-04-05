package com.ravie.learnspringframework;

import com.ravie.learnspringframework.game.GameRunner;
import com.ravie.learnspringframework.game.MarioGame;
import com.ravie.learnspringframework.game.PacMan;
import com.ravie.learnspringframework.game.SuperContra;

public class App01GamingBasicJava {
	/*
	 * var keyword in introduced in java 10 that allows to create local variables without explicitly 
	 * specifying their data type. Compiler decides the datatype of the container from the value assigned.
	 * 
	 * var can only be used for local variables they cant be used in method parameters, instance variable
	 * or class variables(fields)
	 */
	
	
	public static void main(String[] args) {
		
		
		//var game = new SuperContra();
		//var game = new MarioGame();
		var game = new PacMan();  // 1. Object Creation of PacMan class
		var gamerunner = new GameRunner(game);
		              // 2. object creation of GameRunner class and initialization with Game object
		              // this initialization or passing of game object to Gamerunner is known as wiring of dependencies 
		              // game is a dependency of GameRunner
		
		gamerunner.run();
		
	
	}

}
   