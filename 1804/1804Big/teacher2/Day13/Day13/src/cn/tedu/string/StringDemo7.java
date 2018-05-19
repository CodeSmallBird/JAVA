package cn.tedu.string;

public class StringDemo7 {

	public static void main(String[] args) throws Exception {

		String str = "字符串编码转换";

		// 将字符串转化为字节数组
		// 在没有指定编码的情况下，用的是当前工程的编码
		// 在工程没有指定编码的情况下，用的是系统平台码
		byte[] bs = str.getBytes();
		// byte[] bs = str.getBytes("GBK");
		System.out.println(bs.length);

		// 将字节数组转化为字符串
		// String str2 = new String(bs);
		// String str2 = new String(bs, "gbk");
		// String str2 = new String(bs, 7, 6);
		String str2 = new String(bs, 7, 6,"gbk");
		System.out.println(str2);

	}

}
