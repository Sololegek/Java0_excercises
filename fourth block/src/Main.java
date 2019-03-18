import activity.DiskHandling;
import activity.SongList;
import entity.disks.CDDisk;
import entity.disks.Disk;
import org.apache.log4j.*;

import java.io.IOException;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) throws IOException {
        log.info("Program started");

        SongList list = new SongList();
        list.addSongToBase();
        list.showAllSongs();

        Disk collection = new CDDisk("Collection");
        DiskHandling dh = new DiskHandling();
        dh.addToDisk(collection, list, "disciple");
        dh.addToDisk(collection, list, "bad romance");
        dh.addToDisk(collection, list, "carry the flag");
        dh.addToDisk(collection, list, "nothing else matters");
        dh.addToDisk(collection, list, "moonlight sonata");
        dh.printSongList(collection);

        System.out.println(collection.toString());
        System.out.printf("Total time of " + collection.getDiskName() + "is %.2f minutes.\n", dh.totalTime(collection));

        dh.sortDisk(collection);
        dh.printSongList(collection);
        dh.filterByTime(collection, 3.10f, 3.30f);

        log.info("Program finished");
    }

}
