package cn.ted.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * ʵ��UPDͨ�� - ���ն�
 */
public class Demo03 {
	public static void main(String[] args) throws Exception {
		//1.����UDP�׽��� ����ָ���˿�
		DatagramSocket ds = new DatagramSocket(33333);
		//2.�������ݱ������� �����ǽ������� ������ݱ����ǿյ�
		byte data [] = new byte[1024];
		DatagramPacket p = new DatagramPacket(data, data.length);
		//3.����receive���� �������� �������ݱ�����
		ds.receive(p);//�˷������������ĵȴ� ���ݰ� ֱ�����յ����ݰ� �����ű��ſ�
		//4.�����ݱ����л�ȡ���� ��ӡ
		//--��ȡ���ݳ���
		int len = p.getLength();
		//--��ȡ��������
		String msg = new String(data,0,len);
		//--��ӡ����
		System.out.println(msg);
	}
}
