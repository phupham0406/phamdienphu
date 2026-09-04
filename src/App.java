import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Laptop(1, "MacBook Air M3", 25000000, "Apple"));
        products.add(new Laptop(2, "Dell XPS 13", 30000000, "Dell"));

        products.add(new Smartphone(3, "iPhone 15 Pro", 28000000, 187));
        products.add(new Smartphone(4, "Samsung Galaxy S24", 22000000, 167));

        products.add(new Tablet(5, "iPad Air", 18000000, 10.9));

        System.out.println("===== DANH SACH SAN PHAM =====");

        for (Product product : products) {
            System.out.println("ID: " + product.getId());
            System.out.println("Ten san pham: " + product.getName());
            System.out.println("Gia: " + product.getPrice());

            if (product instanceof Laptop) {
                Laptop laptop = (Laptop) product;
                System.out.println("Loai: Laptop");
                System.out.println("Thuong hieu: " + laptop.getBrand());

            } else if (product instanceof Smartphone) {
                Smartphone smartphone = (Smartphone) product;
                System.out.println("Loai: Smartphone");
                System.out.println("Can nang: " + smartphone.getWeight() + " gram");

            } else if (product instanceof Tablet) {
                Tablet tablet = (Tablet) product;
                System.out.println("Loai: Tablet");
                System.out.println("Kich thuoc man hinh: " + tablet.getScreenSize() + " inch");
            }

            System.out.println("----------------------------");
        }
    }
}