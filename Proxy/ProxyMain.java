package Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyMain {
    public static void main(final String[] arguments) {
        List<Image> images = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            images.add(new ProxyImage("Some_Kind_Of_Photo_" + i));
        }

        for (Image image : images) {
            image.showData();
        }

        // Esitys valokuvien selaamisesta, tarvitsisi pikkasen enemmän logiikka, mutta näin se onnistuu
        System.out.println("Display images");
        for (Image image : images) {
            image.displayImage();
        }
    }
}
