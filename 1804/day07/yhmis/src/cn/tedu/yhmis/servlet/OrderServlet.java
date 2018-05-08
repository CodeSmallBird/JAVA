package cn.tedu.yhmis.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

import cn.tedu.yhmis.pojo.Door;
import cn.tedu.yhmis.pojo.Order;
import cn.tedu.yhmis.pojo.OrderDetail;

@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public OrderServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//把准备好的order对象传递jsp页面
		request.setAttribute("order", getOrder(1));
		
		//转向jsp页面
		request.getRequestDispatcher("/WEB-INF/views/Order.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


	//获取门店的信息jdbc
	public Door getDoor(Integer doorId){
		/*
		 * 开发步骤：
		 * 1、写数据库连接3个参数url,user,password
		 * 2、创建链接Connection
		 * 3、创建执行器Statement
		 * 4、执行SQL语句 stat.executeQuery，返回ResultSet结果集
		 * 5、while循环，获取每条记录，获取每个列rs.getInt("id")
		 * 6、设置到Door的属性中
		 * 7、释放对象，返回door对象
		 * 8、异常，try{}catch{}
		 */
		
		String url = "jdbc:mysql://localhost:3306/yhdb";
		String user = "root";
		String password = "root";
		
		try{	//自己处理异常
			new Driver();
			Connection cn = DriverManager.getConnection(url, user, password);
			Statement stat = cn.createStatement();
			String sql = "select * from tb_door where id="+doorId;
			
			ResultSet rs = stat.executeQuery(sql);
			Door door = new Door();
			while(rs.next()){
				//获取某列
				door.setId(rs.getInt("id"));
				door.setDoorName(rs.getString("door_name"));
				door.setTel(rs.getString("tel"));
			}
			return door;
		}catch(Exception e){
			e.printStackTrace();//打印错误信息到控制台
		}
		
		return null;
	}
	
	//获取订单的信息jdbc
	public Order getOrder(Integer orderId){
		String url = "jdbc:mysql://localhost:3306/yhdb";
		String user = "root";
		String password = "root";
		
		try{	//自己处理异常
			new Driver();
			Connection cn = DriverManager.getConnection(url, user, password);
			Statement stat = cn.createStatement();
			String sql = "select * from tb_order where id=" + orderId;
			
			ResultSet rs = stat.executeQuery(sql);
			Order order = new Order();
			while(rs.next()){
				//获取某列
				order.setId(rs.getInt("id"));
				order.setDoorId(rs.getInt("door_id"));
				order.setOrderNo(rs.getString("order_no"));
				order.setOrderType(rs.getString("order_type"));
				order.setPersonNum(rs.getInt("person_num"));
				order.setCashier(rs.getString("cashier"));
				order.setCreateTime(rs.getTimestamp("create_time"));
				order.setEndTime(rs.getTimestamp("end_time"));
				order.setPaymentType(rs.getString("payment_type"));
				order.setPayment(rs.getDouble("payment"));
				order.setPrintTime(rs.getTimestamp("print_time"));
			}
			
			//关联关系的绑定
			order.setDoor(getDoor(order.getDoorId()));	//订单和门店关系
			order.setOrderDetails(getOrderDetails(orderId));
			
			return order;
		}catch(Exception e){
			e.printStackTrace();//打印错误信息到控制台
		}
		
		return null;
	}
	
	//获取某个订单下的订单详情
	public List<OrderDetail> getOrderDetails(Integer orderId){
		String url = "jdbc:mysql://localhost:3306/yhdb";
		String user = "root";
		String password = "root";
		
		try{	//自己处理异常
			new Driver();
			Connection cn = DriverManager.getConnection(url, user, password);
			Statement stat = cn.createStatement();
			String sql = "select * from tb_order_detail where order_id=" + orderId;
			
			ResultSet rs = stat.executeQuery(sql);
			
			List<OrderDetail> odList = new ArrayList<OrderDetail>();
			while(rs.next()){
				OrderDetail od = new OrderDetail();
				//获取某列
				od.setId(rs.getInt("id"));
				od.setNum(rs.getInt("num"));
				od.setItem(rs.getString("item"));
				od.setPrice(rs.getDouble("price"));
				
				odList.add(od);
			}
			return odList;
		}catch(Exception e){
			e.printStackTrace();//打印错误信息到控制台
		}
		
		return null;
	}	
}






