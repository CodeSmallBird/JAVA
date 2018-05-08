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
		//��׼���õ�order���󴫵�jspҳ��
		request.setAttribute("order", getOrder(1));
		
		//ת��jspҳ��
		request.getRequestDispatcher("/WEB-INF/views/Order.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


	//��ȡ�ŵ����Ϣjdbc
	public Door getDoor(Integer doorId){
		/*
		 * �������裺
		 * 1��д���ݿ�����3������url,user,password
		 * 2����������Connection
		 * 3������ִ����Statement
		 * 4��ִ��SQL��� stat.executeQuery������ResultSet�����
		 * 5��whileѭ������ȡÿ����¼����ȡÿ����rs.getInt("id")
		 * 6�����õ�Door��������
		 * 7���ͷŶ��󣬷���door����
		 * 8���쳣��try{}catch{}
		 */
		
		String url = "jdbc:mysql://localhost:3306/yhdb";
		String user = "root";
		String password = "root";
		
		try{	//�Լ������쳣
			new Driver();
			Connection cn = DriverManager.getConnection(url, user, password);
			Statement stat = cn.createStatement();
			String sql = "select * from tb_door where id="+doorId;
			
			ResultSet rs = stat.executeQuery(sql);
			Door door = new Door();
			while(rs.next()){
				//��ȡĳ��
				door.setId(rs.getInt("id"));
				door.setDoorName(rs.getString("door_name"));
				door.setTel(rs.getString("tel"));
			}
			return door;
		}catch(Exception e){
			e.printStackTrace();//��ӡ������Ϣ������̨
		}
		
		return null;
	}
	
	//��ȡ��������Ϣjdbc
	public Order getOrder(Integer orderId){
		String url = "jdbc:mysql://localhost:3306/yhdb";
		String user = "root";
		String password = "root";
		
		try{	//�Լ������쳣
			new Driver();
			Connection cn = DriverManager.getConnection(url, user, password);
			Statement stat = cn.createStatement();
			String sql = "select * from tb_order where id=" + orderId;
			
			ResultSet rs = stat.executeQuery(sql);
			Order order = new Order();
			while(rs.next()){
				//��ȡĳ��
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
			
			//������ϵ�İ�
			order.setDoor(getDoor(order.getDoorId()));	//�������ŵ��ϵ
			order.setOrderDetails(getOrderDetails(orderId));
			
			return order;
		}catch(Exception e){
			e.printStackTrace();//��ӡ������Ϣ������̨
		}
		
		return null;
	}
	
	//��ȡĳ�������µĶ�������
	public List<OrderDetail> getOrderDetails(Integer orderId){
		String url = "jdbc:mysql://localhost:3306/yhdb";
		String user = "root";
		String password = "root";
		
		try{	//�Լ������쳣
			new Driver();
			Connection cn = DriverManager.getConnection(url, user, password);
			Statement stat = cn.createStatement();
			String sql = "select * from tb_order_detail where order_id=" + orderId;
			
			ResultSet rs = stat.executeQuery(sql);
			
			List<OrderDetail> odList = new ArrayList<OrderDetail>();
			while(rs.next()){
				OrderDetail od = new OrderDetail();
				//��ȡĳ��
				od.setId(rs.getInt("id"));
				od.setNum(rs.getInt("num"));
				od.setItem(rs.getString("item"));
				od.setPrice(rs.getDouble("price"));
				
				odList.add(od);
			}
			return odList;
		}catch(Exception e){
			e.printStackTrace();//��ӡ������Ϣ������̨
		}
		
		return null;
	}	
}






