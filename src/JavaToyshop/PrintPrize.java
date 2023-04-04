package JavaToyshop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PrintPrize extends Prize {

    public PrintPrize() {
    }

    public PrintPrize(int id, int price, double weight, String name) {
        super(id, price, weight, name);
    }

    public PrintPrize(int id, double weight, String name) {
        super(id, weight, name);
    }

    public PrintPrize(List<Shop> shopList) {
        this.setShopList(shopList);
    }


    public void listToyPrize() {
        String text = optionWeight(getShopList()).toString();
        try(FileWriter writer = new FileWriter("src/JavaToyshop/Product.txt", true))
        {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        getShopList().remove(optionWeight(getShopList()));
    }

}
