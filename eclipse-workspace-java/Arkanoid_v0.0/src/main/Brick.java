package main;

import java.awt.Color;
import java.awt.Graphics;

class Brick extends Rectangle {
	public static final int SCREEN_WIDTH = 800;
	public static final int SCREEN_HEIGHT = 600;

	public static final double BALL_RADIUS = 10.0;
	public static final double BALL_VELOCITY = 0.7;

	public static final double PADDLE_WIDTH = 60.0;
	public static final double PADDLE_HEIGHT = 20.0;
	public static final double PADDLE_VELOCITY = 0.6;

	public static final double BLOCK_WIDTH = 60.0;
	public static final double BLOCK_HEIGHT = 20.0;

	public static final int COUNT_BLOCKS_X = 11;
	public static final int COUNT_BLOCKS_Y = 4;

	public static final int PLAYER_LIVES = 5;

	public static final double FT_SLICE = 1.0;
	public static final double FT_STEP = 1.0;
	boolean destroyed = false;

	Brick(double x, double y) {
		this.x = x;
		this.y = y;
		this.sizeX = BLOCK_WIDTH;
		this.sizeY = BLOCK_HEIGHT;
	}

	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect((int) left(), (int) top(), (int) sizeX, (int) sizeY);
	}
}
