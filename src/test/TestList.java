package test;

import java.util.Comparator;

public class TestList implements Comparator<Song> {
	@Override
	public int compare(Song one, Song two) {
		return one.getArtist().compareTo(two.getArtist());
	}
	
	
}
