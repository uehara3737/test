<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>ようこそUtvへ！</title>
</head>
<body>
	<h1>ログイン完了しました。</h1>
（utvhome.jsp)
	<br>

<br>
<s:form action="MyHomeAction">
<br><br><br>
<span>
	<s:property value="#session.loginUser.loginIdjsp"/>
</span>
	さんようこそ！
	<br>お楽しみください。<br>
	キャンペーン情報はこちら
<s:submit value="マイホーム"   class="submit"/><br>
</s:form>
<s:form action="UtvHomeAction">
<s:submit value="Utvホーム"   class="submit"/><br>
</s:form>
<!--<s:submit value="お気に入り"  action="OkiniiriAction" class="submit"/><br>
<s:submit value="ログアウト"  action="LogoutAction" class="submit"/><br>
-->
</body>
</html>