package musicstore;

import java.util.ArrayList;
import java.util.List;

public class Artist {
	String name;
	String genre;
	int yearFormation;
	String biography;

	ArrayList<Player> musicians = new ArrayList<Player>();
	ArrayList<Album> albums = new ArrayList<Album>();

	public Artist(String name, String genre, int year) {
		this.name = name;
		this.genre = genre;
		this.yearFormation = year;
	}

	public String getGenre() {
		return genre;
	}

	public int getYearFormation() {
		return yearFormation;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public void addPlayer(Player p) {
		musicians.add(p);
	}

	public void addAlbum(Album album) {
		albums.add(album);
	}

	public List<Album> getAlbums() {
		return albums;
	}

	public List<Player> getMusicians() {
		return musicians;
	}

	public void removeMusician(String name) {
		for (Player musician : musicians) {
			if (musician.name == name) {
				musicians.remove(musician);
			}
		}
	}

	public void removeAlbum(String name) {
		for (Album album : albums) {
			if (album.name == name) {
				albums.remove(album);
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setYearFormation(int year) {
		this.yearFormation = year;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
