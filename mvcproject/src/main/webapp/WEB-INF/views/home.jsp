<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Static Name is Suman Singh</h1>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> friends = (List<String>) request.getAttribute("f");
	%>
	<h1>
		Dynamic name is
		<%=name%>
		and id is
		<%=id%>
	</h1>
	<h1>
		Multiple data using for loop:
		<%
	for (String s : friends) {
	%>
		<h1><%=s%></h1>
		<%
		}
		%>
	</h1>

</body>
</html>