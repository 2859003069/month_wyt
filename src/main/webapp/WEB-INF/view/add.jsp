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

<form  id="fid">

	车型:<input type="text" name="cname"><br>
	
	上市时间:<input type="date" name="cdate"><br>
	价格(万元):<input type="text" name="cprice"><br>
	上传图片:<input type="file" name="tp"><br>
	
	
	<input type="submit" value="添加" onclick="add()">

</form>

	
	

</body>

<script type="text/javascript">
	function add() {
		var data = $("#fid").serialize()
		alert(data) 
		ajax({
			url:'${pageContext.request.contextPath}/add',
			data:data,
			type:'post',
			success:function(obj){
				if(obj>0){
					alert("添加成功")
					location.href="${pageContext.request.contextPath}/selects"
				}else{
					alert("添加失败")
				}
			}
		})
	}

</script>
</html>