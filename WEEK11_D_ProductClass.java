package weeklyassign;
import java.util.*;
class Product
{

    int id;
    String productName;
    double price;

     Product(int id, String productName, double price)
     {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public String toString() 
    {
        return id + " " + productName + " " + price;
    }
}
public class WEEK11_D_ProductClass {

	public static void main(String[] args) {
  List<Product> pro = new ArrayList<>();

        pro.add(new Product(1, "Laptop", 55000));
        pro.add(new Product(2, "Mouse", 500));
        pro.add(new Product(3, "Mobile", 25000));
        pro.add(new Product(4, "Keyboard", 900));
        pro.add(new Product(5, "Monitor", 12000));

List<Product> filteredProducts = pro.stream()
                .filter(product -> product.price > 1000)
                .toList();
        System.out.println("Products with price greater than 1000:");

        filteredProducts.forEach(System.out::println);

	}

}
