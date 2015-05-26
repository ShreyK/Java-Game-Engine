package Engine;

import java.applet.Applet;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GameLauncher extends Applet {

	private static Game game = new Game();

	public void init() {
		setLayout(new BorderLayout());
		add(game, BorderLayout.CENTER);
		setMaximumSize(Game.DIMENSIONS);
		setMinimumSize(Game.DIMENSIONS);
		setPreferredSize(Game.DIMENSIONS);
	}

	@Override
	public void start() {
		game.start();
	}

	@Override
	public void stop() {
		game.stop();
	}

	public static void main(String[] args) {
		game.setMinimumSize(Game.DIMENSIONS);
		game.setMaximumSize(Game.DIMENSIONS);
		game.setPreferredSize(Game.DIMENSIONS);

		game.frame = new JFrame(Game.NAME);

		game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.frame.setLayout(new BorderLayout());

		game.frame.add(game, BorderLayout.CENTER);
		game.frame.pack();

		game.frame.setResizable(false);
		game.frame.setLocationRelativeTo(null);
		game.frame.setVisible(true);

		game.start();
	}
}