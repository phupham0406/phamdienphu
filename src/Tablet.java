public class Tablet extends Product {
    private double screenSize;

    public Tablet(int id, String name, double price, double screenSize) {
        super(id, name, price);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}