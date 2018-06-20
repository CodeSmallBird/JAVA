package cn.tedu.string;

public class StringDemo3 {

	public static void main(String[] args) throws Exception {

		String s = "字节数组";

		// 将字符串转化为字节数组
		// 在转化的时候如果没有指定编码会依据平台码来进行转化
		// byte[] bs = s.getBytes();
		byte[] bs = s.getBytes("utf-8");
		System.out.println(bs.length);

		// 将字节数组转化为字符串
		// String str = new String(bs);
		// String str = new String(bs, "utf-8");
		String str = new String(bs, 3, 6, "utf-8");
		System.out.println(str);

	}

}
