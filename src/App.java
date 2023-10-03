import java.util.ArrayList;
import java.util.Collection;

public class App {
    public static void main(String[] args) throws Exception {
        var door = new Product("Wooden door", 35);
        var floorPanel = new Product("Floor Panel", 25);
        var window = new Product("Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        for (var product : products) {
            System.out.println(product);
        }
    }
}