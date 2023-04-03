package JavaToyshop;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Toy toy = new Toy(1, 100, 4.0, "Машина");
        Toy toy1 = new Toy(1, 4.0, "Машина");
        Toy toy2 = new Toy(1, 3.0, "Кукла");
        Toy toy3 = new Toy(1, 2.5, "Ракета");
        Toy toy4 = new Toy(1, 5.1, "Неваляшка");
        toy1.setPrice(1);
        List<Shop> shopList = new ArrayList<Shop>();
        shopList.add(toy1);
        shopList.add(toy2);
        shopList.add(toy3);
        shopList.add(toy4);
        Shop shop = new Shop() {
            @Override
            public List<Shop> getShopList() {
                return super.getShopList();
            }

            @Override
            public void setShopList(List<Shop> shopList) {
                super.setShopList(shopList);
            }
        };

        System.out.println(shopList);
        System.out.println(toy);
        System.out.println(toy1);

    }
}
//        Product product = new Product();
//        Visitor visitor = new Visitor();
//        product.setPrice(50);
//        product.setName("machin");
//        visitor.setName("robot");
//        System.out.println(product.getPrice());
//        System.out.println(product.getName());
//        System.out.println(visitor.getName());