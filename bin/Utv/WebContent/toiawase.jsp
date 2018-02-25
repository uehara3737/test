<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>個別リクエスト</title>
</head>
<body>
<h1>個別リクエスト</h1>
<br>

<s:form action="ToiawaseCompleteAction">
<h3><s:property value="#session.loginUser.loginIdjsp"/>様がみたいアニメは何ですか？？</h3>
<br><br>
お気軽にどんどんリクエストをお願いします。<br>
<span>
*いただいたリスエストは取扱い作品の参考にさせていただきます。</span><br><br>
<textarea rows="4" cols="40" name="toiawasejsp"  /></textarea>
<s:submit value="送信する"  class="submit"/>
</s:form>
</body>
</html>