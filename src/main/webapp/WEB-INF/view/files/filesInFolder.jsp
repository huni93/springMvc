<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 목록</title>
</head>
<body>
폴더 트리:
<ul>
  <c:forEach var = "folderId" items="${folderIds}">
  <li>${folderId}</li>
  </c:forEach>
</ul>
</body>
</html>