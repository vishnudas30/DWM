<%@page import="java.util.List"%>
<%@page import="com.dinacs.warehouse.model.DwmModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List <DwmModel> itemListvalue = (List<DwmModel>) request.getAttribute("availableItemList");

%>
<table border="1" bgcolor="yellow" cellpadding="30">
<thead>
<tr>
<th>
Item Id:
</th>
<th>
Item Name:
</th>
<th>
Item Qty:
</th>
<th>
Item MRP:
</th>
<th>
Total Cost:
</th>
</tr>

</thead>
<%

for(DwmModel item : itemListvalue){%>
	
	<tr>
	<td><%= item.getItemid()%></td>
	
	<td><%= item.getItemname()%></td>
	
	<td><%= item.getQty()%></td>
	<td><%= item.getMrp()%></td> 
	<td><%= item.getTotal()%></td> 
	<td><a href="warehouse?warehouseAction=delete&id=<%= item.getItemid()%>">delete </a><br>
 </td>
 	<td><a href="warehouse?warehouseAction=getproductItem&id=<%= item.getItemid()%>">update</a> <br>
 </td>
	</tr><%} %>	
</table>


</body>
</html>