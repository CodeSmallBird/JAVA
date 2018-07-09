package cn.ted.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 实现UPD通信 - 接收端
 */
public class Demo03 {
	public static void main(String[] args) throws Exception {
		//1.创建UDP套接字 监听指定端口
		DatagramSocket ds = new DatagramSocket(33333);
		//2.创建数据报包对象 由于是接受数据 这个数据报包是空的
		byte data [] = new byte[1024];
		DatagramPacket p = new DatagramPacket(data, data.length);
		//3.调用receive方法 接受数据 填入数据报包中
		ds.receive(p);//此方法将会阻塞的等待 数据包 直到接收到数据包 阻塞才被放开
		//4.从数据报包中获取数据 打印
		//--获取数据长度
		int len = p.getLength();
		//--获取数据内容
		String msg = new String(data,0,len);
		//--打印数据
		System.out.println(msg);
	}
}
