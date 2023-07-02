import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.HotDrinkNext;
import Domen.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;


public class Main {
    public static void main(String[] args) {
        // Создание ассортимента в Торговом автомате
        List<Product> assort = new ArrayList<>();
        // наполнение продуктами
        Product item1 = new Product(100, 1, "Lays",1);
        Product item2 = new Product(100, 1, "Cola",2);
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, (float) 1.5);
        // домашнее задание
        Product item4 = new HotDrink(180, 4, "Tea", 102, 32);
        Product item5 = new HotDrinkNext(200, 5, "Coffee+Milk", 103, 32,true);
        Product item6 = new HotDrinkNext(180, 6, "Coffee", 104, 32,false);

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);
        assort.add(item6);

        Holder hold1 = new Holder(4, 4);
        CoinDispenser coinDesp = new CoinDispenser(0);
        Display disp = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, assort, disp);

        // вывод на печать
        for(Product prod: venMachine.getProducts())
        {
            System.out.println(prod);
        }
//        MainFrame myFrame = new MainFrame();
//        myFrame.initialize();
// Попытка собрать через JFrame
//        Holder hold1 = new Holder(4, 4);
//        CoinDispenser coinDesp = new CoinDispenser(0);
//        Display disp = new Display();
//        ProductInterface productInterface = new ProductInterface();
//
//        // Пример создания и добавления продуктов
//        Product product1 = new Product(10, 1, "Товар 1", 1);
//        Product product2 = new Product(20, 2, "Товар 2", 2);
//        productInterface.addProduct(product1);
//        productInterface.addProduct(product2);
    }
}