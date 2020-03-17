<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 引入 css -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- 引入js -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
</head>

<body>

<form action="${pageContext.request.contextPath}/selects" method="post" id="fid" >

	车型:<input type="text" name="cname" value="${carVO.cname}">
	<input type="submit" value="查询">
	价格:<input type="text" name="startPrice" value="${carVO.startPrice}">---<input type="text" name="endPrice" value="${carVO.endPrice}">
	<input type="submit" value="查询">
	上市日期:<input type="text" name="startcdate" value="${carVO.startcdate}">---<input type="text" name="endcdate" value="${carVO.endcdate}">
	<input type="submit" value="查询">



</form>

<table class="table">

	<tr>
		<td>编号</td>
		<td>车型</td>
		<td>汽车类型</td>
		<td>上市日期</td>
		<td>价格</td>
		<td>图片</td>
		<td>操作
			<a href="${pageContext.request.contextPath}/add">添加</a>
		</td>
		
	
	</tr>
<c:forEach items="${info.list}" var="c">
<tr>
		<td>${c.id}</td>
		<td>${c.cname}</td>
		<td>${c.wx}</td>
		<td>${c.cdate}</td>
		<td>${c.cprice}万元</td>
		<td>${c.tp}</td>
		<td>
		<a href="${pageContext.request.contextPath}/selectById?id=${c.id}">详情</a>
		
		</td>
		
	
	</tr>


</c:forEach>
	<tr align="center">
		<td colspan="10">
			<jsp:include page="/WEB-INF/view/pages2.jsp"></jsp:include>
		
		</td>
	</tr>

</table>


</body>
	<script type="text/javascript">
		function goPage(page) {
			location.href="${pageContext.request.contextPath}?page="+page
		}
	
	
	</script>


</html>