<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta charset="utf-8">
<title>更新完了画面</title>
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
		   height: 500px;
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
			<p>ItemUpdateComplete</p>
		</div>
		<div>
			<p>以下の商品情報を更新しました。</p>

			<h3>before</h3>
			<table border="1">
				<tr>
					<th>商品名</th>
					<th>値段</th>
					<th>在庫</th>
				</tr>
				<tr>
					<td><s:property value="session.itemName"/></td>
					<td><s:property value="session.itemPrice"/><span>円</span></td>
					<td><s:property value="session.itemStock"/><span>個</span></td>
				</tr>

			</table>

			<h3>after</h3>
			<table border="1">
				<tr>
					<th>商品名</th>
					<th>値段</th>
					<th>在庫</th>
				</tr>
				<tr>
					<td><s:property value="session.item_name"/></td>
					<td><s:property value="session.item_price"/><span>円</span></td>
					<td><s:property value="session.item_stock"/><span>個</span></td>
				</tr>
			</table>
			<s:form>
				<tr>
					<td><span>更新日：</span><s:property value="session.update_date"/></td>
				</tr>
			</s:form>
			<div>
				<a href='<s:url action="GoHomeAction"/>'>Home</a>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>