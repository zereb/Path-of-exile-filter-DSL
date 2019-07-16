package free.zereb.java2poefilter.blocktypes;

public class Rarity {
public String rarity;

    private Rarity(String rarity){
        this.rarity = rarity;
    }

    public static Rarity Rare = new Rarity("Rare");
    public static Rarity Unique = new Rarity("Unique");
    public static Rarity Normal = new Rarity("Normal");
    public static Rarity Magic = new Rarity("Magic");
}
