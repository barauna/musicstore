package musicstore;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Artist> artists;

	static {
		artists = new ArrayList<Artist>();
		addBeatles();
		addPinkFloyd();
	}

	private static void addBeatles() {
		Artist artist1 = new Artist("Beatles", "Rock", 1960);
		artist1.setBiography(
				"Led by primary songwriters Lennon and McCartney, the Beatles built their reputation playing clubs"
						+ " in Liverpool and Hamburg over three years from 1960, initially with Stuart Sutcliffe playing bass. "
						+ "The core trio of Lennon, McCartney and Harrison, together since 1958, went through a succession of drummers, "
						+ "including Pete Best, before asking Starr to join them in 1962. Manager Brian Epstein moulded them into a professional act and "
						+ "producer George Martin guided and developed their recordings, greatly expanding their domestic success after their first hit, "
						+ "'Love Me Do', in late 1962. As their popularity grew into the intense fan frenzy dubbed 'Beatlemania', "
						+ "the band acquired the nickname 'the Fab Four', with Epstein, Martin and other members of the band's "
						+ "entourage sometimes given the informal title of 'fifth Beatle'");

		Player p1 = new Player("John Lennon", "Vocals");
		Player p2 = new Player("Paul McCartney", "Bass");
		Player p3 = new Player("George Harrison", "Guitar");
		Player p4 = new Player("Ringo Star", "Drums");

		artist1.addPlayer(p1);
		artist1.addPlayer(p2);
		artist1.addPlayer(p3);
		artist1.addPlayer(p4);

		Album a1 = new Album("Help!", 1965, "help.jpg");
		Album a2 = new Album("Revolver", 1966, "revolver.jpg");
		Album a3 = new Album("Le it be", 1970, "leitbe.jpg");

		artist1.addAlbum(a1);
		artist1.addAlbum(a2);
		artist1.addAlbum(a3);
		
		artists.add(artist1);
	}

	private static void addPinkFloyd() {
		Artist artist1 = new Artist("Pink Floyd", "Rock", 1965);
		artist1.setBiography(
				"Pink Floyd were an English rock band formed in London in 1965. Gaining a following as a psychedelic rock group, "
						+ "they were distinguished for their extended compositions, sonic experimentation, philosophical lyrics and elaborate live shows,"
						+ " and became a leading band of the progressive rock genre. They are one of the most commercially successful and influential "
						+ "bands in popular music history.");

		Player p1 = new Player("David Gilmour", "Guitar");
		Player p2 = new Player("Roger Waters", "Bass");
		Player p3 = new Player("Nick Mason", "Drums");
		Player p4 = new Player("Syd Barret", "Vocals");

		artist1.addPlayer(p1);
		artist1.addPlayer(p2);
		artist1.addPlayer(p3);
		artist1.addPlayer(p4);

		Album a1 = new Album("Wish You Were Here", 1975, "wishyouwerehere.jpg");
		Album a2 = new Album("The Division Bell", 1994, "divisionbell.jpg");
		Album a3 = new Album("The Endless River", 2014, "endlessriver.jpg");

		artist1.addAlbum(a1);
		artist1.addAlbum(a2);
		artist1.addAlbum(a3);

		artists.add(artist1);
	}

	public static void addArtist(Artist artist) {
		artists.add(artist);
	}

	public static void removeArtist(Artist artist) {
		artists.remove(artist);
	}

	public static Artist getArtist(String name) {
		for (Artist artist : artists) {
			if (artist.getName().equals(name)) {
				return artist;
			}
		}

		return null;
	}

	public static List<Artist> getAllArtists() {
		return artists;
	}

}
