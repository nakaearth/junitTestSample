package test;

public class Song {
    private String artist;
    
    public Song(String name) {
    	this.setArtist(name);
    }

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
}
