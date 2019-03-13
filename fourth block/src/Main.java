import activity.DiskHandling;
import activity.SongList;
import entity.disks.CDDisk;
import entity.disks.Disk;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        SongList list = new SongList();
        list.addSongToBase();
        list.showAllSongs();
        System.out.println();

        Disk collection = new CDDisk("Collection");
        DiskHandling dh = new DiskHandling();
        System.out.println(collection.getFreeSpace());
        dh.addToDisk(collection, list, "disciple");
        System.out.println(collection.getFreeSpace());

        dh.addToDisk(collection, list, "bad romance");
        System.out.println(collection.getFreeSpace());

        dh.addToDisk(collection, list, "carry the flag");
        System.out.println(collection.getFreeSpace());

        dh.printSongList(collection);
        System.out.println(collection.toString());

        System.out.println(dh.totalTime(collection));

        dh.sortDisk(collection);
        dh.printSongList(collection);
        System.out.println();
        dh.filterByTime(collection, 3.10f, 3.30f);
        dh.addToDisk(collection, list, "nothing else matters");
        dh.sortDisk(collection);
        dh.printSongList(collection);

    }

}
