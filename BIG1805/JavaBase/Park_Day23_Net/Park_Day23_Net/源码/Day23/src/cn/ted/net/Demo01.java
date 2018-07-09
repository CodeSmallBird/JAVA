package cn.ted.net;

import java.net.InetAddress;

/**
 * 代表IP的对象 - InetAddress
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.获取本机ip信息
		InetAddress inetAddress = InetAddress.getLocalHost();
		//2.得到ip
		String ip = inetAddress.getHostAddress();
		//2.得到主机名
		String host = inetAddress.getHostName();
		System.out.println(ip);
		System.out.println(host);
	}
}
