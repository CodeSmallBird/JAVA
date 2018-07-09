package cn.tedu.net;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP�������ļ��ϴ� �����
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		//1.����������׽��� ����ָ���˿�
		ServerSocket ss = new ServerSocket(44444);
		//2.�ȴ����� ���ӳɹ��õ�ͨ���õ��׽���
		Socket socket = ss.accept();
		//3.���׽����л�ȡ������
		InputStream in = socket.getInputStream();
		//4.���ж�ȡ���� - �ļ��� - �����ж�ȡ���ݵ���һ���س����� ��ȡ���������ļ���
		String line = "";
		while(!line.endsWith("\r\n")){
			char c = (char) in.read();
			line += c;
		}
		String fname = line.substring(0, line.length()-2);
		//5.�����ļ������ ָ��Ҫ���ϴ����ļ������λ�� ��ʣ������е��ֽ� �Խӵ���� ��Ϊ�ļ��������
		OutputStream out = new FileOutputStream("upload/"+fname);
		byte []  tmp = new byte[1024];
		int i = -1;
		while((i = in.read(tmp))!=-1){
			out.write(tmp,0,i);
		}
		//6.�ر��� �ر��׽���
		out.flush();
		out.close();
		socket.close();
		ss.close();
	}
}
