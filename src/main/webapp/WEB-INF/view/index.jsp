<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
    <li>Hello====
    <li><a href = "${pageContext.request.contextPath}/index.kic">index.kic</a></li>
    <li><a href = "${pageContext.request.contextPath}/index2.kic">index2.kic.do</a></li>
    <li><a href = "${pageContext.request.contextPath}/index.kic2">index.kic2</a></li>
</ul>

<ul>
  <li> model
  <li><a href = "${pageContext.request.contextPath}/event/list">event/list</a></li>
   <li><a href = "${pageContext.request.contextPath}/event/detail">event/detail</a></li>
</ul>

</body>
</html>