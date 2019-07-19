package free.zereb.java2poefilter;

import free.zereb.java2poefilter.Styletypes.Style;
import free.zereb.java2poefilter.blocktypes.Hide;
import free.zereb.java2poefilter.blocktypes.Rarity;
import free.zereb.java2poefilter.blocktypes.Show;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import static free.zereb.java2poefilter.BaseTypes.*;
import static free.zereb.java2poefilter.ItemClasses.*;
import static free.zereb.java2poefilter.ItemMods.*;



public class Main {

    private Main() throws URISyntaxException, IOException {
        var vials = List.of(
                VialofConsequence, VialofDominance, VialofFate, VialofSummoning, VialoftheRitual,
                VialofTranscendence, VialofSacrifice, VialofAwakening, VialoftheGhost
        );

        var fossils = List.of(
                AberrantFossil, AethericFossil, BloodstainedFossil, BoundFossil, CorrodedFossil, DenseFossil,
                EnchantedFossil, EncrustedFossil, FacetedFossil, FracturedFossil, FrigidFossil, GildedFossil,
                GlyphicFossil, HollowFossil, JaggedFossil, LucentFossil, MetallicFossil, PerfectFossil, PrismaticFossil,
                PristineFossil, SanctifiedFossil, ScorchedFossil, SerratedFoil, ShudderingFossil, TangledFossil
        );

        var blueMods = List.of(
                oftheUnderground, Subterranean, ofCrafting, ofSpellcraft, ofWeaponcraft, // <- delve
                "Citaqualotl", "Guatelitzi", "Matatl", "Puhuarte", "Tacati", "Topotante", "Xopec", // <- incursion
                Brinerot, Mutewind, Redblade, // <- warbands
                Merciless, Tyrannical, Dictators // <- weapon worth mulltimoding
        );

        var rareMapFragments = List.of(
                FragmentoftheChimera, FragmentoftheHydra, FragmentoftheMinotaur, FragmentofthePhoenix,
                EbersKey,YrielsKey, InyasKey, VolkuursKey, MortalHope, MortalIgnorance, MortalGrief, MortalRage, SacrificeatMidnight,
                OfferingtotheGoddess, DivineVessel, "Scarab", "Breachstone", "Emblem"
        );

        var topCurrency = List.of(
                MirrorofKalandra, EternalOrb, DivineOrb, ExaltedOrb, AlbinoRhoaFeather, HarbingersOrb, OrbofAnnulment, MirrorShard
        );

        var goodCurrency = List.of(
                BlessedOrb, OrbofFusing, OrbofScouring, OrbofAlchemy, CartographersChisel, GlassblowersBauble, "Sextant",
                SilverCoin, RegalOrb, OrbofRegret, ChaosOrb, GemcuttersPrism, VaalOrb, EngineersOrb, AncientOrb, OrbofBinding,
                StackedDeck, BestiaryOrb, OrbofHorizons
        );

        var mehCurrency = List.of(
                OrbofChance, OrbofAlteration, ChromaticOrb, JewellersOrb,
                AnnulmentShard, BindingShard, HorizonShard, EngineersShard, AncientShard, ChaosShard, RegalShard, HarbingersShard
        );

        var scarbCurrency = List.of(ArmourersScrap, BlacksmithsWhetstone, OrbofAugmentation, OrbofTransmutation);

        var scrolls = List.of("Scroll");

        var topUniqs = List.of(SapphireFlask, StibniteFlask, GraniteFlask, GloriousPlate, SadistGarb, FullDragonscale, OccultistsVestment);

        var topDivCards = List.of(
                "Abandoned Wealth", "Alluring Bounty", "Beauty Through Death", "Burning Blood", "House of Mirrors", "Hunter's Reward",
                "Immortal Resolve", "Pride Before the Fall", "Pride of the First Ones", "Seven Years Bad Luck", "The Celestial Stone",
                "The Doctor", "The Dragon's Heart", "The Fiend", "The Immortal", "The Iron Bard", "The King's Heart", "The Last One Standing",
                "The Life Thief", "The Nurse", "The Queen", "The Risk", "The Saint's Treasure", "The Samurai's Eye", "The Spark and the Flame",
                "The Undaunted", "The Undisputed", "The Wolven King's Bite", "The World Eater", "Wealth and Power", "Chaotic Disposition",
                "Dark Dreams", "The Cartographer", "The Celestial Justicar", "The Enlightened", "The Mayor", "The Professor", "The Valkyrie",
                "The Void", "The Wind", "The Wolf"
        );

        var topIncubators = List.of(TimeLostIncubator, EldritchIncubator, ForebodingIncubator, GeomancersIncubator, ThaumaturgesIncubator);


        var goodBodyArmors = List.of(AstralPlate, GloriousPlate, GladiatorPlate, AssassinBow, VaalRegalia, SacrificialGarb);
        var goodWeapons = List.of(
                BehemothMace, CoronalMaul, SiegeAxe, VaalAxe, Fleshripper, VaalBlade, EternalSword, JewelledFoil, VaalRapier,
                ExquisiteBlade, GeminiClaw, ImperialClaw, Ambusher, Sai, ImperialStaff, ImbuedWand);
        var goodArmor = List.of(FingerlessSilkGloves, TwoTonedBoots, TitanGreaves, SpikedGloves, GrippedGloves, RoyalBurgonet, HubrisCirclet);
        var goodshields = List.of(PinnacleTowerShield, ColossalTowerShield, EzomyteTowerShield, TitaniumSpiritShield);


        var goodRares = new LinkedList<>(goodBodyArmors);
        goodRares.addAll(goodWeapons);
        goodRares.addAll(goodArmor);
        goodRares.addAll(goodshields);



        var craftingBases = List.of(
                AstralPlate, VaalRegalia, TitanGauntlets, HubrisCirclet, TwoStoneRing, DiamondRing,
                SiegeAxe, VaalAxe, JewelledFoil, VaalRapier, Fleshripper, GeminiClaw, CoronalMaul, Sai, Ambusher, ImperialStaff, ExquisiteBlade
        );

        var atlasBases = List.of(
                OpalRing, CrystalBelt, SpikedGloves, GrippedGloves, FingerlessSilkGloves, VanguardBelt, BoneHelmet,
                BluePearlAmulet, MarbleAmulet, SteelRing
        );


        //Legion
        Show.block()
                .poeClass(Incubator)
                .baseType(topIncubators)
                .setStyle(Styles.currencyExalt).print();
        Show.block()
                .poeClass(Incubator)
                .setStyle(Styles.splinters).print();

        //incursion
        Show.block()
                .baseType(StoneofPassage)
                .setStyle(Styles.questItems).print();
        Show.block()
                .baseType(vials)
                .setStyle(Styles.mapFragmentRare).print();
        //delve
        Show.block()
                .baseType(TimewornReliquaryKey)
                .setStyle(Styles.currencyExalt).print();
        Show.block()
                .poeClass(Currency)
                .baseType(fossils)
                .setStyle(Styles.currecyChaos).print();
        Show.block()
                .poeClass(Currency)
                .baseType("Resonator")
                .setStyle(Styles.currecyChaos).print();
       //misc
        Show.block()
                .hasExplicitMod(blueMods)
                .setStyle(Styles.blueWithMod).print();
        Show.block()
                .poeClass(StackableCurrency)
                .baseType(PerandusCoin)
                .setStyle(Styles.splinters).print();
        Show.block()
                .poeClass(StackableCurrency)
                .baseType("Splinter")
                .setStyle(Styles.splinters).print();
        Show.block()
                .poeClass(Jewel)
                .rarity(Rarity.Rare)
                .setStyle(Styles.jewelRare).print();
        Show.block()
                .poeClass(Jewel)
                .rarity(Rarity.Magic)
                .setStyle(Styles.jewelMagic).print();
        Show.block()
                .poeClass(StackableCurrency)
                .baseType("Blessing")
                .setStyle(Styles.mapFragmentRare).print();
        Show.block()
                .poeClass(Amulets)
                .baseType("Talisman")
                .setStyle(new Style()
                        .setBackgroundColor(Color.black)
                        .setBorderColor(new Color(50, 230, 100))
                        .setFontSize(45)
                ).print();
        Show.block()
                .poeClass(StackableCurrency)
                .baseType(Prophecy)
                .setStyle(Styles.prophecy).print();
        Show.block()
                .poeClass(Piece)
                .setStyle(Styles.splinters).print();
        //6 and 5 links
        Show.block()
                .addPropperty("LinkedSockets = 6")
                .setStyle(Styles.currencyExalt).print();
        Show.block()
                .addPropperty("Sockets = 6")
                .setStyle(Styles.utilFlask).print();
        Show.block()
                .addPropperty("LinkedSockets = 5")
                .setStyle(Styles.utilFlask).print();

        //map and fragmets
        Show.block()
                .baseType(rareMapFragments)
                .setStyle(Styles.mapFragmentRare).print();
        Show.block()
                .poeClass(MapFragments)
                .setStyle(Styles.mapFragmentCommon).print();
        Show.block()
                .poeClass(Maps)
                .rarity(Rarity.Unique)
                .setStyle(Styles.uniqueChaos).print();
        Show.block()
                .poeClass(Maps)
                .addPropperty("MapTier > 14")
                .setStyle(Styles.mapRedend).print();
        Show.block()
                .poeClass(Maps)
                .addPropperty("MapTier > 10")
                .setStyle(Styles.mapRed).print();
        Show.block()
                .poeClass(Maps)
                .addPropperty("MapTier > 5")
                .setStyle(Styles.mapYellow).print();
        Show.block()
                .poeClass(Maps)
                .addPropperty("MapTier < 5")
                .setStyle(Styles.mapWhite).print();

        //currency
        Show.block()
                .poeClass(Currency)
                .baseType(topCurrency)
                .setStyle(Styles.currencyExalt).print();
        Show.block()
                .poeClass(Currency)
                .baseType(goodCurrency)
                .setStyle(Styles.currecyChaos).print();
        Show.block()
                .poeClass(Currency)
                .baseType(mehCurrency)
                .setStyle(Styles.currencyAlt).print();
        Hide.block()
                .poeClass(Currency)
                .baseType(scarbCurrency)
                .setStyle(Styles.currencyAlt).print();
        Hide.block()
                .poeClass(Currency)
                .baseType(scrolls)
                .setStyle(Styles.currencyAlt).print();

        Show.block()
                .baseType("Essence of")
                .setStyle(Styles.essense).print();

        //uniques
        Show.block()
                .rarity(Rarity.Unique)
                .baseType(topUniqs)
                .setStyle(Styles.uniqueExalt).print();
        Show.block()
                .rarity(Rarity.Unique)
                .setStyle(Styles.uniqueChaos).print();

        Show.block()
                .poeClass(DivinationCard)
                .baseType(topDivCards)
                .setStyle(Styles.divcardExalt).print();
        Show.block()
                .poeClass(DivinationCard)
                .setStyle(Styles.divCardChaos).print();

        //rares and craftin

        var shaperList = new LinkedList<>(atlasBases);
        shaperList.addAll(craftingBases);


        Show.block()
                .addPropperty("ItemLevel > 84")
                .shaperitem(true)
                .baseType(shaperList)
                .setStyle(Styles.currencyExalt).print();
        Show.block()
                .addPropperty("ItemLevel >= 84")
                .elderitem(true)
                .baseType(shaperList)
                .setStyle(Styles.currencyExalt).print();
        Show.block()
                .addPropperty("Rarity < Rare")
                .addPropperty("ItemLevel >= 84")
                .baseType(craftingBases)
                .setStyle(Styles.whiteBases).print();
        Show.block()
                .addPropperty("Rarity < Rare")
                .addPropperty("ItemLevel >= 84")
                .baseType(atlasBases)
                .setStyle(Styles.atlasBases).print();

        Show.block()
                .shaperitem(true)
                .setStyle(Styles.elderShaperItem).print();
        Show.block()
                .elderitem(true)
                .setStyle(Styles.elderShaperItem).print();

        Show.block()
                .rarity(Rarity.Rare)
                .poeClass(List.of("Belts", "Amulets", "Rings"))
                .setStyle(Styles.jewelRare).print();

        Show.block()
                .rarity(Rarity.Rare)
                .baseType(goodRares)
                .setStyle(Styles.rareGood).print();


        Show.block()
                .poeClass("Gem")
                .baseType(List.of("Enhance", "Empower", "Enlighten"))
                .setStyle(Styles.gemExalt).print();
        Show.block()
                .poeClass("Gem")
                .addPropperty("Quality > 18")
                .setStyle(Styles.gemExalt).print();
        Show.block()
                .poeClass("Gem")
                .addPropperty("GemLevel > 19")
                .setStyle(Styles.gemExalt).print();
        Show.block()
                .poeClass("Gem")
                .baseType(List.of("Portal", "Added Chaos Damage", "Vaal"))
                .setStyle(Styles.gem).print();

        Show.block()
                .poeClass(List.of("Quest", "Pantheon Soul"))
                .setStyle(Styles.questItems).print();
        Show.block()
                .baseType(List.of("Silver Key", "Golden Key", "Treasure Key", "Keg"))
                .setStyle(Styles.questItems).print();

        Show.block()
                .addPropperty("Identified True")
                .rarity(Rarity.Rare).print();

        Hide.block()
                .addPropperty("ItemLevel >= 35")
                .poeClass(List.of(LifeFlasks, ManaFlasks))
                .baseType(List.of("Grand", "Greater", "Large", "Medium", "Small")).print();
        Hide.block()
                .addPropperty("ItemLevel >= 53")
                 .poeClass(List.of(LifeFlasks, ManaFlasks))
                .baseType(List.of("Colossal" ,"Giant" ,"Sacred")).print();
        Hide.block()
                .addPropperty("ItemLevel >= 67")
                .poeClass(List.of(LifeFlasks, ManaFlasks))
                .baseType(List.of("Divine", "Eternal", "Hallowed", "Sanctified")).print();

        String lvl_flask = new String(Files.readAllBytes(Paths.get(getClass().getResource("/lvling_flasks").toURI())));
        System.out.println(lvl_flask);

        Show.block()
                .addPropperty("ItemLevel < 68")
                .poeClass(UtilityFlasks)
                .baseType(List.of(GraniteFlask, BasaltFlask, DiamondFlask, SilverFlask, QuicksilverFlask, JadeFlask, StibniteFlask))
                .setStyle(Styles.levlelingFasks).print();
        Show.block()
                .addPropperty("ItemLevel < 68")
                .baseType(RusticSash)
                .setStyle(Styles.levleling).print();





        Hide.block()
                .rarity(Rarity.Rare).print();
        Hide.block()
                .rarity(Rarity.Magic).print();
        Hide.block()
                .rarity(Rarity.Normal).print();




































    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        Utils.creteJavaObjects(ItemMods.url);
        new Main();
    }
}








