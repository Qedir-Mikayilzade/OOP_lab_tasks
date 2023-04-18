public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Google", "Mountain View, CA",
                "Organize the world's information and make it universally accessible and useful", "Sundar Pichai",
                139995);
        Company company2 = new Company("Amazon", "Seattle, WA", "To be Earth's most customer-centric company",
                "Andy Jassy", 1271000);
        Company company3 = new Company("Tesla", "Palo Alto, CA",
                "To accelerate the world's transition to sustainable energy", "Elon Musk", 70000);

        company1.info();
        System.out.println("--------------------");
        company2.info();
        System.out.println("--------------------");
        company3.info();
    }
}