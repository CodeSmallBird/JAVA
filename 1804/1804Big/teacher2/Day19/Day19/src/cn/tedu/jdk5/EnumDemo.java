package cn.tedu.jdk5;

public class EnumDemo {

	public static void main(String[] args) {

		Season s = Season.Spring;

		// ��JDK1.5��ʼ������ʹ��ö�ٳ���
		switch (s) {
		case Spring:
			System.out.println("����");
			break;
		case Summer:
			System.out.println("�ļ�");
			break;
		case Winter:
			System.out.println("����");
			break;
		case Autumn:
			System.out.println("�＾");
			break;
		default:
			break;
		}

	}

}

// ö�ٱ�����һ������ĳ�����
enum Season {

	// Ĭ�Ͻ����췽��˽�л�
	// ö�ٳ���
	// ö�ٳ���֮���� , ����
	// ö�ٳ����������ö���������
	// public static final Season Spring = new Season();
	// public static final Season Summer = new Season(5);
	Spring() {

		@Override
		public void play() {
			System.out.println("�ŷ���~~~");
		}

	},
	Summer(5) {
		@Override
		public void play() {
			System.out.println("��Ӿ~~~");
		}
	},
	Autumn {
		@Override
		public void play() {
			System.out.println("��ɽ~~~");
		}
	},
	Winter {
		@Override
		public void play() {
			System.out.println("��ѩ~~~");
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
// // �����췽��˽��֮��������Ͳ������ⴴ������
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