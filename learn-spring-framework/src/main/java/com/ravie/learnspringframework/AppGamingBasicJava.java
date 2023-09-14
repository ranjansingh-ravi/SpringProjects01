package com.ravie.learnspringframework;

import com.ravie.learnspringframework.game.GameRunner;
import com.ravie.learnspringframework.game.MarioGame;
import com.ravie.learnspringframework.game.SuperContra;

public class AppGamingBasicJava {
	/*
	 * var keyword in introduced in java 10 that allows to create local variables without explicitly 
	 * specifying their data type. Compiler decides the datatype of the container from the value assigned.
	 * 
	 * var can only be used for local variables they cant be used in method parameters, instance variable
	 * or class variables(fields)
	 */
	
	
	public static void main(String[] args) {
		
		
		var supercontra = new SuperContra();
		var gamerunner = new GameRunner(supercontra);
		
		gamerunner.run();
		
	
	}

}
  