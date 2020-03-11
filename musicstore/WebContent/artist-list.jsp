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
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${artists}" var="artist">
			<tr>
				<td>${artist.name}</td>
				<td>${artist.genre}</td>
				<td>${artist.yearFormation}</td>
				<td><a href="ArtistServlet?action=update_&artist=${artist.name}"><img src="img/edit.png" width="30" height="20" /></a></td>
				<td><a href="ArtistServlet?action=delete&artist=${artist.name}"><img src="img/delete.png" width="18" height="18" /></a></td>
			</tr> 
		</c:forEach>
	</table>
	<br>
	<a href="ArtistServlet?action=new_"><button>Novo</button></a>
</body>
</html>