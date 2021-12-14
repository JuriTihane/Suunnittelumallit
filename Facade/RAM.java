package Facade;

public class RAM {
    private String bootData = "";

    public void load(int position, String data) {
        System.out.println("Saving bootData to RAM...");

        while (position < data.length()) {
            bootData = bootData + data.charAt(position);
            System.out.print(data.charAt(position));
            if (position % 200 == 0 && position != 0) {
                System.out.println();
            }
            position++;
        }
    }
}
