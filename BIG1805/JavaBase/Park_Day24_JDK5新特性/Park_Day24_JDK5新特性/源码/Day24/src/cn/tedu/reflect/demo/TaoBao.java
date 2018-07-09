package cn.tedu.reflect.demo;

import java.io.FileInputStream;
import java.util.Properties;

import cn.tedu.reflect.Person;

public class TaoBao {
	//TaoBaoDao_File dao = new TaoBaoDao_File();
	//TaoBaoDao_DB dao = new TaoBaoDao_DB();
	
	private static TaoBaoDaoInterf dao = null;
	
	static{
		try {
			//1.创建Properties
			Properties prop = new Properties();
			//2.从配置文件中加载
			FileInputStream in = new FileInputStream("taobao.properties");
			prop.load(in);
			//3.从配置文件中读取 当前到底要用哪个TaoBaoDaoInterf的实现类作为数据存储位置
			String clzName = prop.getProperty("TaoBaoDaoInterf");
			//4.加载类的字节码
			Class clz = Class.forName(clzName);
			//5.通过反射创建该类的对象赋值
			dao = (TaoBaoDaoInterf) clz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public void buy(){
		//--调用数据存储功能 存储购买记录
		dao.add("购买记录。。张三丰 购买了一个痒痒挠。。。");
	}
	public void pay(){
		//--调用数据存储功能 存储支付记录
		dao.add("购买记录。。张三丰 付款10块钱。。。");
	}
	
	public static void main(String[] args) {
		TaoBao tb = new TaoBao();
		tb.buy();
		tb.pay();
	}
}
