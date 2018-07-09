package cn.ted.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP������˫��ͨ�� - �����
 */
public class Demo08 {
	public static void main(String[] args) throws Exception {
		//1.����ServerSocket
		ServerSocket ss = new ServerSocket();
		//2.�󶨶˿�
		ss.bind(new InetSocketAddress(44444));
		//3.��ʼ�����˿� ���տͻ�������
		Socket socket = ss.accept();//���д��� ��������� ֱ���ͻ������ӹ���
		//4.��ȡ���������
		OutputStream out = socket.getOutputStream();
		InputStream in = socket.getInputStream();
		//5.��������
		byte data [] = new byte[1024];
		int len = in.read(data);
		String msg = new String(data,0,len);
		System.out.println(msg);
		//6.������Ϣ
		out.write("��ÿͻ��ˣ����Ƿ�������".getBytes());
		//7.�ر��׽���
		socket.close();
		ss.close();
	}
}
