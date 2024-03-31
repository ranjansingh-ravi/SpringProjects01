package com.ravie.learnspringframework.game;

public class GameRunner {
	
	//MarioGame game;
	GamingConsole game;
	
	//	MarioGame game = new MarioGame(); in instance variable we dont initialize objects we just
	// inform that class expects an object of mentioned type, now in constructor or any other method
	// we would need to create the object

	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	

	public void run() {
		
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
