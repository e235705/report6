
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // インスタンス生成
        Store venderMachine = new Store();
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // 商品リスト初期化
        Product water = new Product("水", 80);
        Product coke = new Product("コーラ", 100);
        Product orangejuice = new Product("オレンジジュース", 120);
        Product coffee = new Product("コーヒー",150);
        Product redbull = new Product("レッドブル",210);
        venderMachine.addStock(water);
        venderMachine.addStock(coke);
        venderMachine.addStock(orangejuice);
        venderMachine.addStock(coffee);
        venderMachine.addStock(redbull);

        // 商品一覧表示
        System.out.println("≪販売中の商品です≫");
        venderMachine.showProductList();

        // 商品選択
        Product purchase = null;
        String purchaseSelectMessage = "購入する商品名を入力してください。";
        int purchaseSelectCount = 0;
        do {
            if(purchaseSelectCount > 0) {
                purchaseSelectMessage = "その商品の取り扱いはございません。販売中の商品からお選び下さい。";
            }

            System.out.println();
            System.out.println(purchaseSelectMessage);
            purchase = venderMachine.inStocker(scanner.next());
            purchaseSelectCount++;
        } while(!venderMachine.isExistsStock(purchase));


        // 入金
        String depositMessage = "入金して下さい。";
        int depositCount = 0;
        do {
            if(depositCount > 0) {
                depositMessage = "入金額が不足しています。不足分を追加してください。";
            }

            System.out.println();
            System.out.println(depositMessage);
            venderMachine.addDeposit(scanner.nextInt());
            depositCount++;
        } while(!venderMachine.isEnoughDeposit(purchase));

        // 販売
        System.out.println();
        venderMachine.sale(purchase);

        // おつり
        System.out.println();
        venderMachine.change();
    }
}
