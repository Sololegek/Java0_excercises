package entity.songs;

import org.apache.log4j.Logger;

public abstract class Song {

    private String songName;
    private String songAuthor;
    private Genre songGenre;
    private float songTime;
    int midEqSet = 50;
    int lowEqSet = 50;
    int highEqSet = 50;
    private static final Logger log = Logger.getLogger(Song.class);

    Song(String name, String Author, Genre genre, float time){
        this.songName = name;
        this.songAuthor = Author;
        this.songGenre = genre;
        this.songTime = time;
        log.info("Song " + this.songName + " have been read from file and added to song base.");
    }

    public abstract void setEqualizer();

    public String getSongName() {
        return songName;
    }

    public String getSongAuthor() {
        return songAuthor;
    }

    public Genre getSongGenre() {
        return songGenre;
    }

    public float getSongTime() {
        return songTime;
    }

    @Override
    public String toString() {
        return this.songName + " - " + this.songAuthor + " (" + this.songGenre.toString() + ") -- " + this.songTime;
    }
}
