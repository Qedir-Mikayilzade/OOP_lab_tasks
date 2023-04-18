
public class Laptop {
    private int id;
    private String name;
    private String hardDriveCapacity;
    private double screenSize;
    private int RAM;
    private double price;

    public Laptop(int id, String name, String hardDriveCapacity, double screenSize, int RAM, double price) {
        this.id = id;
        this.name = name;
        this.hardDriveCapacity = hardDriveCapacity;
        this.screenSize = screenSize;
        this.RAM = RAM;
        this.price = price;
    }

    public void Sale() {
        double discountedPrice = price * 0.7;
        System.out.println("Ad: " + name + ", Ekran Ölçüsü: " + screenSize + "\", RAM: " + RAM + "GB, İndirimli Fiyat: $" + String.format("%.2f", discountedPrice));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHardDriveCapacity() {
        return hardDriveCapacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getRAM() {
        return RAM;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHardDriveCapacity(String hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
