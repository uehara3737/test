<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
body{background-image:url("https://images5.alphacoders.com/698/thumb-1920-698784.png");
background-size:contain;
		background-size:cover;
}
.ri{
text-align:center;}

</style>
<title>個別リクエスト</title>
</head>
<img src="llo-4.gif">
<body>


<div class="toiawase">

<s:form action="ToiawaseCompleteAction">
<h3>個別リクエスト</h3>
<h3><s:property value="#session.loginUser.loginIdjsp"/>様がみたいアニメは何ですか？？</h3>
<br><br>
お気軽にどんどんリクエストをお願いします。<br>
<span class="toiawasespan">
*いただいたリスエストは取扱い作品の参考にさせていただきます。</span><br><br>
<textarea rows="4" cols="40" name="toiawasejsp"  /></textarea><br><br>
<s:submit value="送信する"  class="toiawasesubmit"/>

</s:form>

</div>


</body>
<footer>
(c) U E H A R A  T V
</footer>
</html>