public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (!(obj instanceof Song)) {
            return false;
        }
        
        Song compare = (Song) obj;
        
        if (this.artist.equals(compare.artist) &&
            this.durationInSeconds == compare.durationInSeconds &&
            this.name.equals(compare.name)) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return artist + ": " + name + " (" + durationInSeconds + " s)";
    }

}
