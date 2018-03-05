<%@page import="bean.Emloyee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<style>
body{ background-color:#FFFFCC}

#head{ width:100%; height:60px;line-height:60px;}
#body{ width:1000px; height:600px; background-color:#FFCCCC; margin-top:10;}
#bodyh{ width:1000px; height:100px;}
#bodyh_1{ width:600px; height:100px; background-color:#FF99CC;padding-left:0px; float:left}
#bodyh_1_img{ width:100px; height:100px; float:left}
#bodyh_2{ width:500px; height:100px; float:left;}
#butt{ width:400px; height:100px; background-color:#FFFFa1;float:left; text-align:center; line-height:100px;}
</style>
</head>
<body>
<div style=" width:1000px;margin: 0 auto;">
<div id="head" align="center">
<font size="+4"><b>员工信息显示系统</b></font>
</div>
<div id="body">
<div id="bodyh">
<div id="bodyh_1">
<div id="bodyh_1_img"><img src="img/11.jpg" width="100" height="100"></img></div>
<div id="bodyh_2">

<form>
<label>管理员信息</label>
<table>

<tr>
<td>工号：</td>
<td><input type="text" value="<%=request.getAttribute("id") %>"/></td>
</tr>

</table>
</form>
</div>
</div>
<div id="butt">

<table width="70px" height="10px"><tr>
<input  type="button" onclick="window.open('filterpage/save.jsp')" value="增加员工信息" style="background-color:#FF0000 ;width: 100px;height: 50px;line-height: 50px;margin-left:-100px;"></input>


</tr>
<tr>
<td>
<form action="SelectDataServlet" method="post"><td><input type="text" style="width: 70px; height: 50px;line-height: 50px;" name="selectid" id="selectid"/></td>
<td><input type="submit" style="background-color:#FF0000;width: 60px; height:50px;line-height: 50px;margin-top:0px;" value="查询"></td>
</form>
<td>
<form action="updateServlet" method="post"><td><input  type="text" style="width: 70px; height: 50px;line-height: 50px;" name="selectid" id="selectid"/></td>
<td><input type="submit" style="background-color:#FF0000;width: 60px; height: 50px;line-height: 50px;margin-top:0px;" value="修改"></td>
</form>
<td>
<form action="Deletedata" method="post"><td><input type="text" style="width: 70px; height: 50px;line-height: 50px;" name="selectid" id="selectid"/></td>
<td><input type="submit" style="background-color:#FF0000;width: 60px; height: 50px;line-height: 50px;margin-top:0px;" value="删除"></td>
</form>
<!-- <input type="text" style="width: 100px; height: 50px" name="selectid" id="selectid"/></td> -->
<!-- <td><input type="button" onclick="window.open('filterpage/select.jsp')" value="查询员工信息" style="background-color:#FF0000 ;width: 100px;height: 50px;line-height: 50px;"></input></td>
<td><input type="button" onclick="window.open('filterpage/update.jsp')" value="修改员工信息" style="background-color:#FF0000 ;width: 100px;height: 50px;line-height: 50px;"></input></td>
<td><input type="button" onclick="window.open('filterpage/delete.jsp')" value="删除员工信息" style="background-color:#FF0000 ;width: 100px;height: 50px;line-height: 50px;"></input></td> -->
</tr></table>

</div>
</div>

<div id="bodyq">


<table align="center" border="1" class="table">
<br>
<br>
<br>

         
<%

	ArrayList<Emloyee> list = (ArrayList<Emloyee>)request.getAttribute("LIST2");
             
			out.print("<tr>");
			out.print("<td>"+"工号"+"</td>");
			out.print("<td>"+"用户名"+"</td>");
			out.print("<td>"+"年龄"+"</td>");
			out.print("<td>"+"性别"+"</td>");
			out.print("<td>"+"职称"+"</td>");
			out.print("<td>"+"部门"+"</td>");
			out.print("<td>"+"工资"+"</td>");
			out.print("</tr>");
	for(int i=0;i<list.size();i++){
		
		out.print("<tr>");
		out.print("<td>"+list.get(i).getId()+"</td>");
		out.print("<td>"+list.get(i).getUsername()+"</td>");
		out.print("<td>"+list.get(i).getAge()+"</td>");
		out.print("<td>"+list.get(i).getSex()+"</td>");
		out.print("<td>"+list.get(i).getTitle()+"</td>");
		out.print("<td>"+list.get(i).getSection()+"</td>");
		out.print("<td>"+list.get(i).getSalary()+"</td>");
		out.print("</tr>");
	}
	
%>
</table>

</div>
</div>
</div>
</body>
</html>