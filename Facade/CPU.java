package Facade;

public class CPU {
    private int kBootAddress;

    public void freeze() {
        System.out.println("Freeze...");
    }

    public void jump(int position) {
        kBootAddress = position;
        System.out.println("\n\nJump to hdd position " + kBootAddress);
    }

    public void execute() {
        System.out.println("Execute...");
    }
}
