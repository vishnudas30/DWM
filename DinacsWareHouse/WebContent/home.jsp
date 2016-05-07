<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DWM</title>
</head>
<body bgcolor="yellow">
<div  align="center">
<h1>Dinacs Ware house Management </h1> </div>

<br><br><br><br><br><br><br><br>
<div align="center">

<a href="createitem.jsp"><b>+  Create an Item</b></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<a href="warehouse?warehouseAction=getAllItems"><b>---  Available Items</b></a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


<a href="search.jsp"><b> Search Item!!!   </b></a>

<%session.setAttribute("name","item");
session.setAttribute("pass", "itemobj");
%>
</div>
</body>
</html>