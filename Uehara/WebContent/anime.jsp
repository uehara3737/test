<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style>
table {
margin:0 auto;
border-spacing: 0;
font-size:14px;
}
table tr:hover {
cursor:pointer;
}
table.gazou{
width:60px;
height:20px;
border:1px;
}
table.animesetumei{
	font-siza:15px;
	font-color:pink;
}

table{
maegin:0 auto;
}

table.gazou{
width:100px;
height:20px;
border:1px;
}
h1{
margin-top:30px;
margin-bottom:20px;
border-left:8px #DC143C solid;
padding-top:5px;
padding-left:15px;
width:500px;
font-size:25px;}

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

.kensaku{
margin:top:10px;
right:0;
}
</style>

<title>Insert title here</title>
</head>
<img src="llo-4.gif">
<body>
<div class="kensaku">
<s:form action="ItemSearchAction">
					<s:textfield name="searchWord" value=""/>
					<s:submit value="検索"/></div>
<s:if test="message != ''">
			<h3><s:property value="message" escape="false"/></h3>
		</s:if>

			</s:form>

			<h1>2018年放送中アニメ</h1>
<div class="tab">
<table>

<s:form action="BuyAnimeAction">
<s:iterator value="#session.animeDTOList">
<tr><td><font face="ＭＳ Ｐゴシック" size="6" color="#DC143C">＜<s:property value="animeName" />＞</font><br><div class="gazou"><img src="https://animeanime.jp/imgs/list_ml/47687.jpg"></div>
</td><td>
<s:property value="animeSetumei" /><br>
<s:property value="animeType" /><br></td><td>
レンタル期間　<select name="animeCount">
							<option value="1" selected="selected">1ヶ月</option>
							<option value="2">2ヶ月</option>
							<option value="3">3ヶ月</option>
							<option value="4">4ヶ月</option>
							<option value="5">5ヶ月</option>
						</select><br><br>
<s:property value="animePrice"  />円／１ヵ月
<input type="radio" name="pay" value="1" checked="checked">現金払い
<input type="radio" name="pay" value="2">クレジットカード
</td></tr>
<tr><td>

<br></td><td></td><td></td><td><s:submit value="視聴する" class="submit"/></td></tr>
</s:iterator>
<tr><td>
<input type="radio" name="pay" value="1" checked="checked">現金払い
<input type="radio" name="pay" value="2">クレジットカード
<br></td><td>
<br>
<s:submit value="購  入" class="submit"/></td></tr>
</s:form>
</table>
</div>
</body>
<a href="javascript:history.back()">[前のページに戻る]</a>
</html>