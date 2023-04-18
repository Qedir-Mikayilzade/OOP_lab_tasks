public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(1, "MacBook Pro", "512GB", 13.3, 16, 1499);
        Laptop laptop2 = new Laptop(2, "Dell XPS", "1TB", 15.6, 32, 1799);
        Laptop laptop3 = new Laptop(3, "Lenovo ThinkPad", "256GB", 14, 8, 999);

        laptop1.Sale();
        laptop2.Sale();
        laptop3.Sale();
    }
}
