package Model;

import java.util.ArrayList;

public class Block implements Subject{
    private int x, y, width = Model.BLOCK_WIDTH, height = Model.BLOCK_HEIGHT;
    public boolean destroyed = false;
    private ArrayList <Observer> observers;
   // public boolean specialBlockFlag = false;
    public int specialBlockFlag = 0;
/*
 * 0:simple, 1: aumentar, 2:Reducir, 3:Invisible
 */
    public Block(int x, int y) {
        this.x = x;
        this.y = y;
        observers = new ArrayList <Observer>();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    double left() {
        return x - width / 2.0;
    }

    double right() {
        return x + width / 2.0;
    }

    double top() {
        return y - height / 2.0;
    }

    double bottom() {
        return y + height / 2.0;
    }
    
    public void setSpecialBlockFlag(int state) {
    	this.specialBlockFlag=state;
    }
    public int getSpecialBlockFlag() {
    	return this.specialBlockFlag;
    }

    public void registerObserver (Observer o) {
        observers.add(o);
    }

    public void removeObserver (Observer o) {

    }

    public void notifyObservers() {
        for(int i=0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update();
            }
    }   
	
}
