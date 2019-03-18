package activity;

import UserExceptions.OutOfSpaceException;
import entity.disks.Disk;
import entity.songs.Song;
import org.apache.log4j.Logger;

import java.util.Comparator;
import java.util.Iterator;

public class DiskHandling{

    private static final Logger log = Logger.getLogger(DiskHandling.class);

    public void addToDisk(Disk disk, SongList list, String songName){
        log.info("Adding song to disk...");
        Song song = findSong(list, songName);
        try {
            disk.addToDisk(song);
        } catch (OutOfSpaceException ex) {
            System.out.println(ex + " There are only " + ex.getSpaceLeft() + " free.");
        } catch (NullPointerException ex) {
            System.out.println(ex + " SongListFile or song \"" + songName + "\" doesn't exist.");
        }

    }

    public void sortDisk(Disk disk){
        log.info("Sorting disk...");
        Comparator<Song> comparator = Comparator.comparing(Song::getSongGenre);
        disk.getSongList().sort(comparator);

    }

    public void filterByTime(Disk disk, float min, float max) {
        log.info("Filtering disk by song time...");
        Iterator<Song> iterator = disk.getSongList().iterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            if (song.getSongTime() > min && song.getSongTime() < max)
                System.out.println(song.toString());
        }
    }

    public float totalTime(Disk disk){
        log.info("Disk's total time estimating...");
        return disk.getTotalSpace() - disk.getFreeSpace();
    }

    private Song findSong(SongList list, String songName){
        Iterator<Song> iterator = list.getSongList().iterator();
        Song searchResult;
        while (iterator.hasNext()) {
            searchResult = iterator.next();
            if (searchResult.getSongName().equals(songName)) {
                return searchResult;
            }
        }
        return null;
    }

    public void printSongList(Disk disk){
        log.info("Printing disk's playlist...");
        Iterator<Song> iterator = disk.getSongList().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
