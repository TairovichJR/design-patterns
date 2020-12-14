package categories.creational.builder;

public class Laptop {

    private String ram;
    private String hdd;
    private String cpu;
    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;

    public Laptop(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.isGraphicsEnabled = isGraphicsEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public boolean isGraphicsEnabled() {
        return isGraphicsEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                ", isGraphicsEnabled=" + isGraphicsEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

}
