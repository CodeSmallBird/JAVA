package cn.ted.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * 实现UPD通信 - 发送端
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		//1.创建UDP套接字对象
		DatagramSocket ds = new DatagramSocket();
		//2.创建数据报包
		//--封装数据
		byte [] data = "hello world~ hello udp~".getBytes();
		DatagramPacket p = new DatagramPacket(data, data.length);
		//--指定目的地
		p.setSocketAddress(new InetSocketAddress("127.0.0.1", 44444));
		//3.发送数据报包
		ds.send(p);
	}
}
