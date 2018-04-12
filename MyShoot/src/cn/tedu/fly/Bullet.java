package cn.tedu.fly;

public class Bullet extends FlyingObject {
	private int speed =3 ;
	Bullet(int x,int y){
		image = ShootGame.bullet;
		width = image.getWidth();
		height = image.getHeight() ;
		this.x = x;
		this.y = y;	
	}
	
	public void step() {
		this.y -= speed;
	}
	
	public boolean outOfBounds() {
		if(this.y < -height) {
			return true;		
		}	
		return false;
	}
}
