# j2pf
Path of exile filter in java

#Example usage:

```java
Show.block()
          .poeClass(StackableCurrency) 
          .baseType("Oil")
          .setStyle(Styles.splinters).print();
                
Show.block()
          .addPropperty("ItemLevel > 84")
          .shaperitem(true)
          .baseType(shaperList)
          .setStyle(Styles.currencyExalt).print();

```
#Example style
```java
public static Style currencyExalt = new Style()
        .setTextColor(Color.RED)
        .setBackgroundColor(Color.WHITE)
        .setBorderColor(Color.RED)
        .setFontSize(45)
        .playAlertSound(exaltSound)
        .minimapIcon(new MinimapIcon(EffectColor.Red, PoeShape.Star, PoeIconSize.large))
        .playEffect(EffectColor.Red); //beam effect
```

#You can utilize java lists like this
```java
var craftingBases = List.of(
                AstralPlate, VaalRegalia, TitanGauntlets, HubrisCirclet, TwoStoneRing, DiamondRing,
                SiegeAxe, VaalAxe, JewelledFoil, VaalRapier, Fleshripper, GeminiClaw, CoronalMaul, Sai, Ambusher, ImperialStaff, ExquisiteBlade);
        
        
Show.block()
          .addPropperty("Rarity < Rare")
          .addPropperty("ItemLevel >= 84")
          .baseType(craftingBases)
          .setStyle(Styles.whiteBases).print();
```
For more exaple: https://github.com/zereb/j2pf/blob/master/src/main/java/free/zereb/java2poefilter/Main.java
