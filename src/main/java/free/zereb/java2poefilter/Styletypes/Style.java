package free.zereb.java2poefilter.Styletypes;



import free.zereb.java2poefilter.Utils;

import java.awt.*;
import java.util.HashMap;

public class Style {

    private HashMap<String, String> result = new HashMap<>();
    private static String SetTextColor = "SetTextColor";
    private static String SetBackgroundColor = "SetBackgroundColor";
    private static String SetBorderColor = "SetBorderColor";
    private static String SetFontSize = "SetFontSize";
    private static String PlayAlertSound = "PlayAlertSound";
    private static String PlayEffect = "PlayEffect";
    private static String MinimapIcon = "MinimapIcon";



    public Style setTextColor(Color color){
        result.putIfAbsent(SetTextColor,color.getRed() + " " + color.getGreen() + " " + color.getBlue() + "255");
        return this;
    }

    public Style setBackgroundColor(Color color){
        result.putIfAbsent(SetBackgroundColor,color.getRed() + " " + color.getGreen() + " " + color.getBlue() + "255");
        return this;
    }

    public Style setBorderColor(Color color){
        result.putIfAbsent(SetBorderColor,color.getRed() + " " + color.getGreen() + " " + color.getBlue() + "255");
        return this;
    }

    public Style setFontSize(int fontSize){
        String fontSizeS = String.valueOf(Utils.clamp(fontSize, 18, 45));

        result.putIfAbsent(SetFontSize, fontSizeS);
        return this;
    }

    public Style playAlertSound(AlertSound sound){
        result.putIfAbsent(PlayAlertSound, sound.toString());
        return this;
    }

    public Style playEffect(EffectColor effect){
        result.putIfAbsent(PlayEffect, effect.color);
        return this;
    }

    public Style minimapIcon(MinimapIcon icon){
        result.putIfAbsent(MinimapIcon, icon.toString());
        return this;
    }



    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        result.forEach((k, v) -> {
            builder.append(k).append(" ").append(v).append("\n");
        });
        return builder.toString();
    }
}
