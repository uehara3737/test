<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<style>
.submit{
border:1px solid #FF8856;
padding:4px 10px;
color:white;
background-color:#FF9872;
border-radius:5px;
border-bottom:solid 3px #FF4F02;}

.submit:hover{
background-color:#FF5F17;
cursor:pointer;
}
body{background-image:url("https://img.nijimen.net/uploads/tag_noun/main_image/6/thumb_73de9cf3-9a9c-41bc-bc0c-aa64d8706b35.jpg");
background-size:cover;
}
footer{position:fixed;
bottom:0;
left:0;
	width:100%;
	height:30px;
	background-color:#FF8856;
	color:#FFEFD5;
	text-align:center;
	line-height:30px;
	font-family:"メイリオ";
	font-size:10px;
}
</style>
<s:head/>
<title>ようこそUtvへ！</title>
</head>
<img src="llo-4.gif">
<body>
<br>
<font face="ＭＳ Ｐゴシック" size="4">
<%int yea=new java.util.Date().getYear();
int year=yea+1900;
int mont=new java.util.Date().getMonth();
int month=mont+1;
out.println(year+"年"+month+"月"+new java.util.Date().getDate()+"日");
%>
<br>
<span><font face="ＭＳ Ｐゴシック" size="6">
	<s:property value="#session.loginUser.loginIdjsp"/>
</span>
	さんようこそ！
	<br>お楽しみください。<br></font>
	<font face="ＭＳ Ｐゴシック" size="4" color="red">キャンペーン情報はこちら<br></font>





<s:form action="MyHomeAction">
<s:submit value="マイホーム"   class="submit"/><br>
</s:form>

<s:form action="AnimeAction">
<s:submit value="アニメ一覧" class="submit"/><br>
</s:form>

<s:form action="LogoutAction">
<s:submit value="ログアウト"   class="submit"/><br>
</s:form>

</body>
<footer>
(c) U E H A R A  T V
</footer>
</html>