package cn.tedu.jdk5;

public class EnumDemo {

	public static void main(String[] args) {

		Season s = Season.Spring;

		// 从JDK1.5开始，允许使用枚举常量
		switch (s) {
		case Spring:
			System.out.println("春季");
			break;
		case Summer:
			System.out.println("夏季");
			break;
		case Winter:
			System.out.println("冬季");
			break;
		case Autumn:
			System.out.println("秋季");
			break;
		default:
			break;
		}

	}

}

// 枚举本身是一个特殊的抽象类
enum Season {

	// 默认将构造方法私有化
	// 枚举常量
	// 枚举常量之间用 , 隔开
	// 枚举常量必须放在枚举类的首行
	// public static final Season Spring = new Season();
	// public static final Season Summer = new Season(5);
	Spring() {

		@Override
		public void play() {
			System.out.println("放风筝~~~");
		}

	},
	Summer(5) {
		@Override
		public void play() {
			System.out.println("游泳~~~");
		}
	},
	Autumn {
		@Override
		public void play() {
			System.out.println("爬山~~~");
		}
	},
	Winter {
		@Override
		public void play() {
			System.out.println("滑雪~~~");
		}
	};

	private Season() {
	}

	private Season(int month) {
		this.month = month;
	}

	private int month;

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth() {
		return month;
	}

	public abstract void play();

}

// class Season {
//
// // 将构造方法私有之后，在类外就不能随意创建对象
// private Season() {
// }
//
// static final Season Spring = new Season();
// static final Season Summer = new Season();
// static final Season Autumn = new Season();
// static final Season Winter = new Season();
//
// }

// class Month {
//
// private Month(){}
//
// static final Month January = new Month();
//
// }