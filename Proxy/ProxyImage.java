package Proxy;

public class ProxyImage implements Image {
    private final String filename;
    private TrueImage image;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void displayImage() {
        if (image == null) {
            image = new TrueImage(filename);
        }
        image.displayImage();
    }

    @Override
    public void showData() {
        System.out.println(filename);
    }
}
