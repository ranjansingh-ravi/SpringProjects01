package com.ravie.learnspringframework.game;

public class GameRunner {
	
	//MarioGame game;
	SuperContra game;
	
	//	MarioGame game = new MarioGame(); in instance variable we dont initialize objects we just
	// inform that class expects an object of mentioned type, now in constructor or any other method
	// we would need to create the object

	public GameRunner(SuperContra game) {
		this.game = game;
	}
	
	

	public void run() {
		
		System.out.println("Mario Game Running" + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
