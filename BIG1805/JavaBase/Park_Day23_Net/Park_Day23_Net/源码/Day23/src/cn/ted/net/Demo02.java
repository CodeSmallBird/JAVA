package cn.ted.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * ʵ��UPDͨ�� - ���Ͷ�
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		//1.����UDP�׽��ֶ���
		DatagramSocket ds = new DatagramSocket();
		//2.�������ݱ���
		//--��װ����
		byte [] data = "hello world~ hello udp~".getBytes();
		DatagramPacket p = new DatagramPacket(data, data.length);
		//--ָ��Ŀ�ĵ�
		p.setSocketAddress(new InetSocketAddress("127.0.0.1", 44444));
		//3.�������ݱ���
		ds.send(p);
	}
}
