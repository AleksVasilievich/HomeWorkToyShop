package JavaToyshop;

public class Visitor {
    private String buy;

    private String prize;

    private int chance;

    public Visitor(){
    }

    public Visitor(String buy, String prize, int chance) {
        this.buy = buy;
        this.prize = prize;
        this.chance = chance;
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public int getChance() {
        return chance;
    }
    public void setChance(int chance) {
        this.chance = chance;
    }
}
