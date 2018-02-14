<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>LoginERROR</title>
</head>
<body>
<h1>エラーが発生しました</h1>
<br>
<h3>ログインできません</h3>
<br>
<s:if test='(#session.loginDTOList.get(0).username)=="該当なし"'>
該当者はいませんでした
</s:if>
<br>
<table>
<tbody>
<tr>
<th>USERNAME</th>
<th>PASSWORD</th>
</tr>

<tr>
<s:iterator value="#session.loginDTOList">
<td><s:property value="username"/></td>
<td><s:property value="password"/></td>
</s:iterator>
</tr>


</tbody>
</table>


</body>
</html>