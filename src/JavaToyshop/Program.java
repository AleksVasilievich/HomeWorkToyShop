package JavaToyshop;

public class Program  {
    public static void main(String[] args) {
        Shop shop = new Shop() {
        };
        Toy toy = new Toy();
        Toy toy1 = new Toy();
        String name = toy1.getName("iuytr");

        System.out.println(shop.getName("dfghj"));
        System.out.println(toy.getName("ertyu"));
        System.out.println(name);
    }
}
