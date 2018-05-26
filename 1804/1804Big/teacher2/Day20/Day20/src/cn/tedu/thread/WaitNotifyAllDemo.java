package cn.tedu.thread;

public class WaitNotifyAllDemo {

	public static void main(String[] args) {

		Student s = new Student();
		s.name = "如花";
		s.gender = '女';

		new Thread(new Ask2(s)).start();
		new Thread(new Ask2(s)).start();
		new Thread(new Change2(s)).start();
		new Thread(new Change2(s)).start();

	}

}

class Change2 implements Runnable {

	private Student s;

	public Change2(Student s) {
		this.s = s;
	}

	@Override
	public void run() {

		while (true) {

			synchronized (s) {
				// 因为当前线程需要为false的时候才能执行
				// 所以为true的时候需要等待
				while (s.flag == true) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (s.gender == '男') {
					s.name = "如花";
					s.gender = '女';
				} else {
					s.name = "周星星";
					s.gender = '男';
				}
				s.flag = true;
				s.notifyAll();
			}

		}

	}

}

class Ask2 implements Runnable {

	private Student s;

	public Ask2(Student s) {
		this.s = s;
	}

	@Override
	public void run() {

		while (true) {

			synchronized (s) {
				// 因为这个线程在开关状态为true的时候才能执行
				// 所以为false的时候需要等待
				while (s.flag == false)
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				System.out.println("老师，我是" + s.name + "，我是" + s.gender);
				System.out.println("请教一个问题~~~");
				s.flag = false;
				// 表示唤醒一个在等待的线程
				s.notifyAll();
			}
		}

	}

}
