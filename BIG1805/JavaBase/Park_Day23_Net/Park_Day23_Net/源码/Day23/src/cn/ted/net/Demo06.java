package cn.ted.net;

import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * TCP通信：服务端开发
 */
public class Demo06 {
	public static void main(String[] args) throws Exception {
		//1.创建ServerSocket对象
		ServerSocket ss = new ServerSocket();
		ss.bind(new InetSocketAddress(44444));
		//2.调用accept开始监听
		Socket socket = ss.accept();//开始监听指定端口 此方法将会产生阻塞 直到有客户端连接过来
		//3.获取输入输出流
		InputStream in = socket.getInputStream();
		//4.从输入流中获取数据
		byte [] data = new byte[1024];
		int len = in.read(data);
		String msg = new String(data,0,len);
		System.out.println(msg);
		//5.关闭连接
		socket.close();
		ss.close();
	}
}
