package musicstore.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import musicstore.Artist;
import musicstore.Banco;
import musicstore.dao.ArtistDAO;

@WebServlet("/ArtistServlet")
public class ArtistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		ArtistDAO artistDAO = new ArtistDAO();
		String name;
		String genre;
		int year;
		String bio;

		switch (action) {
		case "list":
			List<Artist> artists = artistDAO.getAllArtists();
			request.getSession().setAttribute("artists", artists);
			request.getRequestDispatcher("artist-list.jsp").forward(request, response);
			break;
		case "delete":
			Artist a = artistDAO.getArtistByName(request.getParameter("artist"));
			artistDAO.removeArtist(a);
			request.getRequestDispatcher("artist-list.jsp").forward(request, response);
			break;
		case "new_":
			request.getRequestDispatcher("artist-new.html").forward(request, response);
			break;
		case "new":
			name = request.getParameter("name");
			genre = request.getParameter("genre");
			year = Integer.valueOf(request.getParameter("yearFormation"));
			bio = request.getParameter("biography");
			Artist artist = new Artist(name, genre, year);
			artist.setBiography(bio);
			Banco.addArtist(artist);
			request.getRequestDispatcher("artist-list.jsp").forward(request, response);
			break;
		case "update_":
			name = request.getParameter("artist");
			Artist artist3 = artistDAO.getArtistByName(name);
			request.setAttribute("artist", artist3);
			request.getRequestDispatcher("artist-update.jsp").forward(request, response);
			break;
		case "update":
			name = request.getParameter("artist");
			genre = request.getParameter("genre");
			year = Integer.valueOf(request.getParameter("yearFormation"));
			bio = request.getParameter("biography");
			Artist artist2 = artistDAO.getArtistByName(name);
			artist2.setYearFormation(year);
			artist2.setGenre(genre);
			artist2.setBiography(bio);
			request.getRequestDispatcher("artist-list.jsp").forward(request, response);
			break;
		default:
			response.getWriter().append("Action: ").append("undefined");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
