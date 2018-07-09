package cn.ted.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * TCP开发：双向通信 - 客户端
 */
public class Demo07 {
	public static void main(String[] args) throws Exception {
		//1.创建套接字对象
		Socket socket = new Socket();
		//2.连接服务器
		socket.connect(new InetSocketAddress("127.0.0.1",44444));
		//3.获取输入流 和 输出流
		OutputStream out = socket.getOutputStream();
		InputStream in = socket.getInputStream();
		//4.向服务器端发送消息
		out.write("你好服务器！我是客户端！".getBytes());
		//5.从服务器端接收消息
		byte data[] = new byte [1024];
		int len = in.read(data);
		String msg = new String(data,0,len);
		System.out.println(msg);
		//6.关闭套接字
		socket.close();
	}
}
