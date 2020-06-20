package main;

import java.awt.Color;
import java.awt.Graphics;

class Paddle extends Rectangle implements DisplayElement {
	public static final int SCREEN_WIDTH = 800;
	public static final double PADDLE_WIDTH = 60.0;
	public static final double PADDLE_HEIGHT = 20.0;
	public static final double PADDLE_VELOCITY = 0.6;

	public static final double FT_STEP = 1.0;
	double velocity = 0.0;

	public Paddle(double x, double y) {
		this.x = x;
		this.y = y;
		this.sizeX = PADDLE_WIDTH;
		this.sizeY = PADDLE_HEIGHT;
	}

	void update() {
		x += velocity * FT_STEP;
	}

	void stopMove() {
		velocity = 0.0;
	}

	void moveLeft() {
		if (left() > 0.0) {
			velocity = -PADDLE_VELOCITY;
		} else {
			velocity = 0.0;
		}
	}

	void moveRight() {
		if (right() < SCREEN_WIDTH) {
			velocity = PADDLE_VELOCITY;
		} else {
			velocity = 0.0;
		}
	}
	double getWidth() {
		return PADDLE_WIDTH;
	}
	double getHeigt() {
		return PADDLE_HEIGHT;
	}
	double getVelocity() {
		return PADDLE_VELOCITY;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect((int) (left()), (int) (top()), (int) sizeX, (int) sizeY);
	}

}