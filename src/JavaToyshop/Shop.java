package JavaToyshop;

public abstract class Shop {
    private int id;  // id
    private int price;  // количество игрушек
    private int weight;  // вес игрушки
    private String name;  //  имя игрушки

    public Shop(int id, int price, int weight, String name) {
        this.id = id;
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public Shop(int id, int weight, String name) {
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
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