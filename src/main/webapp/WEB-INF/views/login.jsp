<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/login" method="post">
	<center><table>
  <tr>
	<td colspan="2"><b>用户登录</b></td>
  </tr>
  <tr>
	<td>用户名：</td>
	<td><input name="username" size="24"></td>
  </tr>
  <tr>
	<td>密    码：</td>
	<td><input name="passwd" size="24" type="password"></td>
  </tr>
  <tr>
	<td><input type="submit" value="登    录" /></td>
	<td><input type="reset" value="重    置" /></td>
  </tr>
  </table></center>
  </form>
</body>
</html>