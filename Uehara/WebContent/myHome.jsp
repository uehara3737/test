<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>マイページ</title>
<style>
body{background-image:url("https://images2.alphacoders.com/713/thumb-1920-713516.png");
		background-size:contain;
		background-size:cover;
}
</style>
</head>

<img src="llo-4.gif">
<body>
<h1>マイページ</h1>
<s:form action="AccountAction">
<s:submit value="アカウント情報"   class="submit"/><br>
</s:form>

<s:form action="AccountAction">
<s:submit value="視　聴　履　歴"   class="submit"/><br>
</s:form>
<s:form action="AccountAction">
<s:submit value="お気に入り"   class="submit"/><br>
</s:form>
<s:form action="ToiawaseAction">
<s:submit value="リクエスト"   class="submit"/><br>
</s:form>



<s:form action="LogoutAction">
<s:submit value="ログアウト"   class="submit"/><br>
</s:form>
<br>

</body>
<a href="javascript:history.back()">[前のページに戻る]</a>
<footer>
(c) U E H A R A  T V
</footer>
</html>