package cn.tedu.exception;

public class ExceptionDemo7 {

	public static void main(String[] args) {

		System.out.println(m());

	}

	public static int m() {

		int i = 6;

		try {
			// ������Ȼ�Ǵ��ϵ������α���ִ�е�
			// ����++�ں����Ի��Ȱ�i��ֵ6ȡ��������Ϊ������б�� --- ��ʱ��6���Ϊ�˽��
			// return 6; --- ��return֮ǰ��ȥ����Ƿ��������Ĳ�����Ҫִ��
			// ����������Ĳ�����Ҫִ�У���ô������صĲ����ᱻ��ʱ����
			// i -> 7
			// ��finallyִ�����֮��return���֮ǰ�����в������Ѿ�ִ������
			// ִ�з��ز���return����Ҫ��������أ���ʱ��ǵĽ����6�����Է��ص�Ҳ��6
			return i++;
		} finally {
			// i->8
			i++;
			System.out.println("finally:" + i);
		}

	}

}
