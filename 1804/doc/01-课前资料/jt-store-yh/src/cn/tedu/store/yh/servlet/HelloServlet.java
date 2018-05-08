package cn.tedu.store.yh.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

import cn.tedu.store.yh.pojo.Door;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HelloServlet() {
    }
    //修改在doGet方法中修改
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//向jsp传递一个动态内容
		String name = "tony";
		//为转向下一个请求中准备数据
		request.setAttribute("name", name);
		
		//从数据库获取数据
		String cnurl ="jdbc:mysql://localhost:3306/jt-store-yh";
		String user = "root";
		String password = "root";
		
		//传递集合
		List<Door> doorList = new ArrayList<Door>();
				
		try {
			new Driver();
			Connection conn = DriverManager.getConnection(cnurl,user,password);
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from tb_door");
			while(rs.next()){
				Door door = new Door();
				door.setId(rs.getInt("id"));
				door.setName(rs.getString("name"));
				door.setTel(rs.getString("tel"));
				
				//绑定，把数据放入
				doorList.add(door);
			}
			request.setAttribute("doorList", doorList);
			
			//把门店信息传入，对象变量，传值更多
			Door door = new Door();
			door.setName("北三环店");
			door.setTel("119");
			request.setAttribute("door", door);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//转向jsp页面
		String url = "Order.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
