<%@page import="java.util.ArrayList"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.NEW"%>
<%@page import="bean.Emloyee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
#box{ width:500px; height:600px; background-color:#FFFFCC; margin-left:400px; background:url("../img/bg.jpg");}
.message{color:#FF0000; margin-left:100px; display:block; margin-top:20px;}
.message input{ padding-left:30px;}
#but{ text-align:center; padding-left:10px; margin-top:50px;}
#box_1{ padding-left:50px;}
</style>
</head>
<body><font face="宋体" size="+3" style=" display:block; text-align:center; color:#FF0000"><b>员工信息</b></font>
<table align="center"border="1" class="table table-striped table-borderd">
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
<form method="post" action="SelectDataServlet" name="myform">
<div id="box">
<div id="box_1">
<table>

<%-- <tr>
<td class="message">姓名：<input type="text" name="mess1" style="border:none; background-color:#FFFFCC" value="<%=em.getUsername()%>" /></td>
</tr>
<tr>
<td class="message">性别：<input type="text" name="mess2" style=" border:none; background-color:#FFFFCC"  value="<%=em.getSex()%>"/></td>
</tr>
<tr>
<td class="message">部门：<input type="text" name="mess3" style=" border:none; background-color:#FFFFCC" value="<%=em.getSection()%>"/></td>
</tr>
<tr>
<td class="message">职称：<input type="text" name="mess4" style=" border:none; background-color:#FFFFCC"  value="<%=em.getTitle()%>"/></td>
</tr>
<tr>
<td class="message">年龄：<input type="text" name="mess5" style=" border:none; background-color:#FFFFCC"  value="<%=em.getAge()%>"/></td>
</tr>
<tr>
<td class="message">工号：<input type="text" name="mess6" style=" border:none; background-color:#FFFFCC"  value="<%=em.getId()%>"/></td>
</tr>
<tr>
<td class="message">工资：<input type="text" name="mess7" style=" border:none; background-color:#FFFFCC"  value="<%=em.getSalary()%>"/></td>
</tr> --%>

</div>
</table>
<div id="but">
<input type="submit" value="关闭" style="background-color:#FF0000"></input>
</div>
</div>
</form>
</body>
</html>