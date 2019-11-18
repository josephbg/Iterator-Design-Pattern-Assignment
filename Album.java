/**
 * 
 * @author Brian Guthrie
 *
 */
public class Album {
	//Arraylist<Song> songs;
	private Song[] songs;
	private int count;
	private String name;
	
	public Album(String Name) {
		//songs = new ArrayList<Song>();
		this.name = name;
	}
	
	public void addSong(String name, String artist, double length, String genre) {
		Song songs = new Song(name, artist, length, genre);
	}
	
	public AlbumIterator createIterator() {
		return new AlbumIterator();
	}

}
