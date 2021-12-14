package Facade;

public class ComputerFacade {
    private CPU cpu = new CPU();
    private HDD hdd = new HDD();
    private RAM ram = new RAM();

    private int bootAddress = 0;
    private int bootSector = 0;
    private int size = 4096;

    public void start() {
        cpu.freeze();
        ram.load(bootAddress, hdd.read(bootSector, size));
        cpu.jump(bootAddress);
        cpu.execute();
    }
}
