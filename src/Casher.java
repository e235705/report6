
public class Casher {
    private int deposit;
    private int change;

    Casher(){
        deposit = 0;
        change = 0;
    }

    void addDeposit(int deposit) {
        this.deposit += deposit;
    }

    void charge(Product purchase) {
        change = deposit - purchase.price();
    }

    int change() {
        return change;
    }

    public boolean isEnoughDeposit(Product product) {
        if(deposit >= product.price()) {
            return true;
        }
        return false;
    }

}
