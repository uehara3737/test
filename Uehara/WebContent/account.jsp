<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>アカウント情報</title>
</head>
<img src="llo-4.gif"><h1>お客様 アカウント情報</h1>
<body>

<hr><br>
<div class="taba">
<table>
<tr><td>■  契  約  日　</td><td>|   <s:property value="#session.loginUser.dateUtil"/></td></tr>
<tr><td>■  氏　　名　</td><td>|   <s:property value="#session.loginUser.loginIdjsp"/> <s:property value="#session.loginUser.loginId1jsp"/></td></tr>
<tr><td>■  アカウント名　</td><td>|   <s:property value="#session.loginUser.loginNamejsp"/></td></tr>
<tr><td>■  メールアドレス</td><td>|   <s:property value="#session.loginUser.loginMailjsp"/></td></tr>
<tr><td>■  住　　所</td><td>|   <s:property value="#session.loginUser.loginJusyojsp"/></td></tr>
<tr><td>■  電話番号</td><td>|   <s:property value="#session.loginUser.loginTeljsp"/></td></tr>

</table>
</div>
<br><br>
<s:form action="MyHomeAction">
<s:submit value="マイホームに戻る"   class="submit"/><br></s:form><br><br>
<s:form action="UtvHomeAction">
<s:submit value="Utvホーム"   class="submit"/><br></s:form><br>
アカウント情報変更は<span><a href='<s:url action="HenkouAction"/>'>こちら</a></span>
<hr>

</body>
<footer>
(c) U E H A R A  T V
</footer>
</html>