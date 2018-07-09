package cn.ted.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo10 {
	public static void main(String[] args) throws Exception {
		//1.创建ServerSocket
		ServerSocket ss = new ServerSocket();
		//2.绑定端口
		ss.bind(new InetSocketAddress(44444));
		//3.开始监听端口 接收客户端连接
		Socket socket = ss.accept();//此行代码 会产生阻塞 直到客户端连接过来
		//4.获取输入输出流
		InputStream in = socket.getInputStream();
		//5.接收数据
		String str = "";
		while(!"over~".equals(str)){
			String line = "";
			while(!line.endsWith("\r\n")){
				char c = (char) in.read();
				line += c;
			}
			int len = Integer.parseInt(line.substring(0, line.length()-2));
			byte [] data = new byte[len];
			in.read(data);
			str = new String(data);
			System.out.println(str);
		}
		//6.关闭套接字
		socket.close();
		ss.close();
	}
}
