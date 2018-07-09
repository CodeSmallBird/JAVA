package cn.tedu.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		// try {
		// String msg = readTxt("D:\\a.png");
		// System.out.println(msg);
		// } catch (PathNotExistException e) {
		// System.out.println("����������~~~");
		// } catch (FileFormatException e) {
		// System.out.println(e.getMessage());
		// } catch (NullPointerException e) {
		// System.out.println("��ָ���쳣~~~");
		// }
		// �����쳣�ĸ���
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
		// System.out.println("��ָ���쳣~~~");
		// }
		// �ڲ����쳣��ʱ��һ����С�쳣��ǰ���쳣�ں�
		try {
			String msg = readTxt("D:\\a.png");
			System.out.println(msg);
		} catch (PathNotExistException | FileFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
		}

	}

	//����׳�������һ��Exception������ô�ڲ����ʱ��Ҳ���벶��һ��Exception����
	public static String readTxt(String path) throws Exception {
		// throws PathNotExistException, FileFormatException {

		// �����Ƿ�Ϊ��
		if (path == null)
			throw new NullPointerException();

		// ·��������
		if (path.charAt(0) >= 'F')
			throw new PathNotExistException("�ף������̷���" + path.charAt(0) + ",�������Χ��");

		// �ļ���ʽ����ȷ
		if (!path.endsWith(".txt"))
			throw new FileFormatException("�ף���Ҫ����һ��TXT�ļ������Ǵ������һ��" + path.substring(path.lastIndexOf('.')) + "�ļ�");

		return "��ȡ�ɹ�~~~";
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
