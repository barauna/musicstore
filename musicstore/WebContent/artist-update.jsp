<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Artist Update</title>
</head>
<body>
	<form method="post" action="ArtistServlet?action=update">
		<input type="hidden" name="artist" value="${artist.name}"/><br>
		<label>${artist.name}</label><br><hr>
		<label>Genre:</label>
		<input type="text" name="genre" value="${artist.genre}"/><br>
		<label>Year:</label>
		<input type="number" name="yearFormation" value="${artist.yearFormation}"/><br>
		<label>Bio:</label>
		<textarea name="biography" rows="4" cols="50">${artist.biography}</textarea><br>
		<input type="submit" value="Ok"/> 		
	</form>
</body>
</html>