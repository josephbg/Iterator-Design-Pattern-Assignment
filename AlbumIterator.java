/**
 * 
 * @author Brian Guthrie
 *
 */
public class AlbumIterator implements Iterator {
	private Song[] songs;
	private int position;
	
	public void AlbumIterator(Song[] songs) {
		this.songs = songs;
	}
	
	public Song next() {
		Song song = songs[position];
		position = position + 1;
		return song;
	}
	
	public boolean hasNext() {
		if(position >= songs.length || songs[position] == null) {
			return false;
		} else {
			return true;
		}
	}

}
