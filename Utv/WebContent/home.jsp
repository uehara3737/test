<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="UTF-8">


<title>Home</title>


</head>
<body>
<header>
<div class="logo">
<span class="u">U</span><span class="tv">tv</span></div>
</header>

<h1>Ｕｔｖへようこそ！</h1>
<hr class="hr1">
<s:form action="HomeAction">
<s:submit value="ログイン" class="submit"/>
</s:form>
<br>
<br>
<br>
<br>
<br>
<br>
<hr>

</body>
<footer>
(c) U E H A R A  T V
</footer>
</html>