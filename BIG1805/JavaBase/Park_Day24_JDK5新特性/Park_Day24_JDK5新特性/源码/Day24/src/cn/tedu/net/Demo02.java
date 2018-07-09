package cn.tedu.net;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP案例：文件上传 服务端
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		//1.创建服务端套接字 监听指定端口
		ServerSocket ss = new ServerSocket(44444);
		//2.等待连接 连接成功得到通信用的套接字
		Socket socket = ss.accept();
		//3.从套接字中获取输入流
		InputStream in = socket.getInputStream();
		//4.从中读取数据 - 文件名 - 从流中读取数据到第一个回车换行 截取出来就是文件名
		String line = "";
		while(!line.endsWith("\r\n")){
			char c = (char) in.read();
			line += c;
		}
		String fname = line.substring(0, line.length()-2);
		//5.创建文件输出流 指向要将上传的文件保存的位置 将剩余的流中的字节 对接到输出 作为文件内容输出
		OutputStream out = new FileOutputStream("upload/"+fname);
		byte []  tmp = new byte[1024];
		int i = -1;
		while((i = in.read(tmp))!=-1){
			out.write(tmp,0,i);
		}
		//6.关闭流 关闭套接字
		out.flush();
		out.close();
		socket.close();
		ss.close();
	}
}
