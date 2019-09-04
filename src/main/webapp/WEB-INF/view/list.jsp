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
<input type="button" value="添加" onclick="add()">
<form action="list" method="post">
<input type="text" name="mname" placeholder="请输入姓名" value="${mname }">
<input  type="submit" value="查询"> 

</form>
<table>
<tr>

<td>编号</td>
<td>名称</td>
<td>剧情介绍</td>
<td>导演</td>
<td>发行日期</td>
<td>类型</td>
<td>操作</td>
</tr>
<c:forEach items="${list }" var="a">
<tr>
<td>${a.mid }</td>
<td>${a.mname }</td>
<td>${a.juq }</td>
<td>${a.dector }</td>
<td>${a.fdate }</td>
<td>${a.q }  </td>
<td><input type="button" value="删除" onclick="deleteid(${a.mid})"> 
<input type="button" value="修改" onclick="update(${a.mid})">
 </td>
</tr>
</c:forEach>
</table>
</body>
<script type="text/javascript">
function add(){
	
	location.href="${pageContext.request.contextPath}/toadd"
	
	
}

function deleteid(mid)
{
	$.post("delete",{mid:mid},function(date){
		if(date){
			alert("删除成功")
			location.href="${pageContext.request.contextPath}/list"
			
		}
		else{
			alert("删除失败")
		}
		
	})
	
	
	}
function update(mid){
	
	location.href="${pageContext.request.contextPath}/toupdate?mid="+mid	
	
}


</script>
</html>