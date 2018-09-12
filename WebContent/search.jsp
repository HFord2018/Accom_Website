<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accommodation Website</title>
</head>
<body>

<form action="SearchServlet" method="get">
	Rental charges: <input type="text" name="price" /><br>
	City: <input type="text" name="city" /><br>
	No. of bedrooms: <input type="text" name="noBedrooms" /><br>
	<input type="submit" value="Search" />
</form>

</body>
</html>