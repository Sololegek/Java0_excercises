package activity;

import entity.songs.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class SongList {

    private ArrayList<Song> songList = new ArrayList<>();

    public void addSongToBase() throws IOException{
        ReadFromFile fileContent = new ReadFromFile();
        String[][] songInfo = fileContent.getInfoFromFile("D:\\file.txt");

        for (int i = 0; i < songInfo.length; i++){
            switch (songInfo[i][2].toLowerCase()) {
                case "rock":
                    songList.add(new RockSong(songInfo[i][0], songInfo[i][1], Float.parseFloat(songInfo[i][3])));
                    break;
                case "classical":
                    songList.add(new ClassicalSong(songInfo[i][0], songInfo[i][1], Float.parseFloat(songInfo[i][3])));
                    break;
                case "pop":
                    songList.add(new PopSong(songInfo[i][0], songInfo[i][1], Float.parseFloat(songInfo[i][3])));
                    break;
                default:
                    System.out.println("Unknown musical style");
                    break;
            }
        }
    }

    public void showAllSongs(){
        Iterator<Song> iterator = songList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }
}
