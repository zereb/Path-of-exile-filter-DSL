package free.zereb.java2poefilter;

import free.zereb.java2poefilter.Styletypes.*;

import java.awt.*;

public class Styles {
    private static Color green = new Color(74, 230, 56);
    private static Color altGray = new Color(170, 158, 130);

    private static AlertSound mapSound = new AlertSound(4, 300);
    private static AlertSound uniqueSound = new AlertSound(6, 300);
    private static AlertSound exaltSound = new AlertSound(2, 300);
    private static AlertSound chaosSound = new AlertSound(1, 300);
    private static AlertSound atlasBasesSound = new AlertSound(9, 300);


public static Style questItems = new Style()
        .setTextColor(green)
        .setBorderColor(green)
        .setFontSize(45)
        .minimapIcon(new MinimapIcon(EffectColor.Green, PoeShape.Circle, PoeIconSize.large))
        .playEffect(EffectColor.Green);

public static Style mapFragmentCommon = new Style()
        .setBackgroundColor(Color.black)
        .setFontSize(45)
        .playAlertSound(mapSound);

public static Style mapFragmentRare = new Style()
        .setBackgroundColor(Color.black)
        .setBorderColor(Color.CYAN)
        .setFontSize(45)
        .playAlertSound(uniqueSound)
        .playEffect(EffectColor.White)
        .minimapIcon(new MinimapIcon(EffectColor.White, PoeShape.Hexagon, PoeIconSize.large));

public static Style currencyExalt = new Style()
        .setTextColor(Color.RED)
        .setBackgroundColor(Color.WHITE)
        .setBorderColor(Color.RED)
        .setFontSize(45)
        .playAlertSound(exaltSound)
        .minimapIcon(new MinimapIcon(EffectColor.Red, PoeShape.Star, PoeIconSize.large))
        .playEffect(EffectColor.Red);

public static Style currecyChaos = new Style()
        .setTextColor(Color.black)
        .setBackgroundColor(new Color(213, 159, 0))
        .setBorderColor(Color.black)
        .setFontSize(45)
        .playAlertSound(chaosSound);

public static Style currencyAlt = new Style()
        .setTextColor(altGray)
        .setFontSize(40);

public static Style essense = new Style()
        .setTextColor(Color.black)
        .setBackgroundColor(new Color(15, 180, 200))
        .setBorderColor(Color.black)
        .setFontSize(40)
        .playAlertSound(chaosSound);

public static Style uniqueExalt = new Style()
        .setTextColor(new Color(180, 96, 0))
        .setBackgroundColor(Color.white)
        .setBorderColor(new Color(180, 96, 0))
        .setFontSize(45)
        .playAlertSound(exaltSound)
        .playEffect(EffectColor.Brown)
        .minimapIcon(new MinimapIcon(EffectColor.Brown, PoeShape.Star, PoeIconSize.large));


public static Style uniqueChaos = new Style()
        .setTextColor(new Color(175, 96, 37))
        .setBorderColor(new Color(175, 96, 37))
        .setBackgroundColor(Color.black)
        .setFontSize(45)
        .playAlertSound(uniqueSound);

public static Style divcardExalt = new Style()
        .setTextColor(Color.black)
        .setBackgroundColor(Color.white)
        .setBorderColor(new Color(184, 218, 242))
        .setFontSize(45)
        .playAlertSound(exaltSound)
        .playEffect(EffectColor.Blue)
        .minimapIcon(new MinimapIcon(EffectColor.Blue, PoeShape.Square, PoeIconSize.large));

public static Style divCardChaos = new Style()
        .setTextColor(Color.black)
        .setBackgroundColor(new Color(184, 218, 242))
        .setBorderColor(new Color(136, 136, 255))
        .setFontSize(40)
        .playAlertSound(chaosSound);

public static Style rareGood = new Style()
        .setTextColor(new Color(255, 215, 0))
        .setBackgroundColor(Color.black)
        .setBorderColor(new Color(255, 215, 0))
        .setFontSize(45);

public static Style elderShaperItem = new Style()
        .setTextColor(new Color(255, 255, 119))
        .setBackgroundColor(Color.black)
        .setBorderColor(new Color(127, 127, 127))
        .setFontSize(45);

public static Style whiteBases = new Style()
        .setTextColor(Color.white)
        .setBackgroundColor(Color.black)
        .setBorderColor(new Color(255, 215, 0))
        .setFontSize(45);

public static Style atlasBases = new Style()
        .setBackgroundColor(Color.black)
        .setBorderColor(new Color(30, 144, 255))
        .setFontSize(45)
        .playAlertSound(new AlertSound(8, 300))
        .minimapIcon(new MinimapIcon(EffectColor.Blue, PoeShape.Circle, PoeIconSize.large));

public static Style utilFlask = new Style()
        .setBackgroundColor(new Color(128, 128, 128))
        .setBorderColor(new Color(200, 200,200))
        .setFontSize(40);

public static Style gemExalt = new Style()
        .setBackgroundColor(Color.white)
        .setTextColor(new Color(30, 150, 180))
        .setBorderColor(new Color(30, 150, 180))
        .setFontSize(45)
        .playEffect(EffectColor.Blue)
        .minimapIcon(new MinimapIcon(EffectColor.Blue, PoeShape.Star, PoeIconSize.large))
        .playAlertSound(exaltSound);

public static Style gem = new Style()
        .setBorderColor(new Color(30, 150, 180))
        .setFontSize(45);

public static Style splinters = new Style()
        .setTextColor(new Color(231, 180, 120))
        .setBackgroundColor(Color.black)
        .setBorderColor(new Color(231, 180, 120))
        .setFontSize(45);

public static Style jewelRare = new Style()
        .setTextColor(new Color(231, 180, 120))
        .setTextColor(Color.black)
        .setBorderColor(new Color(255, 200, 0))
        .setFontSize(45);

 public static Style jewelMagic = new Style()
        .setTextColor(new Color(100, 100, 242))
        .setTextColor(Color.black)
        .setBorderColor(new Color(100, 100, 242))
        .setFontSize(45);

 public static Style blueWithMod = new Style()
         .setTextColor(Color.white)
         .setBackgroundColor(Color.black)
         .setBorderColor(new Color(136, 136, 255))
         .setFontSize(45)
         .playAlertSound(atlasBasesSound);

 public static Style prophecy = new Style()
         .setTextColor(Color.black)
         .setBackgroundColor(new Color(176, 93, 255))
         .setBorderColor(Color.black)
         .setFontSize(45)
         .playAlertSound(chaosSound);

 public static Style mapWhite = new Style()
         .setTextColor(Color.white)
         .setBackgroundColor(Color.black)
         .setFontSize(42)
         .playAlertSound(mapSound);

 public static Style mapYellow = new Style()
         .setTextColor(Color.white)
         .setBackgroundColor(Color.black)
         .setBorderColor(Color.white)
         .setFontSize(42)
         .playAlertSound(mapSound);

 public static Style mapRed = new Style()
         .setTextColor(new Color(255, 40, 0))
         .setBackgroundColor(Color.black)
         .setBorderColor(Color.black)
         .setFontSize(45)
         .playAlertSound(mapSound);

 public static Style mapRedend = new Style()
         .setTextColor(new Color(255, 40, 0))
         .setBackgroundColor(Color.black)
         .setBorderColor(new Color(255, 40, 0))
         .setFontSize(45)
         .playAlertSound(mapSound)
         .playEffect(EffectColor.Red);

}
