<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>マイページ</title>
<style>
h1{
margin-top:30px;
margin-bottom:20px;
border-left:8px #FE642E solid;
padding-top:5px;
padding-left:15px;
width:500px;
font-size:25px;}

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
</body>
</html>