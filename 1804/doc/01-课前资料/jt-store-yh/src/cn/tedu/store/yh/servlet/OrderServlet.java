package cn.tedu.store.yh.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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

import cn.tedu.store.yh.pojo.Door;
import cn.tedu.store.yh.pojo.Order;
import cn.tedu.store.yh.pojo.OrderDetail;

@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public OrderServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//准备数据 order
		Integer orderId = 2;
		Order order = getOrder(orderId);
		//从数据获取
		order.setDoor(getDoor(orderId));
		order.setOrderDetails(getOrderDetailList(orderId));
		
		request.setAttribute("order", order);
		
		//转向jsp页面
		request.getRequestDispatcher("Order.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	//获取某个门店
	public Door getDoor(Integer id){
		try{
			String url = "jdbc:mysql://localhost:3306/jt-store-yh";
			String user = "root";
			String password = "root";
			
			new Driver();		//异常
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stat = conn.createStatement();
			String sql = "select * from tb_door where id="+id;
			ResultSet rs = stat.executeQuery(sql);
			
			Door door = new Door();
			while(rs.next()){
				door.setId(rs.getInt(1));
				door.setName(rs.getString(2));
				door.setTel(rs.getString(3));
			}
			rs.close();
			stat.close();
			conn.close();
			return door;
		}catch(Exception e){
			return null;
		}
	}
	
	//获取某个订单
	public Order getOrder(Integer id){
		try{
			String url = "jdbc:mysql://localhost:3306/jt-store-yh";
			String user = "root";
			String password = "root";
			
			new Driver();		//异常
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stat = conn.createStatement();
			String sql = "select * from tb_order where id="+id;
			ResultSet rs = stat.executeQuery(sql);
			
			Order order = new Order();
			while(rs.next()){
				order.setId(rs.getInt("id"));
				order.setOrderNo(rs.getString("order_no"));
				order.setOrderType(rs.getString("order_type"));
				order.setPersonNum(rs.getInt("person_num"));
				order.setCashier(rs.getString("cashier"));
				order.setCreateTime(rs.getDate("create_time"));
				order.setEndTime(rs.getDate("end_time"));
				order.setPaymentType(rs.getString("payment_type"));
				order.setPrice(rs.getDouble("price"));
			}
			rs.close();
			stat.close();
			conn.close();
			return order;
		}catch(Exception e){
			return null;
		}
	}

	//获取某个订单下的详情
	public List<OrderDetail> getOrderDetailList(Integer id){
		try{
			String url = "jdbc:mysql://localhost:3306/jt-store-yh";
			String user = "root";
			String password = "root";
			
			new Driver();		//异常
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stat = conn.createStatement();
			String sql = "select * from tb_order_detail where order_id="+id;
			ResultSet rs = stat.executeQuery(sql);
			
			List<OrderDetail> odList = new ArrayList<OrderDetail>();
			while(rs.next()){
				OrderDetail od = new OrderDetail();
				
				od.setId(rs.getInt("id"));
				od.setItem(rs.getString("item"));
				od.setNum(rs.getInt("num"));
				od.setPrice(rs.getDouble("price"));
				
				odList.add(od);
			}
			rs.close();
			stat.close();
			conn.close();
			return odList;
		}catch(Exception e){
			return null;
		}
	}	
}
