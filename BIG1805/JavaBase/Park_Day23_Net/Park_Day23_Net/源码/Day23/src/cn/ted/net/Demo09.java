package cn.ted.net;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * TCPͨ���е�ճ������ - �ͻ���
 */
public class Demo09 {
	public static void main(String[] args) throws Exception {
		//1.�����׽��ֶ���
		Socket socket = new Socket();
		//2.���ӷ�����
		socket.connect(new InetSocketAddress("127.0.0.1",44444));
		//3.��ȡ������ �� �����
		OutputStream out = socket.getOutputStream();
		//4.��������˷�����Ϣ
		String str1 = "��÷����������ǿͻ��ˣ�";
		str1 = str1.getBytes().length+"\r\n"+str1;
		String str2 = "������";
		str2 = str2.getBytes().length+"\r\n"+str2;
		String str3 = "������";
		str3 = str3.getBytes().length+"\r\n"+str3;
		String str4 = "over~";
		str4 = str4.getBytes().length+"\r\n"+str4;
		out.write(str1.getBytes());
		out.write(str2.getBytes());
		out.write(str3.getBytes());
		out.write(str4.getBytes());
		out.close();
		//5.�ر��׽���
		socket.close();
	}
}
