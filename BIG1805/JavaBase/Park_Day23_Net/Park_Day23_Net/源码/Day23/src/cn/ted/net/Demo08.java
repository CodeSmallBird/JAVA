package cn.ted.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP开发：双向通信 - 服务端
 */
public class Demo08 {
	public static void main(String[] args) throws Exception {
		//1.创建ServerSocket
		ServerSocket ss = new ServerSocket();
		//2.绑定端口
		ss.bind(new InetSocketAddress(44444));
		//3.开始监听端口 接收客户端连接
		Socket socket = ss.accept();//此行代码 会产生阻塞 直到客户端连接过来
		//4.获取输入输出流
		OutputStream out = socket.getOutputStream();
		InputStream in = socket.getInputStream();
		//5.接收数据
		byte data [] = new byte[1024];
		int len = in.read(data);
		String msg = new String(data,0,len);
		System.out.println(msg);
		//6.发送消息
		out.write("你好客户端，我是服务器！".getBytes());
		//7.关闭套接字
		socket.close();
		ss.close();
	}
}
