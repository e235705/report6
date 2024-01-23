
import java.util.ArrayList;
import java.util.List;

public class Stocker {
    private List<Product> productList;

    Stocker() {
        productList = new ArrayList<>();
    }

    void add(Product product) {
        productList.add(product);
    }

    void showProductList() {
        for(Product product: productList) {
            System.out.println(product.info());
        }
    }

    boolean isExistsProduct(Product product) {
        for(Product stock: productList) {
            if(stock.name().equals(product.name())){
                return true;
            }
        }
        return false;
    }

    Product getProduct(String productName) {
        for(Product stock: productList) {
            if(stock.name().equals(productName)){
                return stock;
            }
        }
        return new Product();
    }

}

