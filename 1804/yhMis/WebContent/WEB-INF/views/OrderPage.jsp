<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="css/base.css">
<title>永和大王门店管理系统</title>
</head>
<body>
	<div>顾客联</div>
	<div class="please">请您留意取餐账单号</div>
	<div class="me">自取顾客联</div>
	<div>${order.door.doorName}</div>
	<div>${order.door.doorTel}</div>
	<div class="me">--结账单--</div>	
	<div class="please">账单号：${order.orderNo}</div>
	<div>账单类型：${order.orderType}</div>
	<div>人数：${order.personNum}</div>
	<div>收银员：${order.casher}</div>
	<div>开单时间:${order.createTime}</div>
	<div>结账时间:${order.endTime}</div>
	<hr class="line">
	<div>
	<table>
	<tr><td width="40">数量</td><td width="170">品项</td><td width="40" align="right">金额</td></tr>
	<c:set var="total" value="0" />
	<c:forEach items="${order.orderDtails}" var="o" >
	<c:set var="total" value="${total + o.price}"/>
	<tr>
		<td valign="top">${o.num}</td>
		<td>${o.item}</td>
		<td valign="top" align="right">
		<fmt:formatNumber type="number" value="${o.price}" pattern="#.00"/>
		</td>
	</tr>
	</c:forEach>
	</table>	
	<hr class="line">
	<table>
	<tr>
		<td width="40">
		合计
		</td>
		<td width="170"></td>
		<td width="40" align="right">
		<fmt:formatNumber type="number" value="${total}" pattern="#.00"/>
		</td>
	</tr>
	<tr>
		<td>
		${order.paymentType}
		</td>
		<td></td>
		<td align="right">
			<fmt:formatNumber type="number" value="${order.payment}" pattern="#.00"/>
		</td>
	</tr>
	</table>
	</div>
	
	<hr class="line">
	<div>打印时间：${order.printTime}</div>
	<hr class="line">
	
	<div class="note">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;根据相关税法规定，电子发票的开票日期同网上申请电子发票的日期，如您需要当日的电子发票请务必在消费当日通过扫描下方二维码，根据指引步骤开具您的增值税电子普通发票。此二维码30天有效，扫描时请保持小票平整。</div>
	
	<img class="qrimg" src="img/qr.png">
	
	<div>官网：www.yonghe.com.cn</div>
	<div>加盟热线：86-21-60769397 或 86-21-60769002</div>	
</body>
</html>