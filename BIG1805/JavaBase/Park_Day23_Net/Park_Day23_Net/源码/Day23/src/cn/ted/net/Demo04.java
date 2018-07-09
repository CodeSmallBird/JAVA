package cn.ted.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * 案例：利用UDP实现聊天程序
 */
public class Demo04 {
	public static void main(String[] args) {
		new Thread(new Receiver()).start();
		new Thread(new Sender()).start();
	}
}

/**
 * 聊天程序 接收数据线程
 * 不停的监听指定端口 接收数据报包 解析成消息 打印到控制台 
 * 打印的格式为 [ip:port]:xxxx
 */
class Receiver implements Runnable{

	@Override
	public void run() {
		try {
			//1.创建UDP套接字
			DatagramSocket ds = new DatagramSocket(44444);
			
			while(true){
				//2.创建数据报包
				byte [] data = new byte[1024];
				DatagramPacket p = new DatagramPacket(data, data.length);
				//3.接收数据 封装数据到数据报包中
				ds.receive(p);
				//4.从数据报包中获取数据 
				int len = p.getLength();
				String msg = new String(data,0,len);
				//5.获取发送者信息
				InetSocketAddress addr = (InetSocketAddress) p.getSocketAddress();
				String ip = addr.getHostName();
				int port = addr.getPort();
				//6.打印消息
				System.out.println("["+ip+":"+port+"]:"+msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
}

/**
 * 聊天程序 发送数据线程
 * 不停的监控控制台 接收用户的输入 通过upd发送
 * 要求数据的格式：ip:端口:消息
 */
class Sender implements Runnable{
	@Override
	public void run() {
		try {
			//1.创建系统输入流 转换为缓冲字符流 方便后续读行
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			//2.创建套接字对象
			DatagramSocket ds = new DatagramSocket();
			
			while(true){
				//3.读取行
				String line = reader.readLine();
				//4.从行中解析出 ip port msg
				String ip = line.split(":")[0];
				int port = Integer.parseInt(line.split(":")[1]);
				String msg = line.split(":")[2];
				//5.创建数据报包对象 封装 数据
				DatagramPacket p = new DatagramPacket(msg.getBytes(), msg.getBytes().length);
				p.setSocketAddress(new InetSocketAddress(ip,port));
				//6.发送数据报包
				ds.send(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}
}
