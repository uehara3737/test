<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>ログイン画面</title>

</head>
<header>
<div class="logo">
<span class="u">U</span><span class="tv">tv</span></div>
</header>
<body>
<h1>ログイン(login.jsp)</h1>
<h3 class="loginh3">Utvアカウント</h3>
<hr>
<br><br>
<div class="tab">
<table class="ta">

<s:form action="LoginAction">
<tr>
<th>アカウント名</th>
<td><s:textfield name="loginNamejsp" class="textfield"/></td>
</tr>


<tr>
<th>パスワード</th>
<td><s:password name="loginPasswordjsp" class="textfield" /></td>
</tr>
<br>
<tr><td></td><td>
<s:submit value="ログイン" class="submit"/>
</td>
</tr>
</s:form>
</table>
</div>
<br>
<br>
<div class="touroku">
<span>Utv 新規登録は</span><a href='<s:url action="CreateAction"/>'>こちら</a>

<s:form action="OtamesiAction">
<s:submit value="30日間 無料お試し" class="otamesisubmit"/>
</s:form>
</div>
</body>
<footer>
(c) U E H A R A  T V
</footer>
</html>