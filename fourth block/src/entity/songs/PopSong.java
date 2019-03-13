package entity.songs;

public class PopSong extends Song {

    public PopSong(String name, String Author, float time) {
        super(name, Author, Genre.POP, time);
    }

    @Override
    public void setEqualizer() {
        this.midEqSet = 65;
        this.highEqSet = 70;
        this.lowEqSet = 30;
    }

}
