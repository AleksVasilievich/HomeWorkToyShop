package JavaToyshop;

public class Product {
    private int id;
    private int prise;
    private String name;
    public Product(){
    }

    public Product(int id, int prise, String name) {
        this.id = id;
        this.prise = prise;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
