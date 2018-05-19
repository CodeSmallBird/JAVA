package cn.tedu.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws Exception {

		// 获取系统当前的时间信息
		// Date date = new Date();

		// 2000-12-20
		// 在1900-01的基础上进行的累加
		// @SuppressWarnings("deprecation") // 压制警告 --- 已过时
		// 已过时 ---当前方法不推荐使用但是可以使用，在后续版本中可能会被删除
		// Date date = new Date(2000 - 1900, 12 - 1, 20);
		// System.out.println(date);

		// 2000-12-20
		// 2000.12.20
		// 2000/12/20
		// 12/20/2000
		// 将字符串转化为日期
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2000-12-20 18:12:53");
		System.out.println(date);

		String str = new SimpleDateFormat("yyyy年MM月dd日").format(new Date());
		System.out.println(str);

		Calendar c = Calendar.getInstance();
		System.out.println(c);
	}

}
