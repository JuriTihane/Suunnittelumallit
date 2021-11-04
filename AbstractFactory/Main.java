package AbstractFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Class c;
        GUITehdas tehdas = null;

        System.out.println(new File(".").getAbsolutePath());

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("C:\\Users\\jurit\\Documents\\Suunnittelumallit\\AbstractFactory\\tehdas.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            //luetaan toteuttava tehdas properties-tiedostosta
            c = Class.forName(properties.getProperty("Tehdas"));
            tehdas = (GUITehdas) c.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Farmari
        Farmari farmari = tehdas.createFarmari();
        System.out.println(farmari.toString());
        // Tpaita
        Tpaita tpaita = tehdas.createTpaita();
        System.out.println(tpaita.toString());
        // Lippis
        Lippis lippis = tehdas.createLippis();
        System.out.println(lippis.toString());
        // Kengät
        Kengat kengat = tehdas.createKengat();
        System.out.println(kengat.toString());
    }
}