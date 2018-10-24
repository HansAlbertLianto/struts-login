<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN!</title>
<s:head/>
</head>
<body>

<h1 align="center">Let's Login!</h1>
<h3 align="center">CZ3002 Assignment #2 by Hans Albert Lianto, Gong Zhen and Hao Meiru</h3>

<!-- Login form that redirects to loginProcess action once submitted -->
<s:form action="loginProcess">
	<s:textfield label="Username" key="username" align="center"/>
	<s:password label="Password" key="password" align="center"/>
	<s:submit align="center"/>
</s:form>

<!-- Action error that only appears if user credentials are wrong. -->
<s:actionerror style="color: red"/>

</body>
</html>