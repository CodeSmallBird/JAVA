package cn.tedu.fly;
import java.awt.image.BufferedImage;



public class Hero extends FlyingObject {
	private BufferedImage[] images = {};
	private int index = 0;
	private int doubleFire;
	Hero(){
		life =3;
		images = new BufferedImage[] {ShootGame.hero0,ShootGame.hero1};
		image = ShootGame.hero0;
		width = image.getWidth();
		height = image.getHeight();
		doubleFire = 10;
		x = 150;
		y = 400;
	}
	public int isDoublefire() {
		return doubleFire;
	}
	
	public void setDoubleFire(int doubleFire) {
		this.doubleFire = doubleFire;
	}
	
	public void addDoubleFire() {
		doubleFire += 40;
		System.out.print("DoubleFire ");
	}
		
	public void addLife() {
		life++;
	}
	
	public void moveTo(int x ,int y) {
		this.x = x-this.width/2;
		this.y = y-this.height/2;
	}
	
	public boolean outOfBounds() {
		return false;
	}
	
	public void clearFire() {
		this.doubleFire = 0;
	}
	public Bullet[] shoot() {
		Bullet[] bs;
		int xStep = this.width/4;
		int yStep = 20;
		if(doubleFire>0) {
			bs = new Bullet[2];
			bs[0] = new Bullet(this.x+1*xStep,this.y-yStep);
			bs[1] = new Bullet(this.x+3*xStep,this.y-yStep);
			doubleFire -= 2;
		}else {
			bs = new Bullet[1];
			bs[0] = new Bullet(this.x+2*xStep,this.y-yStep);
		}
		return bs;
	}
	
	public void step() {
		if(images.length>0) {
			image = images[index++ /10 % images.length];
		}else {
			image = images[0];
		}
	}
	
	public boolean hit(FlyingObject other) {	
		int x1 = other.x - this.width/2;                 //x坐标最小距离
		int x2 = other.x + this.width/2 + other.width;   //x坐标最大距离
		int y1 = other.y - this.height/2;                //y坐标最小距离
		int y2 = other.y + this.height/2 + other.height; //y坐标最大距离
	
		int herox = this.x + this.width/2;               //英雄机x坐标中心点距离
		int heroy = this.y + this.height/2;              //英雄机y坐标中心点距离
		
		return herox>x1 && herox<x2 && heroy>y1 && heroy<y2;   //区间范围内为撞上了
	}
}
