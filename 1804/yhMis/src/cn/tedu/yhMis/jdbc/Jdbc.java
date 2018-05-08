package cn.tedu.yhMis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;

import cn.tedu.yhMis.pojo.Door;
import cn.tedu.yhMis.pojo.Order;
import cn.tedu.yhMis.pojo.OrderDetail;

public class Jdbc {
	
	private Order order;
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}


	public Door getDoor(Integer id){
		Door door = new Door();
		String url ="jdbc:mysql://localhost:3306/yh1";	
		String user="root";
		String password = "root";
		String sql = "select * from tb_door where id=";

		try {
			new Driver();
			Connection cn = DriverManager.getConnection(url,user,password);
			Statement state = cn.createStatement();
			ResultSet rs = state.executeQuery(sql+id);
			while(rs.next()){
				door.setId(rs.getInt("id"));
				door.setDoorName(rs.getString("door_name"));
				door.setDoorTel(rs.getString("door_tel"));
				door.setDoorAddr(rs.getString("door_addr"));
			}
			rs.close();
			state.close();
			cn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return door;
	}
	
	
	public List<OrderDetail> getOrderDetail(Integer id){
		List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
		
		String url ="jdbc:mysql://localhost:3306/yh1";	
		String user="root";
		String password = "root";
		String sql = "select * from tb_order_detail where order_id=";

		try {
			new Driver();
			Connection cn = DriverManager.getConnection(url,user,password);
			Statement state = cn.createStatement();
			ResultSet rs = state.executeQuery(sql+id);
			while(rs.next()){
				OrderDetail orderDetail = new OrderDetail();
				orderDetail.setId(rs.getInt("id"));
				orderDetail.setItem(rs.getString("item"));
				orderDetail.setNum(rs.getInt("num"));
				orderDetail.setPrice(rs.getDouble("price"));
				orderDetails.add(orderDetail);
			}
			rs.close();
			state.close();
			cn.close();
			System.out.println(orderDetails);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return orderDetails;
	}
	public Order getOrder(Integer id){
		Order order = new Order();
		
		String url ="jdbc:mysql://localhost:3306/yh1";	
		String user="root";
		String password = "root";
		String sql = "select * from tb_order where id=";

		try {
			new Driver();
			Connection cn = DriverManager.getConnection(url,user,password);
			Statement state = cn.createStatement();
			ResultSet rs = state.executeQuery(sql+id);
			SimpleDateFormat sdf = 
					new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			while(rs.next()){
				order.setId(rs.getInt("id"));
				order.setDoorId(rs.getInt("door_id"));
				order.setOrderType(rs.getString("order_type"));
				order.setOrderNo(rs.getString("order_no"));
				order.setPersonNum(rs.getInt("person_num"));
				order.setCasher(rs.getString("casher"));
				
				order.setCreateTime(sdf.format(rs.getTimestamp("create_time")));
				order.setEndTime(sdf.format(rs.getTimestamp("end_time")));
				order.setPrintTime(sdf.format(rs.getTimestamp("print_time")));
				
				order.setPayment(rs.getDouble("payment_"));
				order.setPaymentType(rs.getString("payment_type"));
			}
			rs.close();
			state.close();
			cn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		Door door = new Door();
		door = getDoor(order.getDoorId());
		order.setDoor(door);
		
		List<OrderDetail> odList = new ArrayList<OrderDetail>();
		odList = getOrderDetail(order.getId());
		order.setOrderDtails(odList);
		
		System.out.println("doorName"+order.getDoor().getDoorName());
		
		return order;	
	}
	
}
