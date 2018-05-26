package cn.tedu.io.system;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetLineExer {

	public static void main(String[] args) throws Exception {

		// 读取一行---BufferedReader
		// 从控制台获取---System.in
		// BufferedReader的参数是字符流，System.in是字节流---InputStreamReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(reader.readLine());

		// reader.close();

	}

}
