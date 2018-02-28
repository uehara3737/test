<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<!-- ■HEAD■ -->
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>ユーザー登録画面</title>
<meta http-equiv="Content-Script-Type" content="text/javascript">
<script src="https://ajaxzip3.github.io/ajaxzip3.js" charset="UTF-8"></script>
</head>
<header>
<div class="logo">
<span class="u">U</span><span class="tv">tv</span></div>
</header>
<img src="llo-4.gif">
<!-- ■BODY■ -->
<body>
	<h1>申し込みフォーム</h1>
	<hr>
	<div class="tabc">
	<table>
		<s:form method="post" action="UserCreateConfirmAction">
		<tr><td></td><td><span>*</span><span class="memo2">の項目は必須項目です。</span></td></tr>
			<!-- ★氏名★-->
			<tr>
				<td>1. 氏 名 <span>*</span>
				</td>
				<td>姓<input type="text" name="loginIdjsp" size="10" /> 名<input
					type="text" name="loginId1jsp" size="10" required /></td>
			</tr>

			<!-- ★アカウント名★-->
			<tr>
				<td>2. アカウント名<span>*</span><span class="memo">（半角英数
						10文字以内）</span>

				</td>
				<td><input type="text" name="loginNamejsp" value=""
					pattern="^[0-9A-Za-z]+$" size="40" maxlength="10" required /></td>
			</tr>

			<!-- ★パスワード★-->
			<tr>
				<td>3. ログインパスワード<span>*</span> <span class="memo">（半角英数
						10文字以内）</span></td>
				<td><input type="text" name="loginPasswordjsp" value=""
					size="40" pattern="^[0-9A-Za-z]+$" maxlength="10" required /></td>
			</tr>

			<!-- ★メールアドレス★-->
			<tr>
				<td><label for="email_2">4. メールアドレス<span>*</span></label></td>
				<td><input type="email" name="loginMailjsp" id="email_2"
					required /></td>
			</tr>
			<tr>
				<td><label for="emailConfirm_2">  メールアドレス<span>*</span><span
						class="memo">（確認用）</span></label></td>
				<td><input type="email" id="emailConfirm_2" required
					oninput="CheckEmail_2(this)" /></td>
			</tr>

			<!-- ★郵便番号★-->
			<tr>
				<td>5. 郵便番号<span class="memo">（半角英数 ハイフンなし）</span></td>
				<!-- ▼郵便番号入力フィールド(3桁+4桁) -->
				<td>〒<input type="text" name="zip21" size="4" maxlength="3">
					－ <input type="text" name="zip22" size="5" maxlength="4"
					onKeyUp="AjaxZip3.zip2addr('zip21','zip22','addr21','addr21');">
				</td>
			</tr>
			<tr>
				<!-- ★住所★-->
				<td>6. 住 所</td>
				<td>
					<!-- ▼住所入力フィールド(都道府県+以降の住所) --> <input type="text" name="addr21"
					size="40">

				</td>
			</tr>
			<tr>
				<!-- ★電話番号★-->
				<td>7. 電話番号<span class="memo">（半角英数 ハイフンなし）</span></td>
				<td><input type="tel" name="loginTeljsp" maxlength="11" /></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<!-- ★年齢★-->
			<tr>
				<td>8. 年 齢</td>

				<td><select class="dropdown" name="age">
						<option>選択してください</option>
						<script>
							for (var i = 18; i <= 70; i++) {
								document.write("<option>" + i + "歳</option>")
							}
						</script></td>
						</select>
			</tr>

			<!-- ★アンケートフォーム★-->
			<tr>
				<td>9. Utvを知ったきっかけは？<span class="memo">（複数選択可）</span></td>

				<td><label><input type="checkbox" name="check"
						value="yahoo">Yahoo!</label> <label><input type="checkbox"
						name="check" value="google">Google</label> <label><input
						type="checkbox" name="check" value="book">雑誌</label> <label><input
						type="checkbox" name="check" value="tv">テレビ</label>
				<td>
			<tr>
				<td></td>
			</tr>

			<br>
			<br>
			<tr>
				<td><input type="reset" name="reset" value="入力内容のクリア"
					class="submit"></td>
			</tr>
			<s:submit value="次へ" class="submit" />
		</s:form>

	</table>
	</div>

	<br>
	<br>

	<br> ログインページに戻る場合は
	<span><a href='<s:url action="HomeAction"/>'>こちら</a></span>
	<hr>

</body>
<footer>
(c) U E H A R A  T V
</footer>
</html>