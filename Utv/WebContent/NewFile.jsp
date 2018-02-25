<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>



<s:form action="CreateAction" onSubmit="return CheckEmail_1()">



  <div>
    <label for="email_1">メール:</label>
  </div>
  <div>
    <input type="email" id="email_1" required>
  </div>
  <div>
    <label for="emailConfirm_1">メール確認用:</label>
  </div>
  <div>
    <input type="email" id="emailConfirm_1" required>
  </div>
  <p>
    <input type="submit" id="submit">
  </p>
</s:form>



<script src="script.js"></script>

</body>
</html>