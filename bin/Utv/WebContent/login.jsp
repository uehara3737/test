<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
<style type="text/css">
h2{
margin-top:30px;
margin-bottom:20px;
border-left:8px #FE642E solid;
padding-top:5px;
padding-left:15px;
width:500px;
font-size:25px;}
h3{text-align:right;
	margin-right:20px;
	 margin-top:20px;
	}
th{border-left:8px solid #FE642E;
}

table{
margin:0 auto;}

.touroku{
text-align:center;}

.submit{
border:1px solid lightgray;
padding:4px 10px;
color:white;
background-color:#bfbfbf;
border-radius:5px;
border-bottom:solid 2px gray;}

</style>
</head>
<body>
<h2>ログイン(login.jsp)</h2>
<hr>
<h3>Utvアカウント</h3>


<table>
<s:form action="LoginAction">
<tr>
<th>アカウント名</th>
</tr>
<tr>
<td>
<s:textfield name="loginNamejsp"/>
</td></tr>

<tr>
<th>パスワード</th></tr><tr>
<td><s:password name="loginPasswordjsp"/></td>
<td>
<s:submit value="ログイン" class="submit"/>
</td>
</tr>
</s:form>
</table>
<br>
<br>
<div class="touroku">
<span>Utv 新規登録は</span><a href='<s:url action="CreateAction"/>'>こちら</a></div>


</body>
</html>