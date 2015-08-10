package game;

import java.awt.event.KeyEvent;

import game.input.Controller;

public class Game {
	public Controller controls;

	public Game() {
		controls = new Controller();
	}

	public void tick(boolean[] key) {
		boolean forward = key[KeyEvent.VK_W];
		boolean back = key[KeyEvent.VK_S];
		boolean left = key[KeyEvent.VK_A];
		boolean right = key[KeyEvent.VK_D];

		controls.tick(forward, back, left, right);
	}
}
// int anim = (int) (Math.sin((System.currentTimeMillis() + i * 2) % 2000.0 /
// 1000 * Math.PI * 2) * 100);
// int anim2 = (int) (Math.cos((System.currentTimeMillis() + i * 2) % 2000.0 /
// 1000 * Math.PI * 2) * 100);