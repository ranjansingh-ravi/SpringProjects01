package com.ravie.learnspringframework.game;

public class PacMan implements GamingConsole{
	
	public void up () {
		System.out.println("Pacman Jump");
	}

	public void down () {
		System.out.println("Pacman Duck");
	}
	public void left () {
		System.out.println("Pacman Go Back");
	}
	public void right () {
		System.out.println("Pacman Move forward");
	}

}
