package JavaToyshop;

public class Program {
    public static void main(String[] args) {
        Toy toy = new Toy(1, 100, 4.0, "Машина");
        Toy toy1 = new Toy(1, 4.0, "Машина");
        toy1.setPrice(1);

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