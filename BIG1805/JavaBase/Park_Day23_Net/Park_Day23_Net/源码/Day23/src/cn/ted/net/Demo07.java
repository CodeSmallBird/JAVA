package cn.ted.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * TCP������˫��ͨ�� - �ͻ���
 */
public class Demo07 {
	public static void main(String[] args) throws Exception {
		//1.�����׽��ֶ���
		Socket socket = new Socket();
		//2.���ӷ�����
		socket.connect(new InetSocketAddress("127.0.0.1",44444));
		//3.��ȡ������ �� �����
		OutputStream out = socket.getOutputStream();
		InputStream in = socket.getInputStream();
		//4.��������˷�����Ϣ
		out.write("��÷����������ǿͻ��ˣ�".getBytes());
		//5.�ӷ������˽�����Ϣ
		byte data[] = new byte [1024];
		int len = in.read(data);
		String msg = new String(data,0,len);
		System.out.println(msg);
		//6.�ر��׽���
		socket.close();
	}
}
