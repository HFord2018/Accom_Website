<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accommodation Website</title>
</head>
<body>

<form action="EnquiryServlet" method="post">
	Name: <input type="text" name="name" /><br>
	Email: <input type="text" name="email" /><br>
	Message: <textarea name="message"></textarea><br>
	<input type="submit" value="Submit" />
</form>

</body>
</html>