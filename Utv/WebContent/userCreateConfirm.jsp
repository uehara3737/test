<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登録確認画面</title>
</head>
<header>
<div class="logo">
<span class="u">U</span><span class="tv">tv</span></div>
</header>
<body>
	<p>UserCreateConfirm.jsp</p>
	<div>
	<hr>
		<h4>登録する内容は以下でよろしいですか？</h4>
<div class="taba">
		<table>
			<s:form action="UserCreateCompleteAction">
				<tr>
					<td><label>氏 名</label></td>
					<td><s:property value="loginIdjsp" escape="false" />
					<s:property value="loginId1jsp" escape="false" /></td>
				</tr>
				<tr>
					<td>アカウント名</td>
					<td>
						<!-- 下の文は特になくてもよい。↓他の人にもコメントとしてわかりやすいように --> <s:property
							value="loginNamejsp" escape="false" />
					</td>
				</tr>
				<tr>
					<td>ログインパスワード</td>
					<td><s:property value="loginPasswordjsp" escape="false" /></td>
				</tr>
				<tr>
					<td>メールアドレス</td>
					<td><s:property value="loginMailjsp" escape="false" /></td>
				</tr>
				<tr>
					<td>郵便番号</td>
					<td><s:property value="zip21" escape="false" />-<s:property value="zip22" escape="false" /></td>
				</tr>
				<tr>
					<td>住 　　所</td>
					<td><s:property value="addr21" escape="false" /></td>
				</tr>
				<tr>
					<td>電話番号</td>
					<td><s:property value="loginTeljsp" escape="false" /></td>
				</tr>

				<tr><td></td><td></td>
					<td><s:submit value="登録" class="submit" /> </td>
				</tr>
			</s:form>
		</table>
		</div>
<br><br>
		入力画面に戻る場合は<span><a href='<s:url action="CreateAction"/>'>こちら</a></span>

	</div>
</body>
<footer>
(c) U E H A R A  T V
</footer>
</html>