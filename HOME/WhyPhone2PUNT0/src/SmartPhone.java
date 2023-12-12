public class SmartPhone implements IWifi, ISimCard, IRadio, ICamera, IGPS {

    private final double PRICE;
    private final String BRAND;
    private int numberOfPhotos;

    public SmartPhone(double PRICE, String BRAND) {
        this.PRICE = PRICE;
        this.BRAND = BRAND;
    }

    public double getPRICE() {
        return PRICE;
    }

    public String getBRAND() {
        return BRAND;
    }

    @Override
    public void shootAPhoto(double amountOfPhotos) {
        System.out.println("Shot " + amountOfPhotos + " photos.");
        numberOfPhotos += amountOfPhotos;
    }

    @Override
    public String[] viewPhotos() {

        String[] photos = new String[numberOfPhotos];

        for (int i = 0; i < photos.length; i++) {
            photos[i] = "Photo" + i + ".jpg";
        }

        return photos;
    }

    @Override
    public String locate(double latitude, double longitude) {

        return "going to " + latitude + " and " + longitude;
    }

    @Override
    public void navigate() {
        System.out.println("navigating");
    }

    @Override
    public void playChannel(double fm) {
        System.out.println("Playing music from " + fm + "FM.");
    }

    @Override
    public void changeChannel(double fm) {
        System.out.println("Changed chaneel to " + fm + " FM.");
    }

    @Override
    public void connect(String internetConnection) {
        System.out.println("Connecting to " + internetConnection);
    }

    @Override
    public void disconnect(String internetConnection) {
        System.out.println("Disconnecting to " + internetConnection);
    }
}
