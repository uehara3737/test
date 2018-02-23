<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登録確認画面</title>
</head>
<body>
	<p>UserCreateConfirm.jsp</p>
	<div>
	<hr>
		<h3>登録する内容は以下でよろしいですか？</h3>

		<table>
			<s:form action="UserCreateCompleteAction">
				<tr>
					<td><label>氏 名</label></td>
					<td><s:property value="loginIdjsp" escape="false" />
					<s:property value="loginId1jsp" escape="false" /></td>
				</tr>
				<tr>
					<td><label>アカウント名</label></td>
					<td>
						<!-- 下の文は特になくてもよい。↓他の人にもコメントとしてわかりやすいように --> <s:property
							value="loginNamejsp" escape="false" />
					</td>
				</tr>
				<tr>
					<td><label>ログインパスワード</label></td>
					<td><s:property value="loginPasswordjsp" escape="false" /></td>
				</tr>
				<tr>
					<td><label>メールアドレス</label></td>
					<td><s:property value="loginMailjsp" escape="false" /></td>
				</tr>
				<tr>
					<td><label>郵便番号</label></td>
					<td><s:property value="zip21" escape="false" />-<s:property value="zip22" escape="false" /></td>
				</tr>
				<tr>
					<td><label>住 　　所</label></td>
					<td><s:property value="addr21" escape="false" /></td>
				</tr>
				<tr>
					<td><label>電話番号</label></td>
					<td><s:property value="loginTeljsp" escape="false" /></td>
				</tr>

				<tr>
					<td><s:submit value="完了" class="submit" /> </td>
				</tr>
			</s:form>
		</table>

		入力画面に戻る場合は<span><a href='<s:url action="CreateAction"/>'>こちら</a></span>

	</div>
</body>
</html>