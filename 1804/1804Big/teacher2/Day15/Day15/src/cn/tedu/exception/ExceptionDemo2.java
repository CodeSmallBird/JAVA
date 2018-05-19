package cn.tedu.exception;

import java.io.FileNotFoundException;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		// try {
		// String msg = readTxt(null);
		// System.out.println(msg);
		// } catch (FileNotFoundException e) {
		// System.out.println("处理异常~~~");
		// System.out.println(e.getMessage());
		// } catch (PathNotExistException e) {
		// // System.out.println("路径问题处理中~~~");
		// System.out.println(e.getMessage());
		// } catch (NullPointerException e) {
		// // System.out.println("发现一个空指针异常");
		// // 获取异常的轨迹
		// e.printStackTrace();
		// }
		// try {
		// String msg = readTxt(null);
		// System.out.println(msg);
		// } catch (Exception e) {
		// // System.out.println("发现一个空指针异常");
		// // 获取异常的轨迹
		// e.printStackTrace();
		// }
		// 异常在捕获处理之后，代码可以继续执行
		// 在捕获异常的时候，需要先捕获子类异常，然后再捕获父类异常
		// 捕获异常的时候，运行时异常可以随意抛出随意捕获
		// 编译时异常必须在抛出之后才能捕获
		try {
			String msg = readTxt(null);
			System.out.println(msg);
		} catch (FileNotFoundException | PathNotExistException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			// 获取异常的轨迹
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("随意捕获着玩玩~~~");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("running~~~");
	}

	private static String readTxt(String path)
			throws FileNotFoundException, PathNotExistException, NullPointerException {
		// throws Exception {

		// 判断参数是否为null
		if (path == null) {
			// 一旦抛出异常，方法就此结束
			throw new NullPointerException("亲，路径不能为空噢~~~");
		}

		// 文件不存在
		if (!path.endsWith(".txt")) {
			throw new FileNotFoundException("亲，文件格式不对啊，应该是TXT文件，现在是" + path.substring(path.lastIndexOf(".")));
		}

		// 路径不存在
		if (path.startsWith("H:")) {
			throw new PathNotExistException("亲，这个盘符不对哦~~~，盘符现在是" + path.charAt(0));
		}

		return "读取成功~~~";
	}

}

@SuppressWarnings("serial")
class PathNotExistException extends Exception {

	// private String message;

	public PathNotExistException() {
	}

	public PathNotExistException(String message) {
		// this.message = message;
		super(message);
	}

	// public String getMessage() {
	// return message;
	// }

}
