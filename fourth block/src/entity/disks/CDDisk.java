package entity.disks;

public class CDDisk extends Disk {

    public CDDisk(String name) {
        super(name, 60.0f, DiskType.CD);
    }

    @Override
    public String toString() {
        return "CDDisk " + super.toString();
    }
}
