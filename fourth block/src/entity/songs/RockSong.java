package entity.songs;

public class RockSong extends Song{

    public RockSong(String name, String author, float time){
        super(name, author, Genre.ROCK, time);
    }

    @Override
    public void setEqualizer() {
        this.midEqSet = 59;
        this.highEqSet = 58;
        this.lowEqSet = 60;
    }

}
