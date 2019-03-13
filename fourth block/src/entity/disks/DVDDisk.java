package entity.disks;

public class DVDDisk extends Disk {

    public DVDDisk(String name) {
        super(name,300.0f, DiskType.DVD);
    }

    @Override
    public String toString() {
        return "DVDDisk " + super.toString();
    }
}
