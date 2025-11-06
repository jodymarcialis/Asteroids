package main;

import Game.AsteroidsGame;
import Game.Display;

public class Main {

	public static void main(String[] args) {
		
		AsteroidsGame asteroidsGame = new AsteroidsGame();
        Display display = new Display(asteroidsGame);
        display.start();

	}

}
