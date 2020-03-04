package musicstore.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import musicstore.Artist;
import musicstore.dao.ArtistDAO;

@WebServlet("/ArtistServlet")
public class ArtistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		switch (action) {
		case "list":
			ArtistDAO artistDAO = new ArtistDAO();
			List<Artist> artists = artistDAO.getAllArtists();
			request.getSession().setAttribute("artists", artists);
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
