package cn.ted.net;

import java.net.InetAddress;

/**
 * ����IP�Ķ��� - InetAddress
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.��ȡ����ip��Ϣ
		InetAddress inetAddress = InetAddress.getLocalHost();
		//2.�õ�ip
		String ip = inetAddress.getHostAddress();
		//2.�õ�������
		String host = inetAddress.getHostName();
		System.out.println(ip);
		System.out.println(host);
	}
}
