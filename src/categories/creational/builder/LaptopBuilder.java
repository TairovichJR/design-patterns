package categories.creational.builder;

public class LaptopBuilder {

    private String ram;
    private String hdd;
    private String cpu;
    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;

    public LaptopBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public LaptopBuilder setHdd(String hdd) {
        this.hdd = hdd;
        return this;
    }

    public LaptopBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public LaptopBuilder setGraphicsEnabled(boolean graphicsEnabled) {
        isGraphicsEnabled = graphicsEnabled;
        return this;
    }

    public LaptopBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
        return this;
    }

    public Laptop build(){
        return new Laptop(ram, hdd,cpu,isGraphicsEnabled,isBluetoothEnabled);
    }
}
