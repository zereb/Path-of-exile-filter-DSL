package free.zereb.java2poefilter.Styletypes;


public class PoeIconSize {
    public final String size;

    private PoeIconSize(String size){
        this.size = size;
    }

    public static PoeIconSize small = new PoeIconSize("2");
    public static PoeIconSize medium = new PoeIconSize("1");
    public static PoeIconSize large = new PoeIconSize("0");

}
