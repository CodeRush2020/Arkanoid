package main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
class Brick extends Rectangle implements DisplayElement, Subject {
	private ArrayList<Observer> observers;
	public static final double BLOCK_WIDTH = 60.0;
	public static final double BLOCK_HEIGHT = 20.0;

	boolean destroyed = false;

	Brick(double x, double y) {
		this.x = x;
		this.y = y;
		this.sizeX = BLOCK_WIDTH;
		this.sizeY = BLOCK_HEIGHT;
		observers=new ArrayList<Observer>();
	}

	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect((int) left(), (int) top(), (int) sizeX, (int) sizeY);
	}
	public double getBlockWidth() {
		return BLOCK_WIDTH;
	}
	public double getBlockHeight(){
		return BLOCK_HEIGHT;
	}
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	public void removeObserver(Observer o) {
		//falta implementar
		//observers.remove(o);
	}
	public void notifyObservers() {
		//observers.remove(o);	
	}
}

