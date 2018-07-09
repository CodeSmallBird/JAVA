package cn.ted.net;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * TCP通信中的粘包问题 - 客户端
 */
public class Demo09 {
	public static void main(String[] args) throws Exception {
		//1.创建套接字对象
		Socket socket = new Socket();
		//2.连接服务器
		socket.connect(new InetSocketAddress("127.0.0.1",44444));
		//3.获取输入流 和 输出流
		OutputStream out = socket.getOutputStream();
		//4.向服务器端发送消息
		String str1 = "你好服务器！我是客户端！";
		str1 = str1.getBytes().length+"\r\n"+str1;
		String str2 = "哈哈哈";
		str2 = str2.getBytes().length+"\r\n"+str2;
		String str3 = "啦啦啦";
		str3 = str3.getBytes().length+"\r\n"+str3;
		String str4 = "over~";
		str4 = str4.getBytes().length+"\r\n"+str4;
		out.write(str1.getBytes());
		out.write(str2.getBytes());
		out.write(str3.getBytes());
		out.write(str4.getBytes());
		out.close();
		//5.关闭套接字
		socket.close();
	}
}
