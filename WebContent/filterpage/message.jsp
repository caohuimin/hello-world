<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
#box{ width:500px; height:600px; background-color:#FFFFCC; margin-left:400px; background:url("../img/bg.jpg");}
.message{color:#FF0000; margin-left:100px; display:block; margin-top:20px;}
.message input{ padding-left:30px;}
#but{ text-align:center; padding-left:10px; margin-top:50px;}
#box_1{ padding-left:50px;}
</style>
<script>
function messChange(){
/* document.myform.mess1.removeAttribute("disabled");
document.myform.mess2.removeAttribute("disabled");
document.myform.mess3.removeAttribute("disabled");
document.myform.mess4.removeAttribute("disabled");
document.myform.mess5.removeAttribute("disabled");
document.myform.mess6.removeAttribute("disabled");
document.myform.mess7.removeAttribute("disabled"); */
}
</script>
</head>
<body>
<form method="post" action="../updateServlet" name="myform">
<div id="box">
<div id="box_1">
<table>
<font face="宋体" size="+4" style=" display:block; text-align:center; color:#FF0000"><b>员工信息</b></font>
<tr>
<td class="message">姓名：<input type="text" name="mess1" style="border:none; background-color:#FFFFCC"  value=""/></td>
</tr>
<tr>
<td class="message">性别：<input type="text" name="mess2" style=" border:none; background-color:#FFFFCC"  value=""/></td>
</tr>
<tr>
<td class="message">部门：<input type="text" name="mess3" style=" border:none; background-color:#FFFFCC" value=""/></td>
</tr>
<tr>
<td class="message">职称：<input type="text" name="mess4" style=" border:none; background-color:#FFFFCC"  value=""/></td>
</tr>
<tr>
<td class="message">年龄：<input type="text" name="mess5" style=" border:none; background-color:#FFFFCC" value=""/></td>
</tr>
<tr>
<td class="message">工号：<input type="text" name="mess6" style=" border:none; background-color:#FFFFCC" value=""/></td>
</tr>
<tr>
<td class="message">工资：<input type="text" name="mess7" style=" border:none; background-color:#FFFFCC"  value=""/></td>
</tr>

</table>
<div id="but">
<a href="../updateServlet"><button>修改</button></a>
<a href="../insertData"><button>保存</button></a>
</div>
</div>
</div>
</form>
</body>
</html>