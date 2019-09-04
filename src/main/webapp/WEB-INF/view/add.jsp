<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resource/mystyles.css" type="">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
</script>
</head>
<body>
<form >
<table>

<tr>
<td>电影名称：<input type="text" name="mname"  value="${movie.mname }"> </td>
</tr>
<tr>
<td>剧情介绍：<input type="text" name="juq" value="${movie.juq }"> </td>
</tr>
<tr>
<td>导演：<input type="text" name="dector" value="${movie.dector }"> </td>
</tr>
<tr>
<td>发行日期：<input type="date" name="fdate" value="${movie.fdate }"> </td>
</tr>
<tr>
<td>类型：
<c:forEach items="${list }" var="a">
 <input type="checkbox" name="tids" value="${a.tid }">${a.tlei }
</c:forEach>


</td>
</tr>
<tr>
<td> <input type="button" value="添加"  onclick="add()"> </td>
</tr>
</table>
</form>
</body>
<script type="text/javascript">
function add(){
	
  $.post("add",$("form").serialize(),function(date){
	 
	  if(date){
		  alert("添加成功")
		  location.href="${pageContext.request.contextPath}/list"
	  }
	  
	  else{
		  alert("添加失败")
		  
	  }
	  
	  
  })
}

</script>
</html>