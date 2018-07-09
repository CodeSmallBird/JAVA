package cn.tedu.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP�������ļ��ϴ� �ͻ���
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		File file = null;
		while(file == null || !file.exists()){
			//1.Ҫ���û��ӿ���̨����Ҫ�ϴ����ļ���·��
			System.out.println("������Ҫ�ϴ����ļ�·����");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			//2.�����ļ�����
			file = new File(line);
		}
		//3.��ȡ�ļ��� �� �ļ���������
		String fname = file.getName();
		InputStream in = new FileInputStream(file);
		
		//4.����socket���ӷ����� ��ȡָ��������������
		Socket socket = new Socket("127.0.0.1", 44444);
		OutputStream out = socket.getOutputStream();

		//5.�������� ���ݸ�ʽΪ �ļ���\r\n�ļ�����
		String data1 = fname+"\r\n";
		out.write(data1.getBytes());
		
		int i = -1;
		byte [] tmp = new byte[1024];
		while((i = in.read(tmp))!=-1){
			out.write(tmp,0,i);
		}
		
		//6.�ر��� �ر��׽���
		in.close();
		socket.close();
	}
}
