package cn.tedu.io.system;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetLineExer {

	public static void main(String[] args) throws Exception {

		// ��ȡһ��---BufferedReader
		// �ӿ���̨��ȡ---System.in
		// BufferedReader�Ĳ������ַ�����System.in���ֽ���---InputStreamReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(reader.readLine());

		// reader.close();

	}

}
