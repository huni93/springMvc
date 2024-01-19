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

<ul>
  <li>@RequestMapping, @PathVariable:</li>
  <li><a href="${pageContext.request.contextPath}/member/regist">member/regist</a>:
    GET/POST 예, RegistrationController</li>
    
    <li><a href="<%=request.getContextPath()%>/members">/members</a>:
    @PathVariable 사용 위한 목록 출력, MemberController.members()</li>
    <li><a href="<%=request.getContextPath()%>/members/m2">/members/m2</a>:
    @PathVariable 예, MemberController.memberDetail()</li>
    
    <!-- // ----------------------추가 예정 -->
</ul>

<ul>
   <li><a href="<%=request.getContextPath()%>/upload/form">/upload/form</a>:
    파일 업로드 폼, UploadController</li> 
</ul>

</body>
</html>