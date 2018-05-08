package cn.tedu.store.yh;

import java.sql.Connection;
//代表jdk中的jar
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//代表第三方jar
import org.junit.Test;

import com.mysql.jdbc.Driver;

import cn.tedu.store.yh.pojo.Door;

public class TestJdbc {
	@Test		//导入import org.junit
	public void jdbc() throws Exception{	//抛异常
		/*
		 * 开发步骤：（对一个复杂问题要写开发步骤，把一个复杂内容，就拆分成很多小的步骤
		 * 1、创建链接
		 * 2、创建语句
		 * 3、创建查询SQL
		 * 4、遍历数据
		 */
		
		//数据库位置
		String url = "jdbc:mysql://localhost:3306/jt-store-yh";
		String user = "root";
		String password = "root";
		
		new Driver();		//异常
		//创建一个连接java.sql.Connection，getConnection获取一个连接
		Connection conn = DriverManager.getConnection(url, user, password);
		//获取语句执行器，执行SQL语句
		Statement stat = conn.createStatement();
		//查询SQL的字符串
		String sql = "select * from tb_door";
		//把查询结果放入到一个对象中，ResultSet结果集
		//executeQuery执行SQL语句
		ResultSet rs = stat.executeQuery(sql);
		//遍历这个对象，while循环
		//rs.next()第一次就拿到第一条;如果还有记录获取下一条记录；当没有数据就往下继续执行
		while(rs.next()){
			Integer id = rs.getInt(1);
			String name = rs.getString(2);
			String tel = rs.getString(3);
			
			System.out.println(id+name+tel);
		}
		//java关闭这些资源，倒着释放
		rs.close();
		stat.close();
		conn.close();
	}
	
	@Test
	public void pojo() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jt-store-yh";
		String user = "root";
		String password = "root";
		
		new Driver();		//异常
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stat = conn.createStatement();
		String sql = "select * from tb_door";
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()){
			Door door = new Door();
			
			door.setId(rs.getInt(1));
			door.setName(rs.getString(2));
			door.setTel(rs.getString(3));
			
			System.out.println(door.getId()+door.getName()+door.getTel());
		}
		
		rs.close();
		stat.close();
		conn.close();
	}
	
	
	
}
