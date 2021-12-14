package Facade;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HDD {
    public String read(int lba, int size) {
        System.out.println("Reading bootData...");

        StringBuilder data = new StringBuilder();
        String content = this.fromFile();

        int i = lba;
        while(i < size) {
            data.append(content.charAt(i));
            i++;
        }
        return data.toString();
    }

    private String fromFile() {
        String content = "";

        try {
            content = new String ( Files.readAllBytes( Paths.get("Facade/bootData.txt") ) );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
