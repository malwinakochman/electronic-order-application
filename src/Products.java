import java.util.Queue;
import java.util.LinkedList;

public class Products {

    public static double calculateNetPrice(double grossPrice, double taxRate) {
        return grossPrice / (1 + taxRate);
    }

    public static void main(String[] args) {
        System.out.println(calculateNetPrice(100, 0.19));
        System.out.println();

        Queue<String> products = new LinkedList<>();
        products.add("1. t-shirt");
        products.add("2. sweater");
        products.add("3. jacket");
        products.add("4. coat");
        products.add("5. jeans");
        products.add("6. socks");

        System.out.println(products);
        System.out.println(products.poll());
        System.out.println(products);

        while (!products.isEmpty()) {
            System.out.println(products.poll());
        }


    }
}
