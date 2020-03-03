package musicstore.dao;

import java.util.List;

import musicstore.Artist;
import musicstore.Banco;

public class ArtistDAO {

	public Artist getArtistByName(String name) {
		Artist artist = Banco.getArtist(name);
		return artist;
	}

	public void addArtist(Artist a) {
		Banco.addArtist(a);
	}

	public List<Artist> getAllArtists() {
		return Banco.getAllArtists();
	}

	public void removeArtist(Artist a) {
		Banco.removeArtist(a);
	}

}
