<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
Accommodation acc = new Accommodation();
ArrayList<X> properties = acc.getAll();

for(X property : properties) { %>
	<p><%= property %></p>
<% } %>

</body>
</html>