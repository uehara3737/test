<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta charset="utf-8">
<title>更新情報入力画面</title>
<style type="text/css">
	/* ========TAG LAYOUT======== */
		body {
		   margin:0;
		   padding:0;
		   line-height:1.6;
		   letter-spacing:1px;
		   font-family:Verdana, Helvetica, sans-serif;
		   font-size:12px;
		   color:#333;
		   background:#fff;
		}

		table {
			text-align:center;
			margin:0 auto;
		}

	/* ========ID LAYOUT======== */
		#top {
		   width:780px;
		   margin:30px auto;
		   border:1px solid #333;
		}

		#header {
		   width: 100%;
		   height: 80px;
		   background-color: black;
		}

		#main {
		   width: 100%;
		   height: 1100px;
		   text-align: center;
		}

		#footer {
			width: 100%;
			height: 80px;
			background-color: black;
			clear:both;
		}
	</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>

	<div id="main">
		<div id="top">
			<p>ItemUpdateEnter</p>
		</div>
		<div>
			<h3>更新する商品情報を入力してください。</h3>
			<s:form action="ItemUpdateEnterAction">
			<s:iterator value="list">
				<tr>
					<td>商品名：</td>
					<td><input type="text" name="item_name" value="<s:property value='itemName'/>"></td>
				</tr>
				<tr>
					<td>値段：</td>
					<td><input type="text" name="item_price" value="<s:property value='itemPrice'/>"></td>
				</tr>
				<tr>
					<td>在庫：</td>
					<td><input type="text" name="item_stock" value="<s:property value='item_stock'/>"></td>
				</tr>
			</s:iterator>
				<tr>
					<td><s:submit value="更新"/></td>
				</tr>

			</s:form>
			<div>
				<a href='<s:url action="HomeAction"/>'>管理画面へ</a>
				<a href='<s:url action="GoItemUpdateAction"/>'>戻る</a>
			</div>
		</div>
	</div>


		<div id="footer">
			<div id="pr">
			</div>
		</div>

</body>
</html>