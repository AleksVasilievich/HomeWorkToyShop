package JavaToyshop;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Toy toy = new Toy(1, 100, 4.0, "Машина");
        Toy toy1 = new Toy(1, 2.7, "Машина");
        Toy toy2 = new Toy(2, 1.3, "Кукла");
        Toy toy3 = new Toy(3, 4.5, "Ракета");
        Toy toy4 = new Toy(4, 3.1, "Неваляшка");
        Toy toy5 = new Toy(5, 2.2, "Пупсик");
        Toy toy6 = new Toy(6, 5.4, "Лунтик");
        Toy toy7 = new Toy(7, 6.8, "Самалёт");
        Toy toy8 = new Toy(8, 1.8, "Бегемот");
        Toy toy9 = new Toy(9, 2.5, "Конструктор");
        Toy toy10 = new Toy(10, 0.5, "Кубики");
        toy1.setPrice(1);
        List<Shop> shopList = new ArrayList<Shop>();
        shopList.add(toy1);
        shopList.add(toy2);
        shopList.add(toy3);
        shopList.add(toy4);
        shopList.add(toy5);
        shopList.add(toy6);
        shopList.add(toy7);
        shopList.add(toy8);
        shopList.add(toy9);
        shopList.add(toy10);

        System.out.println(shopList);
        System.out.println(toy);
        System.out.println(toy1);

        PrintPrize printPrize = new PrintPrize(shopList);
        printPrize.listToyPrize();
//        printPrize.listToyPrize();
//        printPrize.listToyPrize();
//        printPrize.listToyPrize();

    }
}
