package entity.songs;

public class ClassicalSong extends Song {

    public ClassicalSong(String name, String Author, float time) {
        super(name, Author, Genre.CLASSICAL, time);
    }

    @Override
    public void setEqualizer() {
        this.midEqSet = 67;
        this.highEqSet = 60;
        this.lowEqSet = 44;
    }

}
