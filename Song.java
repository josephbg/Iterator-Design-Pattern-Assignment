/**
 * 
 * @author Brian Guthrie
 *
 */
public class Song {
	private String name;
	private String artist;
	private double length;
	private String genre;
	
	public Song(String name, String artist, double length, String genre) {
		this.name = name;
		this.artist = artist;
		this.length = length;
		this.genre = genre;
	}
	
	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public double getLength() {
		return length;
	}

	public String getGenre() {
		return genre;
	}

	public void print() {
		
	}

}
