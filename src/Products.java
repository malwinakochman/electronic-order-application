import java.util.Queue;
import java.util.LinkedList;
import java.io.FileWriter;
import java.io.IOException;

public class Products {

    public static double calculateNetPrice(double grossPrice, double taxRate) {
        return grossPrice / (1 + taxRate);
    }

    public static void appendStringToFile(String fileName, String passedString) {
        try {
            FileWriter file = new FileWriter(fileName, true);
            file.write(passedString + "\n");
            file.close();
        } catch (IOException e) {
            System.err.println("Error appending to file " + fileName + ".");
        }
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

        appendStringToFile("toDoList", "Order business cards.");
        appendStringToFile("toDoList", "Create campaign.");
        appendStringToFile("toDoList", "Pay the bills");
    }
}
