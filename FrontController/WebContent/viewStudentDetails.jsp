<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="studentDetails" type="com.frontcontroller.StudentVO" scope="request"/>
Student Id:<jsp:getProperty property="id" name="studentDetails"/>
Student name:<jsp:getProperty property="name" name="studentDetails"/>
</body>
</html>