package cn.tedu.singleton;

public class SingleTonDemo {

	public static void main(String[] args) {

		// TaskManager tm = TaskManager.getInstance();

	}

}

enum TaskManager {

	tm;

}

// class TaskManager {
//
// private static TaskManager tm;
//
// private TaskManager() {
// }
//
// public synchronized static TaskManager getInstance() {
//
// synchronized (TaskManager.class) {
// if (tm == null)
// tm = new TaskManager();
// }
//
// // 做很多的业务或者逻辑判断
//
// return tm;
//
// }
// }
// class TaskManager {
//
// private static TaskManager tm;
//
// private TaskManager() {
// }
//
// public static TaskManager getInstance() {
//
// synchronized (TaskManager.class) {
// if (tm == null)
// tm = new TaskManager();
// }
//
// // 做很多的业务或者逻辑判断
//
// return tm;
//
// }
// }
// class TaskManager {
//
// private static TaskManager tm;
//
// private TaskManager() {
// }
//
// public static TaskManager getInstance() {
//
// // 懒汉式
// if (tm == null)
// tm = new TaskManager();
//
// // 做很多的业务或者逻辑判断
//
// return tm;
//
// }
// }
// class TaskManager {
//
// // 在定义对象的时候就进行初始化的方式---饿汉式
// private static TaskManager tm = new TaskManager();
//
// private TaskManager() {
// }
//
// public static TaskManager getInstance() {
//
// // 做很多的业务或者逻辑判断
//
// return tm;
//
// }
// public static void destroy(){}
// }