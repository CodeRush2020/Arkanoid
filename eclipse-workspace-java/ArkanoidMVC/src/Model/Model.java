package Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;


public class Model extends Observable {
    private int x, y, width, height, velocity;
    private static final int PADDLE_WIDTH = 60, PADDLE_HEIGHT = 20;
    public static final int BLOCK_WIDTH = 60, BLOCK_HEIGHT = 20;
    public static final int BALL_RADIUS = 10, BALL_VELOCITY = 4;

    public static boolean dead = false;
    public static boolean win = false;

    public int score = 0;

    public List<Block> blocks;
    public Ball ball;
    public PowerUpBehavior risePaddle;
    public PowerUpBehavior reducePaddle;
    public PowerUpBehavior invisiblePaddle;
    
    public Model() {
        this.width = PADDLE_WIDTH;
        this.height = PADDLE_HEIGHT;
        blocks = new ArrayList<>();
        ball = new Ball(400, 350);
        risePaddle = new RisePaddle();
        reducePaddle = new ReducePaddle();
        invisiblePaddle = new InvisiblePaddle();
        //ball = new Ball(300, 250);
    }

    public void addBlock(int x, int y) {
    	
        Block block= new Block(x,y);
        CrunchSound crunchsound = new CrunchSound(block);
        blocks.add(block);
        setChanged();
        notifyObservers();
    }
    public Block getBlock(int idList) {
    	Block tempBlock;
    	tempBlock= blocks.get(idList);
        return tempBlock;
    }

    public void clean() {
        blocks.clear();

        setChanged();
        notifyObservers();
    }

    public void win() {
        Model.win = true;

        setChanged();
        notifyObservers();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;

        setChanged();
        notifyObservers();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;

        setChanged();
        notifyObservers();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;

        setChanged();
        notifyObservers();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;

        setChanged();
        notifyObservers();
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;

        setChanged();
        notifyObservers();
    }

    public void ballUpdate() {
        ball.update();

        setChanged();
        notifyObservers();
    }

    public void update() {
        this.x += this.velocity;

        setChanged();
        notifyObservers();
    }

    public void collision1() {
        ball.testCollision2(this, ball);

        setChanged();
        notifyObservers();
    }

    public void collisionBlocks() {
        Iterator<Block> it = blocks.iterator();
        while (it.hasNext()) {
            Block block = it.next();
            ball.testCollision(block, ball);

            if (block.destroyed) {
                score++;
                it.remove();
                if(block.getSpecialBlockFlag()==1) {
                	risePaddle.powerUp(this);
                }
                if(block.getSpecialBlockFlag()==2) {
                	reducePaddle.powerUp(this);
                }
                if(block.getSpecialBlockFlag()==3) {
                	invisiblePaddle.powerUp(this);
                }
            }
        }

        setChanged();
        notifyObservers();
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
}
