package cn.ted.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo10 {
	public static void main(String[] args) throws Exception {
		//1.����ServerSocket
		ServerSocket ss = new ServerSocket();
		//2.�󶨶˿�
		ss.bind(new InetSocketAddress(44444));
		//3.��ʼ�����˿� ���տͻ�������
		Socket socket = ss.accept();//���д��� ��������� ֱ���ͻ������ӹ���
		//4.��ȡ���������
		InputStream in = socket.getInputStream();
		//5.��������
		String str = "";
		while(!"over~".equals(str)){
			String line = "";
			while(!line.endsWith("\r\n")){
				char c = (char) in.read();
				line += c;
			}
			int len = Integer.parseInt(line.substring(0, line.length()-2));
			byte [] data = new byte[len];
			in.read(data);
			str = new String(data);
			System.out.println(str);
		}
		//6.�ر��׽���
		socket.close();
		ss.close();
	}
}
