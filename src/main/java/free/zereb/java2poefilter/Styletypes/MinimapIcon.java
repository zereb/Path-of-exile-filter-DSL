package free.zereb.java2poefilter.Styletypes;

public class MinimapIcon {
    private final EffectColor effectColor;
    private final PoeShape shape;
    private final PoeIconSize size;

    public MinimapIcon(EffectColor effectColor, PoeShape shape, PoeIconSize size){
        this.effectColor = effectColor;
        this.shape = shape;
        this.size = size;
    }

    @Override
    public String toString() {
        return size.size + " " + effectColor.color + " " + shape.shape;
    }
}
