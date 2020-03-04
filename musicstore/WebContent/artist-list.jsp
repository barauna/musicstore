<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Artist List</title>
</head>
<body>
	<table>
		<tr>
			<th>Artist</th>
			<th>Genre</th>
			<th>Formation</th>
		</tr>
		<c:forEach items="${artists}" var="artist">
			<tr>
				<td>${artist.name}</td>
				<td>${artist.genre}</td>
				<td>${artist.yearFormation}</td>
			</tr> 
		</c:forEach>
	</table>
</body>
</html>