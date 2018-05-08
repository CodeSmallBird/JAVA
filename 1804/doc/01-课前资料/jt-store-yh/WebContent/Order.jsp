<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" 
uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="css/base.css">
<title>Insert title here</title>
</head>
<body>
	<div>顾客联</div>
	<div class="please">请您留意取餐账单号</div>
	<div class="me">自取顾客联</div>
	<div>${order.door.name}</div>
	<div>${order.door.tel}</div>
	<div class="me">--结账单--</div>
	
	<div class="please">账单号：${order.orderNo}</div>
	<div>账单类型：${order.orderType}</div>
	<div>人数：${order.personNum}</div>
	<div>收银员：${order.cashier}</div>
	<div>开单时间：${order.createTime}</div>
	<div>结账时间：${order.endTime}</div>
	
	<hr class="line"></div>
	<div>
	<table>
	  <tr><td width="30">数量</td><td width="170">品项</td><td>金额</td></tr>
	  <c:set var="total" value="0"/>
	  <c:forEach var="o" items="${order.orderDetails}"> 
	  <c:set var="total" value="${total+o.num*o.price}"/>
	  <tr>
	    <td valign="top">${o.num}</td>
	    <td>${o.item}</td>
	    <td width="30" valign="top">${o.price}</td>
	  </tr>
	  </c:forEach>
	</table>
	</div>

	<div class="line"></div>
	
	<div>
	<table>
	  <tr><td width="210">合计</td><td>${total}</td></tr>
	  <tr><td width="30">支付（${order.paymentType}）</td><td align="right">${total}</td></tr>
	</table>
	</div>
	<br/>

	<div class="line"></div>
	<div>打印时间：${order.printTime}</div>
	<div class="line"></div>
	
	<div class="note">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;根据相关税法规定，电子发票的开票日期同网上申请电子发票的日期，如您需要当日的电子发票请务必在消费当日通过扫描下方二维码，根据指引步骤开具您的增值税电子普通发票。此二维码30天有效，扫描时请保持小票平整。</div>
	
	<div>
	<img class="qrimg" src="img/qr.png">
	</div>
	
	<div>官网：www.yonghe.com.cn</div>
	<div>加盟热线：86-21-60769397 或 86-21-60769002</div>
	
	
</body>
</html>