<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="dao.Home" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="dao.Properties" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accommodation Website</title>
</head>
<body>

<h1>Accommodation Website</h1>

<a href="search.jsp">Search</a>
<a href="enquiry.jsp">Enquiry</a>

<h4> The following properties are available</h4>

<%
Home home = new Home();
ArrayList<Properties> properties = home.getAllProperties();

for(Properties property : properties) { %>
	<p><%= property %></p>
<% } %>

</body>
</html>