<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	
	车型:<input type="text" name="cname" value="${c.cname}"><br>
	
	上市时间:<input type="test" name="cdate" value="${c.cdate}"><br>
	价格(万元):<input type="text" name="cprice" value="${c.cprice}"><br>
	上传图片:<input type="file" name="tp" value="${c.tp}"><br>
	
	
	

</body>
</html>