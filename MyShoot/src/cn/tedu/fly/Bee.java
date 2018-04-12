package cn.tedu.fly;

import java.util.Random;

public class Bee extends FlyingObject implements Award,GetScore {
	private int xSpeed = 3;
	private int ySpeed = 3;
	private int Awardtype;
	private int beeScore = 0;
	Bee(){
		Random rand = new Random();
		life = rand.nextInt(10)<3?5:1;	
		if(life == 5) {
			beeScore = 40;
		}else {	
			beeScore = 5;
		}
		image = ShootGame.bee;
		width = image.getWidth();
		height = image.getHeight() ;
		
		x = rand.nextInt(ShootGame.WIDTH - width);
		y = -height;
		Awardtype = rand.nextInt(2);
	}
	public int getAward() {
		return Awardtype;
	}
	
	public int getScore() {
		return beeScore;
	}
	public void step() {
		x += xSpeed;
		y += ySpeed;
		if(x > ShootGame.WIDTH - width) {
			xSpeed = -1;
		}
		if(x<= 0) {
			xSpeed = 1;
		}
	}
	
	public boolean outOfBounds() {
		if(this.y > ShootGame.HEIGHT) {
			return true;		
		}	
		return false;
	}
}
