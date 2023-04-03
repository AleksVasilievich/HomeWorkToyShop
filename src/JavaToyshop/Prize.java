package JavaToyshop;

import java.util.List;

public class Prize extends Toy {

    public Prize(int id, int price, double weight, String name) {
        super(id, price, weight, name);
    }

    public Prize(int id, double weight, String name) {
        super(id, weight, name);
    }




//    public Shop optionWeight(List<Shop> shopList) {
//        double tempWeight = 0.0;
//        for (Shop shop : shopList);
//            tempWeight += getWeight();
//        double rand = Math.random() * tempWeight;
//        double sumWeight = 0.0;
//        for (Shop shop : shopList) {
//            sumWeight += getWeight();
//            if (sumWeight >= rand)
//                return shop;
//
//        }
//        throw  new RuntimeException("Should never be shown.");

}
