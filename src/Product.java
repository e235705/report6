
public class Product {
    private String productName;
    private int price;

    Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    Product() {
        this.productName = "";
        this.price = 0;
    }

    String name() {
        return productName;
    }

    int price() {
        return price;
    }

    String info() {
        String formatStr = "%s : %d円";
        return String.format(formatStr, productName, price);
    }

}
