package cn.tedu.yhMis.pojo;

import java.util.List;

public class Order {
	
	Door door;

	List<OrderDetail> orderDtails;
	
	private Integer id;
	private Integer doorId;
	private String orderType;
	private String orderNo;
	private Integer personNum;
	private String casher;
	private String createTime;
	private String endTime;
	private String paymentType;
	private Double payment;
	private String printTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDoorId() {
		return doorId;
	}
	public void setDoorId(Integer doorId) {
		this.doorId = doorId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Integer getPersonNum() {
		return personNum;
	}
	public void setPersonNum(Integer personNum) {
		this.personNum = personNum;
	}
	public String getCasher() {
		return casher;
	}
	public void setCasher(String casher) {
		this.casher = casher;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Double getPayment() {
		return payment;
	}
	public void setPayment(Double payment) {
		this.payment = payment;
	}
	public String getPrintTime() {
		return printTime;
	}
	public void setPrintTime(String printTime) {
		this.printTime = printTime;
	}
	public Door getDoor() {
		return door;
	}
	public void setDoor(Door door) {
		this.door = door;
	}
	public List<OrderDetail> getOrderDtails() {
		return orderDtails;
	}
	public void setOrderDtails(List<OrderDetail> orderDtails) {
		this.orderDtails = orderDtails;
	}		
}
