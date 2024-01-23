
public class Store {
    private Stocker stocker;
    private Casher casher;

    Store() {
        stocker = new Stocker();
        casher = new Casher();
    }

    void addDeposit(int deposit) {
        casher.addDeposit(deposit);
    }

    void addStock(Product product) {
        stocker.add(product);
    }

    void change() {
        System.out.println("おつりは、" + casher.change() + "円です。");
    }

    void showProductList() {
        stocker.showProductList();
    }

    boolean isExistsStock(Product product) {
        return stocker.isExistsProduct(product);
    }

    boolean isEnoughDeposit(Product purchase) {
        return casher.isEnoughDeposit(purchase);
    }

    Product inStocker(String productName) {
        return stocker.getProduct(productName);
    }

    void sale(Product purchase) {
        casher.charge(purchase);
        System.out.println(purchase.name() + "です！");
        System.out.println("ご購入ありがとうございました。");
    }

}

