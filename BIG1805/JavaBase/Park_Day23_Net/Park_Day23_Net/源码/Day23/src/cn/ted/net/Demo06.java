package cn.ted.net;

import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * TCPͨ�ţ�����˿���
 */
public class Demo06 {
	public static void main(String[] args) throws Exception {
		//1.����ServerSocket����
		ServerSocket ss = new ServerSocket();
		ss.bind(new InetSocketAddress(44444));
		//2.����accept��ʼ����
		Socket socket = ss.accept();//��ʼ����ָ���˿� �˷�������������� ֱ���пͻ������ӹ���
		//3.��ȡ���������
		InputStream in = socket.getInputStream();
		//4.���������л�ȡ����
		byte [] data = new byte[1024];
		int len = in.read(data);
		String msg = new String(data,0,len);
		System.out.println(msg);
		//5.�ر�����
		socket.close();
		ss.close();
	}
}
