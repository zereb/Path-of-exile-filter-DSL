package free.zereb.java2poefilter.Styletypes;

public class EffectColor {
    public final String color;
    private EffectColor(String color){
        this.color = color;
    }

    public static EffectColor Red = new EffectColor("Red");
    public static EffectColor Green = new EffectColor("Green");
    public static EffectColor Blue = new EffectColor("Blue");
    public static EffectColor Brown = new EffectColor("Brown");
    public static EffectColor White = new EffectColor("White");
    public static EffectColor Yellow = new EffectColor("Yellow");

}
