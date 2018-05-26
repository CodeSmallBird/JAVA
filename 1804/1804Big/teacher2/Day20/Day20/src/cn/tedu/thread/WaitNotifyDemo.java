package cn.tedu.thread;

public class WaitNotifyDemo {

	public static void main(String[] args) {

		Student s = new Student();
		s.name = "如花";
		s.gender = '女';

		new Thread(new Ask(s)).start();
		new Thread(new Change(s)).start();

	}

}

class Change implements Runnable {

	private Student s;

	public Change(Student s) {
		this.s = s;
	}

	@Override
	public void run() {

		while (true) {

			synchronized (s) {
				// 因为当前线程需要为false的时候才能执行
				// 所以为true的时候需要等待
				if (s.flag == true)
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				if (s.gender == '男') {
					s.name = "如花";
					s.gender = '女';
				} else {
					s.name = "周星星";
					s.gender = '男';
				}
				s.flag = true;
				s.notify();
			}

		}

	}

}

class Ask implements Runnable {

	private Student s;

	public Ask(Student s) {
		this.s = s;
	}

	@Override
	public void run() {

		while (true) {

			synchronized (s) {
				// synchronized (String.class) {
				// 因为这个线程在开关状态为true的时候才能执行
				// 所以为false的时候需要等待
				if (s.flag == false)
					try {
						// String.class.wait();
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				System.out.println("老师，我是" + s.name + "，我是" + s.gender);
				System.out.println("请教一个问题~~~");
				s.flag = false;
				// 表示唤醒一个在等待的线程
				// String.class.notify();
				s.notify();
			}
		}

	}

}

class Student {

	String name;
	char gender;
	// 利用这个第三方变量作为开关，标记两个线程的状态
	// 规定如果为true，就去执行Ask线程，如果为false，则执行Change线程
	// 标记位
	boolean flag = true;

}
