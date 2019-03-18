package entity.disks;

import UserExceptions.OutOfSpaceException;
import entity.songs.Song;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Disk {

    private String diskName;
    private float freeSpace;
    private float totalSpace;
    private DiskType type;
    private ArrayList<Song> songList = new ArrayList<>();
    private static final Logger log = Logger.getLogger(Disk.class);

    Disk(String name, float totalSpace, DiskType type){
        this.diskName = name;
        this.freeSpace = totalSpace;
        this.totalSpace = totalSpace;
        this.type = type;
        log.info("Disk " + this.diskName + " has been created.");
    }

    public String getDiskName() {
        return diskName;
    }

    public float getFreeSpace() {
        return freeSpace;
    }

    public float getTotalSpace() {
        return totalSpace;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public DiskType getType() {
        return type;
    }

    public void addToDisk(Song song) throws OutOfSpaceException, NullPointerException {

        if (song == null) {
            throw new NullPointerException();
        } else {
            if (this.freeSpace > song.getSongTime()) {
                songList.add(song);
                freeSpace -= song.getSongTime();
                log.info(song.getSongName() + " added to " + this.diskName + " disk.");
            } else {
                throw new OutOfSpaceException("Not enough free space on disk " + this.diskName, this.freeSpace);
            }
        }
    }

    @Override
    public String toString() {
        return diskName + ": " + String.format("%.2f", freeSpace) + " of " +
                String.format("%.2f", totalSpace) + " minutes free";
    }
}
