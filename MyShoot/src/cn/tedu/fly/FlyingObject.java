package cn.tedu.fly;
import java.awt.image.BufferedImage;
public abstract class FlyingObject {
	int x;
	int y;
	int width;
	int height;
	int life;
	BufferedImage image;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y =y;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setwidht(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public BufferedImage getImage() {
		return this.image;
	}
	
	public void subtractLife() {
		life--;
	}
	
	public int getLife() {
		return life;
	}
	
	
	public abstract void step();
	
	public abstract boolean outOfBounds();
	
	public boolean shootBy(Bullet bullet){
		int x1 = this.x;
		int x2 = this.x + width;
		int y1 = this.y;
		int y2 = this.y +height;		
		return ((bullet.x>x1 && bullet.x<x2)&&(bullet.y>y1 && bullet.y<y2));
	}
}
