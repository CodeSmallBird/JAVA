package cn.tedu.fly;
import java.util.Random;


public class Airplane extends FlyingObject implements GetScore{
	private int speed = 3;
	private int airScore = 0;
	Airplane(){
		Random rand = new Random();
		life = rand.nextInt(10)<3?3:1;	
		if(life == 3) {
			airScore = 40;
		}else {
			airScore = 5;
		}
		image = ShootGame.airplane;
		width = image.getWidth();
		height = image.getHeight() ;
		
		this.x = rand.nextInt(ShootGame.WIDTH - width);
		this.y = -height;
			
	}
	public int getScore() {
		return airScore;
	}
	
	public void step() {
		this.y += speed;
	}
	
	public boolean outOfBounds() {
		if(this.y > ShootGame.HEIGHT) {
			return true;		
		}	
		return false;
	}
}
