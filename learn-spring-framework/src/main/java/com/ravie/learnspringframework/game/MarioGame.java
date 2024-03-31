package com.ravie.learnspringframework.game;

public class MarioGame implements GamingConsole{
	
	public void up () {
		System.out.println("Jump");
	}

	public void down () {
		System.out.println("duck/go down the hole");
	}
	public void left () {
		System.out.println("Go Back");
	}
	public void right () {
		System.out.println("accelerate");
	}
}
