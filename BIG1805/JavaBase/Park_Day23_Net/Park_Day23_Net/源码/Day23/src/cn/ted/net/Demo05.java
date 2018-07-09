package cn.ted.net;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * TCPͨ�ţ��ͻ��˿���
 */
public class Demo05 {
	public static void main(String[] args) throws Exception {
		//1.����Socket
		Socket socket = new Socket();
		//2.���ӷ����� connect���᳢�� ���ӷ����� ���ӳɹ� ��������� ���Ӳ��ɹ��׳��쳣
		socket.connect(new InetSocketAddress("127.0.0.1", 44444));
		//4.���׽����л�ȡ���� �����
		OutputStream out = socket.getOutputStream();
		//5.������д����
		out.write("hello server by tcp~~".getBytes());
		//6.�ر�����
		socket.close();
	}
}
