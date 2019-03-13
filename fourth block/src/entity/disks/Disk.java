package entity.disks;

import UserExceptions.OutOfSpaceException;
import entity.songs.Song;

import java.util.ArrayList;

public class Disk {

    private String diskName;
    private float freeSpace;
    private float totalSpace;
    private DiskType type;
    private ArrayList<Song> songList = new ArrayList<>();

    Disk(String name, float totalSpace, DiskType type){
        this.diskName = name;
        this.freeSpace = totalSpace;
        this.totalSpace = totalSpace;
        this.type = type;
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
            } else {
                throw new OutOfSpaceException("Not enough free space on disk " + this.diskName, this.freeSpace);
            }
        }
    }

    @Override
    public String toString() {
        return diskName + ": " + freeSpace + " of " + totalSpace + " free";
    }
}
