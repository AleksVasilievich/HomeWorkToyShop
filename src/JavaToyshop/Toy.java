package JavaToyshop;

public class Toy extends Shop {
    public Toy(int id, int price, int weight, String name) {
        super(id, price, weight, name);
    }

    public Toy(int id, int weight, String name) {
        super(id, weight, name);
    }

}
