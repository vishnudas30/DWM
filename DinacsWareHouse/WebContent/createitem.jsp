<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body colour="yellow">
<form action="warehouse" method="post">
<input type="hidden" name="warehouseAction" value="createItem"/><br><br>

Item Id: <input type="text" name="itemid" /><br><br>

Item Name: <input type="text" name="itemname" /><br><br>
Item Qty: <input type="text" name="itemqty" /><br><br>
Item MRP: <input type="text" name="itemmrp" /><br><br>
Total Cost: <input type="text" name="totalcost" /><br><br>

<input type="submit" name="createitem" value="Create Item"/>


</form>
</body>
</html>