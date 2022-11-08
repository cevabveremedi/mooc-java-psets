
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Song)) {
            return false;
        }
        
        Song comparedSong = (Song) compared;
        
        
        if (this.artist.equals(comparedSong.artist) && this.name.equals(comparedSong.name) && this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }
        

        /*
        if(this.artist.equals(comparedSong.artist)){
            //System.out.println("artists equal");
            if(this.name.equals(comparedSong.name)){
                //System.out.println("names equal");
                if(this.durationInSeconds == comparedSong.durationInSeconds) {
                    //System.out.println("durations equal");
                    return true;
                }
            }
        }
        */

        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
