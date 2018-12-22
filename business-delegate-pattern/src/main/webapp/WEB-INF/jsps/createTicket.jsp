<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Ticket</title>
</head>
<body>
<form action="createTicket" method="post">
Movie: <input type="text" name="movieName"/>
Screen: <input type="text" name="screenType"/>
Seat: <input type="text" name="seatNumber"/>
<input type="submit" value="Purchase">
</form>
${msg}
</body>
</html>