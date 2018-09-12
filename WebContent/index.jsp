<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Accommodation acc = new Accommodation();
ArrayList<X> acc.getAll();

for(X property : acc) {
	out.println(property);
}

%>

</body>
</html>