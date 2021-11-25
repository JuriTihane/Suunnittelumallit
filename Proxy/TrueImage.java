package Proxy;

// Muutin luokan recordiks, koska Intellij Idea suositteli ja koska se ei tee muuta kuin hae dataa
public record TrueImage(String filename) implements Image {
    public TrueImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

    @Override
    public void showData() {
        System.out.println(filename);
    }
}
