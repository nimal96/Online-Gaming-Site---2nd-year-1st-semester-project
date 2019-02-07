<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.oop.bean.GameBean"%>
<%@ page import="com.oop.dao.GameDao"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="listgames.css" >
<title>Edit User</title>
</head>
<body>
<%
	GameBean user = new GameBean();
%>
<%
	GameDao dao = new GameDao();
%>
<form method="POST" action='GameHandler' name="frmEditUser"><input
type="hidden" name="action" value="edit" /> 
<%
String uid = request.getParameter("userId");
if (!((uid) == null)) {
int id = Integer.parseInt(uid);
user = dao.getUserById(id);
%>
<table>
<tr>
<td>Game ID</td>
<td><input type="text" name="userId" readonly="readonly"
value="<%=user.getId()%>"></td>
</tr>
<tr>
<td> Name </td>
<td><input type="text" name="firstName" /></td>
</tr>
<tr>
<td>Developer </td>
<td><input type="text" name="lastName" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Update" /></td>
</tr>
</table>
<%
} else
out.println("ID Not Found");
%>
</form>
</body>
</html>