package free.zereb.java2poefilter.Styletypes;


public class PoeShape {
    public final String shape;

    private PoeShape(String shape){
        this.shape = shape;
    }

    public static PoeShape Circle = new PoeShape("Circle");
    public static PoeShape Diamond = new PoeShape("Diamond");
    public static PoeShape Hexagon = new PoeShape("Hexagon");
    public static PoeShape Square = new PoeShape("Square");
    public static PoeShape Star = new PoeShape("Star");
    public static PoeShape Triangle = new PoeShape("Triangle");
}
