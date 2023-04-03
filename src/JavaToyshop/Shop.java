package JavaToyshop;

import java.util.List;

public abstract class Shop {
    private int id;  // id
    private int price;  // количество игрушек
    private double weight;  // вес игрушки
    private String name;  //  имя игрушки
    private List<Shop> shopList;
    public Shop(List<Shop> shopList) {this.shopList = shopList; }

    public Shop(int id, int price, double weight, String name) {
        this.id = id;
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public Shop(int id, double weight, String name) {
        this.id = id;
        this.weight = weight;
        this.name = name;
    }

    public Shop() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", price=" + price +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}