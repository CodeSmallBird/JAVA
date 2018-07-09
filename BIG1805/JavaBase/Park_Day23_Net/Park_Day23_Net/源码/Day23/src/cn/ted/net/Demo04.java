package cn.ted.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * ����������UDPʵ���������
 */
public class Demo04 {
	public static void main(String[] args) {
		new Thread(new Receiver()).start();
		new Thread(new Sender()).start();
	}
}

/**
 * ������� ���������߳�
 * ��ͣ�ļ���ָ���˿� �������ݱ��� ��������Ϣ ��ӡ������̨ 
 * ��ӡ�ĸ�ʽΪ [ip:port]:xxxx
 */
class Receiver implements Runnable{

	@Override
	public void run() {
		try {
			//1.����UDP�׽���
			DatagramSocket ds = new DatagramSocket(44444);
			
			while(true){
				//2.�������ݱ���
				byte [] data = new byte[1024];
				DatagramPacket p = new DatagramPacket(data, data.length);
				//3.�������� ��װ���ݵ����ݱ�����
				ds.receive(p);
				//4.�����ݱ����л�ȡ���� 
				int len = p.getLength();
				String msg = new String(data,0,len);
				//5.��ȡ��������Ϣ
				InetSocketAddress addr = (InetSocketAddress) p.getSocketAddress();
				String ip = addr.getHostName();
				int port = addr.getPort();
				//6.��ӡ��Ϣ
				System.out.println("["+ip+":"+port+"]:"+msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
}

/**
 * ������� ���������߳�
 * ��ͣ�ļ�ؿ���̨ �����û������� ͨ��upd����
 * Ҫ�����ݵĸ�ʽ��ip:�˿�:��Ϣ
 */
class Sender implements Runnable{
	@Override
	public void run() {
		try {
			//1.����ϵͳ������ ת��Ϊ�����ַ��� �����������
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			//2.�����׽��ֶ���
			DatagramSocket ds = new DatagramSocket();
			
			while(true){
				//3.��ȡ��
				String line = reader.readLine();
				//4.�����н����� ip port msg
				String ip = line.split(":")[0];
				int port = Integer.parseInt(line.split(":")[1]);
				String msg = line.split(":")[2];
				//5.�������ݱ������� ��װ ����
				DatagramPacket p = new DatagramPacket(msg.getBytes(), msg.getBytes().length);
				p.setSocketAddress(new InetSocketAddress(ip,port));
				//6.�������ݱ���
				ds.send(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}
}
