package free.zereb.java2poefilter.blocktypes;

import free.zereb.java2poefilter.Styletypes.Style;

import java.util.HashMap;
import java.util.List;

import static free.zereb.java2poefilter.Utils.quote;

public abstract class Block {

    public HashMap<String, String> data = new HashMap<>();
    public Style style;

    public Block addPropperty(String prop){
        data.put("", prop);
        return this;
    }

    public Block rarity(Rarity rarity){
        data.put("Rarity =", rarity.rarity);
        return this;
    }

    public Block poeClass(List<String> classes){
        StringBuilder builder = new StringBuilder();
        classes.forEach(cls -> builder.append(quote(cls)).append(" "));
        data.put("Class", builder.toString().trim());
        return this;
    }

    public Block poeClass(String poeClass){
        data.put("Class", quote(poeClass));
        return this;
    }

    public Block hasExplicitMod(String mod){
        data.put("HasExplicitMod", quote(mod));
        return this;
    }

    public Block hasExplicitMod(List<String> mods){
        StringBuilder builder = new StringBuilder();
        mods.forEach(mod -> builder.append(quote(mod)).append(" "));
        data.put("HasExplicitMod", builder.toString().trim());
        return this;
    }


    public Block baseType(List<String> types){
        StringBuilder builder = new StringBuilder();
        types.forEach(type -> builder.append(quote(type)).append(" "));
        data.put("BaseType", builder.toString().trim());
        return this;
    }

    public Block baseType(String type){
        data.put("BaseType", quote(type));
        return this;
    }


    public Block Prophecy(List<String> prophecies){
        StringBuilder builder = new StringBuilder();
        prophecies.forEach(p -> builder.append(quote(p)).append(" "));
        data.put("Prophecy", builder.toString().trim());
        return this;
    }

    public Block identified(Boolean b){
        data.put("Identified", b.toString());
        return this;
    }

    public Block corrupted(Boolean b){
        data.put("Corrupted", b.toString());
        return this;
    }

    public Block elderitem(Boolean b){
        data.put("ElderItem", b.toString());
        return this;
    }

    public Block shaperitem(Boolean b){
        data.put("ShaperItem", b.toString());
        return this;
    }

    public Block fracturedItem(Boolean b){
        data.put("FracturedItem", b.toString());
        return this;
    }

    public Block SynthesisedItem(Boolean b){
        data.put("SynthesisedItem", b.toString());
        return this;
    }

    public Block setStyle(Style style){
        this.style = style;
        return this;
    }

    protected abstract String blockStrart();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(blockStrart()).append("\n");
        data.forEach((k, v) -> builder.append(k).append(" ").append(v).append("\n"));
        if (style != null)
            builder.append(style.toString());
        return builder.toString();
    }

    public void print(){
        System.out.println(toString());
    }



}
