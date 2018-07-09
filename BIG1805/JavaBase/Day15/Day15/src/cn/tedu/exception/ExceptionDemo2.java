package cn.tedu.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		// try {
		// String msg = readTxt("D:\\a.png");
		// System.out.println(msg);
		// } catch (PathNotExistException e) {
		// System.out.println("处理问题中~~~");
		// } catch (FileFormatException e) {
		// System.out.println(e.getMessage());
		// } catch (NullPointerException e) {
		// System.out.println("空指针异常~~~");
		// }
		// 捕获异常的父类
		// try {
		// String msg = readTxt("D:\\a.png");
		// System.out.println(msg);
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
		// try {
		// String msg = readTxt("D:\\a.png");
		// System.out.println(msg);
		// } catch (PathNotExistException | FileFormatException e) {
		// System.out.println(e.getMessage());
		// } catch (NullPointerException e) {
		// System.out.println("空指针异常~~~");
		// }
		// 在捕获异常的时候一定是小异常在前大异常在后
		try {
			String msg = readTxt("D:\\a.png");
			System.out.println(msg);
		} catch (PathNotExistException | FileFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
		}

	}

	//如果抛出来的是一个Exception对象，那么在捕获的时候也必须捕获一个Exception对象
	public static String readTxt(String path) throws Exception {
		// throws PathNotExistException, FileFormatException {

		// 参数是否为空
		if (path == null)
			throw new NullPointerException();

		// 路径不存在
		if (path.charAt(0) >= 'F')
			throw new PathNotExistException("亲，现在盘符是" + path.charAt(0) + ",超过最大范围了");

		// 文件格式不正确
		if (!path.endsWith(".txt"))
			throw new FileFormatException("亲，需要的是一个TXT文件，但是传入的是一个" + path.substring(path.lastIndexOf('.')) + "文件");

		return "读取成功~~~";
	}

}

@SuppressWarnings("serial")
class FileFormatException extends Exception {

	public FileFormatException() {
	}

	public FileFormatException(String message) {
		super(message);
	}

}

@SuppressWarnings("serial")
class PathNotExistException extends Exception {

	private String message;

	public PathNotExistException() {
	}

	public PathNotExistException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
