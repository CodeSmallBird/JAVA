package cn.tedu.fly;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

//import com.tarena.fly.Bullet;
//import com.tarena.fly.FlyingObject;
//import com.tarena.fly.Hero;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import java.util.Arrays;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ShootGame extends JPanel{

	public static final int WIDTH 	= 400;
	public static final int HEIGHT 	= 654;
	
	private Timer timer; // 定时器
	private int intervel = 1000 / 100; // 时间间隔(毫秒)
	public static BufferedImage background;
	public static BufferedImage bee;
	public static BufferedImage bullet;
	public static BufferedImage gameover;
	public static BufferedImage hero0;
	public static BufferedImage hero1;
	public static BufferedImage airplane;
	public static BufferedImage pause;
	public static BufferedImage start;
	
	public static final int START = 0;
	public static final int RUN = 1;
	public static final int PAUSE = 2;
	public static final int GAME_OVER = 3;
	
	static{
		try {
			
			background 	= ImageIO.read(ShootGame.class.getResource("background.png"));
			bee 		= ImageIO.read(ShootGame.class.getResource("bee.png"));
			bullet 		= ImageIO.read(ShootGame.class.getResource("bullet.png"));
			gameover 	= ImageIO.read(ShootGame.class.getResource("gameover.png"));
			hero0 		= ImageIO.read(ShootGame.class.getResource("hero0.png"));
			hero1 		= ImageIO.read(ShootGame.class.getResource("hero1.png"));
			airplane 	= ImageIO.read(ShootGame.class.getResource("airplane.png"));
			pause 		= ImageIO.read(ShootGame.class.getResource("pause.png"));
			start 		= ImageIO.read(ShootGame.class.getResource("start.png"));
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private Hero hero = new Hero(); // 英雄机
	private Bullet[] bullets = {};
	private FlyingObject[] flyings = {};
	private int score = 0; // 得分
	private int state = START;
	
	public FlyingObject nextOne() {
		Random rand = new Random();
		return (rand.nextInt(10)<3? new Bee():new Airplane());
	}
	
	int flyEnteredIndex = 0;
	public void enterAction() {
		flyEnteredIndex++;
		if(flyEnteredIndex % 40 == 0) {
			FlyingObject obj = nextOne();
			flyings = Arrays.copyOf(flyings, flyings.length+1);
			flyings[flyings.length-1] = obj;
		}
	}
	public void stepAction() {
		hero.step();
		for(int i=0;i<bullets.length;i++) {
			bullets[i].step();
		}
		for(int i=0;i<flyings.length;i++) {
			flyings[i].step();
		}
	}
	
	
	public void outOfBoundsAction() {
		int flyingsIndex = 0;
		FlyingObject [] flyingLives = new FlyingObject[flyings.length];
		for(int i=0;i<flyings.length;i++) {
			if(!flyings[i].outOfBounds()) {
				flyingLives[flyingsIndex] = flyings[i];
				flyingsIndex++;
			}
		}
		flyings = Arrays.copyOf(flyingLives,flyingsIndex);
		int bulletsIndex = 0;
		Bullet [] bulletLives = new Bullet[bullets.length];
		for(int i=0;i<bullets.length;i++) {
			if(!bullets[i].outOfBounds()) {
				bulletLives[bulletsIndex] = bullets[i];
				bulletsIndex++;
			}
		}
		bullets = Arrays.copyOf(bulletLives,bulletsIndex);
	}
	
	int shootIndex = 0;
	public void shootAction() {
		shootIndex++;
		if(shootIndex % 30 == 0) {
			Bullet[] bs = hero.shoot();
			bullets = Arrays.copyOf(bullets, bullets.length+bs.length);
			System.arraycopy(bs, 0, bullets, bullets.length-bs.length , bs.length);
		}	
	}
	
	public boolean bang(Bullet b) {
		for(int j=0;j<flyings.length;j++) {
			FlyingObject fly = flyings[j];
			if(fly.shootBy(b)) {
				fly.subtractLife();
				if(fly.getLife() <= 0) {
					if(fly instanceof Bee) {
						Bee e = (Bee)fly;
						score += e.getScore();
						switch(e.getAward()) {
						case Award.DOUBLE_FIRE:
							hero.addDoubleFire();
							break;
						case Award.LIFE:
							hero.addLife();
							break;
						default:
							break;
						
						}
					}else if(fly instanceof GetScore) {
						GetScore e = (GetScore)fly;
						score += e.getScore();
					}
					FlyingObject flyReplace = flyings[j];
					flyings[j] = flyings[flyings.length-1];
					flyings[flyings.length-1] = flyReplace;
					flyings = Arrays.copyOf(flyings, flyings.length-1);
				}
				return true;
			}
		}
		return false;
	}
	
	public void bangAction() {
		Bullet [] bulletLives = new Bullet[bullets.length];
		int bulletIndex = 0;
		for(int i=0;i<bullets.length;i++) {
			Bullet b = bullets[i];
			if(!bang(b)) {
				bulletLives[bulletIndex] = bullets[i];
				bulletIndex++;
			}
		}		
		bullets = Arrays.copyOf(bulletLives,bulletIndex);	
	}
	
	public void hitAction() {
		for(int i=0;i<flyings.length;i++) {
			FlyingObject flys = flyings[i];
			if(hero.hit(flys)) {
				flyings[i] = flyings[flyings.length-1];
				flyings[flyings.length-1] = flys;
				flyings = Arrays.copyOf(flyings, flyings.length-1);
				hero.subtractLife();
				hero.clearFire();
			}
		}
	}
	public void checkGameOverAction() {
		hitAction();
		if(hero.getLife()<1) {
			state = GAME_OVER;
		}
	}
	public void action() {
		MouseAdapter l = new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				if(state == RUN) {
					int x = e.getX();
					int y = e.getY();
					hero.moveTo(x, y);
				} 
			}
			
			public void mouseClicked(MouseEvent e) { // 鼠标点击
				switch (state) {
				case START:
					state = RUN; // 启动状态下运行
					break;
				case GAME_OVER: // 游戏结束，清理现场
					state = START; // 启动状态下运行
					flyings = new FlyingObject[0]; // 清空飞行物
					bullets = new Bullet[0]; // 清空子弹
					hero = new Hero(); // 重新创建英雄机
					score = 0; // 清空成绩
					state = START; // 状态设置为启动
					break;
				}
			}
			
			public void mouseExited(MouseEvent e) { 
				if(state == RUN) {
					state = PAUSE;
				}
			}
			
			public void mouseEntered(MouseEvent e) { 
				if(state == PAUSE) {
					state = RUN;
				}
			}
			
		};
		this.addMouseListener(l);
		this.addMouseMotionListener(l);	
		
		timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				if (state == RUN) { // 运行状态
					enterAction(); // 飞行物入场
					stepAction(); // 走一步
					shootAction(); // 英雄机射击
					bangAction(); // 子弹打飞行物
					outOfBoundsAction(); // 删除越界飞行物及子弹
					checkGameOverAction(); // 检查游戏结束
				}
				repaint(); // 重绘，调用paint()方法
			}
			},intervel,intervel);
		
	}
	
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, null);
		paintHero(g);
		paintBullets(g);
		paintFlyingObjects(g);
		paintScore(g);
		switch(state) {
		case START:
			paintSTART(g);
			break;
		case RUN:
			
			break;
		case PAUSE:
			paintPause(g);
			break;
		case GAME_OVER:
			paintGameOver(g);
			break;
		default:
			break;
		}
	}
	
	public void paintHero(Graphics g) {
		g.drawImage(hero.getImage(),hero.getX(), hero.getY(),null);
	}
	
	public void paintBullets(Graphics g) {
		for(int i = 0 ;i<bullets.length;i++) {
			Bullet b = bullets[i];
			g.drawImage(b.getImage(),b.getX()- b.getWidth()/2,b.getY(),null);
		}
	}
	
	public void paintFlyingObjects(Graphics g) {
		for(int i =0; i<flyings.length;i++) {
			FlyingObject f = flyings[i];
			g.drawImage(f.getImage(),f.getX(),f.getY(),null);
		}
	}
	
	public void paintSTART(Graphics g) {
		g.drawImage(start,0, 0,null);
	}
	
	public void paintGameOver(Graphics g) {
		g.drawImage(gameover,0, 0,null);
	}
	
	public void paintPause(Graphics g) {
		g.drawImage(pause,0, 0,null);
	}
	public void paintScore(Graphics g) {
		int x = 10;
		int y = 25;
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 24);
		g.setColor(new Color(0xFF0000));
		g.setFont(font);
		g.drawString("SCORE:   "+score,x, y);
		y += 40;
		g.drawString("LIFE:   "+hero.getLife(),x, y);
		
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Fly");
		ShootGame game = new ShootGame();
		frame.add(game);
		frame.setSize(WIDTH, HEIGHT); // 设置大小
		frame.setAlwaysOnTop(true); // 设置其总在最上
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 默认关闭操作
		frame.setIconImage(new ImageIcon("images/icon.jpg").getImage()); // 设置窗体的图标
		frame.setLocationRelativeTo(null); // 设置窗体初始位置
		frame.setVisible(true); // 尽快调用paint
		
		game.action(); // 启动执行	
	}

}
