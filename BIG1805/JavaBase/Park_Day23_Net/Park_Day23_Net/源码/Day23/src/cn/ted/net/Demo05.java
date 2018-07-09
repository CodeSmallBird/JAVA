package cn.ted.net;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * TCP通信：客户端开发
 */
public class Demo05 {
	public static void main(String[] args) throws Exception {
		//1.创建Socket
		Socket socket = new Socket();
		//2.连接服务器 connect将会尝试 连接服务器 连接成功 则继续运行 连接不成功抛出异常
		socket.connect(new InetSocketAddress("127.0.0.1", 44444));
		//4.从套接字中获取输入 输出流
		OutputStream out = socket.getOutputStream();
		//5.向服务端写数据
		out.write("hello server by tcp~~".getBytes());
		//6.关闭连接
		socket.close();
	}
}
