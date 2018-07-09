package cn.tedu.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP案例：文件上传 客户端
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		File file = null;
		while(file == null || !file.exists()){
			//1.要求用户从控制台输入要上传的文件的路径
			System.out.println("请输入要上传的文件路径：");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			//2.创建文件对象
			file = new File(line);
		}
		//3.获取文件名 和 文件的输入流
		String fname = file.getName();
		InputStream in = new FileInputStream(file);
		
		//4.开启socket连接服务器 获取指向服务器的输出流
		Socket socket = new Socket("127.0.0.1", 44444);
		OutputStream out = socket.getOutputStream();

		//5.发送数据 数据格式为 文件名\r\n文件内容
		String data1 = fname+"\r\n";
		out.write(data1.getBytes());
		
		int i = -1;
		byte [] tmp = new byte[1024];
		while((i = in.read(tmp))!=-1){
			out.write(tmp,0,i);
		}
		
		//6.关闭流 关闭套接字
		in.close();
		socket.close();
	}
}
