<!-- part.1 -->
<%-- <%@ page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is help page</h1>
	<%
	String name = (String) request.getAttribute("name");
	Integer rn = (Integer) request.getAttribute("rn");
	LocalDateTime time = (LocalDateTime) request.getAttribute("t");
	%>
	<h1>
		Name is:
		<%=name%>
		and roll no is:
		<%=rn%> and current date & time is: <%= time.toString() %></h1>
		
</body>
</html> --%>


<!-- part.2 -->
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is help page</h1>
	<%
	/* String name = (String) request.getAttribute("name");
	Integer rn = (Integer) request.getAttribute("rn");
	LocalDateTime time = (LocalDateTime) request.getAttribute("t"); */
	%>
	<h1>
		Name is:
		<%-- <%=name%> --%>
		${name} and roll no is: ${rn}
		<%-- <%=rn%>  --%>
		and current date & time is: ${t}
		<hr>
		${marks}
		<hr>
		<c:forEach var="item" items="${marks }">
			<%-- <h1>${item }</h1> --%>
			<h1><c:out value="${item}" /></h1>
		</c:forEach>

		<%-- <%= time.toString() %> --%>
	</h1>

</body>
</html>