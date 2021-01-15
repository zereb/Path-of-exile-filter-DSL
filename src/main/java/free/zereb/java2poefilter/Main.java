package free.zereb.java2poefilter;

import free.zereb.java2poefilter.Styletypes.Style;
import free.zereb.java2poefilter.blocktypes.*;

import java.awt.*;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import static free.zereb.java2poefilter.blocktypes.BaseTypes.*;
import static free.zereb.java2poefilter.blocktypes.ItemClasses.*;
import static free.zereb.java2poefilter.blocktypes.ItemMods.*;



public class Main {

    private Main() throws URISyntaxException, IOException {


        PrintStream fileOut = new PrintStream("./j2pf.filter");
        System.setOut(fileOut);


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
                Merciless, Tyrannical, Dictators, Emperors, Flaring // <- weapon
        );

        var rareMapFragments = List.of(
                FragmentoftheChimera, FragmentoftheHydra, FragmentoftheMinotaur, FragmentofthePhoenix,
                EbersKey,YrielsKey, InyasKey, VolkuursKey, MortalHope, MortalIgnorance, MortalGrief, MortalRage, SacrificeatMidnight,
                OfferingtotheGoddess, DivineVessel, "Scarab", "Breachstone", "Emblem"
        );

        var topCurrency = List.of(
                MirrorofKalandra, EternalOrb, DivineOrb, ExaltedOrb, AlbinoRhoaFeather, HarbingersOrb, OrbofAnnulment, MirrorShard, AwakenersOrb
        );

        var Oils = List.of(
                AmberOil, AzureOil, BlackOil, ClearOil, CrimsonOil, GoldenOil, OpalescentOil, SepiaOil, SilverOil, TealOil, VerdantOil, VioletOil, IndigoOil
        );

        var goodCurrency = List.of(
                BlessedOrb, OrbofFusing, OrbofScouring, OrbofAlchemy, CartographersChisel, GlassblowersBauble, "Sextant",
                SilverCoin, RegalOrb, OrbofRegret, ChaosOrb, GemcuttersPrism, VaalOrb, EngineersOrb, AncientOrb, OrbofBinding,
                StackedDeck, BestiaryOrb, OrbofHorizons, ExaltedShard, "Catalyst"
                //AmberOil, AzureOil, BlackOil, ClearOil, CrimsonOil, GoldenOil, OpalescentOil, SepiaOil, SilverOil, TealOil, VerdantOil, VioletOil
        );

        var mehCurrency = List.of(
                OrbofChance, OrbofAlteration, ChromaticOrb, JewellersOrb, OrbofTransmutation,
                AnnulmentShard, BindingShard, HorizonShard, EngineersShard, AncientShard, ChaosShard, RegalShard, HarbingersShard
        );

        var scarbCurrency = List.of(ArmourersScrap, BlacksmithsWhetstone, OrbofAugmentation);


        var topUniqs = List.of(SapphireFlask, StibniteFlask, GraniteFlask, GloriousPlate, SadistGarb, FullDragonscale, OccultistsVestment);

        var topDivCards = List.of(
                AbandonedWealth, AlluringBounty, BeautyThroughDeath, BurningBlood, HouseofMirrors, HuntersReward, ImmortalResolve, PrideBeforetheFall
                ,PrideoftheFirstOnes, SevenYearsBadLuck, TheCelestialStone,TheDoctor, TheDragonsHeart, TheFiend, TheImmortal, TheIronBard, TheKingsHeart,
                TheLastOneStanding, TheLifeThief, TheNurse, TheQueen, TheRisk, TheSaintsTreasure, TheSamuraisEye, TheSparkandtheFlame, TheUndaunted,
                TheUndisputed, TheWolvenKingsBite, TheWorldEater, WealthandPower, ChaoticDisposition, DarkDreams, TheCartographer, TheCelestialJusticar,
                TheEnlightened, TheMayor, TheProfessor, TheValkyrie, TheVoid, TheWind, TheWolf
        );

        var topIncubators = List.of(TimeLostIncubator, ForebodingIncubator, GeomancersIncubator, ThaumaturgesIncubator);


        var goodBodyArmors = List.of(AstralPlate, GloriousPlate, GladiatorPlate, AssassinBow, VaalRegalia, SacrificialGarb);
        var goodWeapons = List.of(
                BehemothMace, SiegeAxe, VaalBlade, EternalSword, JewelledFoil, VaalRapier,
                GeminiClaw, ImperialClaw, Ambusher, Sai, ImbuedWand);
        var goodTwoHanders = List.of(ImperialStaff, EclipseStaff, Lathi,
                SunderingAxe, EzomyteAxe, VaalAxe, DespotAxe, DespotAxe, VoidAxe, Fleshripper,
                KaruiMaul, ColossusMallet, Piledriver, Meatgrinder, ImperialMaul, TerrorMaul, CoronalMaul,
                HeadmansSword, ReaverSword, EzomyteBlade, VaalGreatsword, LionSword, InfernalSword, ExquisiteBlade,
                EzomyteStaff, MaelströmStaff, JudgementStaff);
        var goodArmor = List.of(FingerlessSilkGloves, TwoTonedBoots, TitanGreaves, SpikedGloves, GrippedGloves, RoyalBurgonet, HubrisCirclet);
        var goodshields = List.of(PinnacleTowerShield, ColossalTowerShield, EzomyteTowerShield, TitaniumSpiritShield);


        var goodRares = new LinkedList<>(goodBodyArmors);
        goodRares.addAll(goodWeapons);
        goodRares.addAll(goodTwoHanders);
        goodRares.addAll(goodArmor);
        goodRares.addAll(goodshields);



        var craftingBases = List.of(
                AstralPlate, VaalRegalia, TitanGauntlets, HubrisCirclet, TwoStoneRing, DiamondRing,
                SiegeAxe, JewelledFoil, VaalRapier, GeminiClaw, Sai, Ambusher,
                MaelströmStaff, ExquisiteBlade, InfernalSword, LionSword, VaalGreatsword, EzomyteBlade, ReaverSword,
                CoronalMaul, ImperialMaul, Meatgrinder,
                Fleshripper, VoidAxe, DespotAxe, VaalAxe, SunderingAxe, EzomyteAxe
        );

        var atlasBases = List.of(
                VermillionRing, CeruleanRing, ConvokingWand,
                OpalRing, CrystalBelt, SpikedGloves, GrippedGloves, FingerlessSilkGloves, VanguardBelt, BoneHelmet,
                BluePearlAmulet, MarbleAmulet, SteelRing, ConvokingWand, VermillionRing, CeruleanRing
        );

        var ritualBases = List.of(DreamquestSlippers, CloudwhisperBoots, BrimstoneTreads, NightwindSlippers, WindbreakBoots, DarksteelTreads, DuskwalkSlippers, StormriderBoots, BasemetalTreads,
                DebilitationGauntlets, GruellingGauntlets, TaxingGauntlets, SinistralGloves, SouthswingGloves, GaucheGloves, NexusGloves, AetherwindGloves, LeylineGloves,
                BlizzardCrown, WinterCrown, GaleCrown, ArchdemonCrown, DemonCrown, ImpCrown, AtonementMask, PenitentMask, SorrowMask
        );


        //ritual
        Show.block()
                .baseType(ritualBases)
                .setStyle(Styles.atlasBases)
                .print();

        var ritualCurrency = List.of(OrbofUnmaking, MavensOrb, RitualSplinter, RitualVessel, CrescentSplinter);
        Show.block()
                .poeClass(StackableCurrency)
                .baseType(ritualCurrency)
                .setStyle(Styles.currecyChaos)
                .print();

        Show.block()
                .baseType(Watchstone)
                .setStyle(Styles.questItems)
                .print();

        Show.block()
                .baseType(MavensInvitation)
                .setStyle(Styles.questItems)
                .print();

        var ritualFragments = List.of(TheMavensWrit, BloodfilledVessel);
        Show.block()
                .baseType(ritualFragments)
                .setStyle(Styles.mapFragmentRare)
                .print();



        //Heist
        Show.block()
                .poeClass(Gems)
                .addPropperty("AlternateQuality True")
                .setStyle(Styles.gem).print();
        Show.block()
                .rarity(Rarity.Unique)
                .addPropperty("Replica True")
                .setStyle(Styles.uniqueAlternate)
                .print();
        Show.block()
                .poeClass(List.of(Trinket, HeistTarget, Contract, Blueprint))
                .setStyle(Styles.questItems).print();
        Show.block()
                .poeClass(List.of(HeistCloak, HeistBrooch, HeistGear, HeistTool));

        //Harvest
        var harvestCurrency = List.of(
                InfusedEngineersOrb, TimelightScroll, FragmentationScroll, DeregulationScroll, ElectroshockScroll, HaemocombustionScroll,
                SpecularityScroll, FacetorsLens
        );

        Show.block()
                .poeClass(StackableCurrency)
                .baseType(harvestCurrency)
                .setStyle(Styles.currecyChaos).print();

        //Delirium
        Show.block()
                .poeClass(StackableCurrency)
                .baseType(DeliriumOrb)
                .setStyle(Styles.currecyChaos).print();

        Show.block()
                .poeClass(MapFragments)
                .baseType(Simulacrum)
                .setStyle(Styles.splinters).print();
        Show.block()
                .poeClass(StackableCurrency)
                .baseType(SimulacrumSplinter)
                .setStyle(Styles.splinters).print();

        Show.block()
                .poeClass(Jewel)
                .baseType("Cluster")
                .setStyle(Styles.gem).print();
        //Metamorph
        Show.block()
                .poeClass(Gems)
                .baseType("Awakened")
                .setStyle(Styles.gemExalt).print();

        //Blight
        Show.block()
                .poeClass(StackableCurrency)
                .baseType(Oils)
                .setStyle(Styles.splinters).print();

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
                .baseType("Prophecy")
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
                .addPropperty("MapTier >= 1")
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
        Show.block()
                .poeClass(Currency)
                .baseType(scarbCurrency)
                .addPropperty("AreaLevel < 68")
                .setStyle(Styles.currencyAlt).print();
        Show.block()
                .baseType("Essence of")
                .setStyle(Styles.essense).print();
        Show.block()
                .baseType(RemnantofCorruption)
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
        shaperList.addAll(ritualBases);
        Show.block()
                .addPropperty("Rarity < Rare")
                .addPropperty("ItemLevel >= 84")
                .baseType(atlasBases)
                .setStyle(Styles.atlasBases).print();
        Show.block()
                .addPropperty("ItemLevel >= 84")
                .HasInfuence(Influence.all)
                .baseType(shaperList)
                .setStyle(Styles.currencyExalt).print();
        Show.block()
                .addPropperty("Rarity < Rare")
                .addPropperty("ItemLevel >= 84")
                .baseType(craftingBases)
                .setStyle(Styles.whiteBases).print();
        Show.block()
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


        HashMap<Integer, String> lifeFlasks = new HashMap<>();
        HashMap<Integer, String> manaFlasks = new HashMap<>();

        lifeFlasks.put(4, SmallLifeFlask);
        lifeFlasks.put(8, MediumLifeFlask);
        lifeFlasks.put(13, LargeLifeFlask);
        lifeFlasks.put(19, GreaterLifeFlask);
        lifeFlasks.put(25, GrandLifeFlask);
        lifeFlasks.put(31, GiantLifeFlask);
        lifeFlasks.put(37, ColossalLifeFlask);
        lifeFlasks.put(43, SacredLifeFlask);
        lifeFlasks.put(51, HallowedLifeFlask);
        lifeFlasks.put(61, SanctifiedLifeFlask);
        lifeFlasks.put(68, DivineLifeFlask);

        manaFlasks.put(4, SmallManaFlask);
        manaFlasks.put(8, MediumManaFlask);
        manaFlasks.put(13, LargeManaFlask);
        manaFlasks.put(19, GreaterManaFlask);
        manaFlasks.put(25, GrandManaFlask);
        manaFlasks.put(31, GiantManaFlask);
        manaFlasks.put(37, ColossalManaFlask);
        manaFlasks.put(43, SacredManaFlask);
        manaFlasks.put(51, HallowedLifeFlask);
        manaFlasks.put(61, SanctifiedManaFlask);
        manaFlasks.put(68, DivineManaFlask);

        lifeFlasks.forEach((k, v) -> Show.block()
                .addPropperty("ItemLevel < " + k.toString())
                .baseType(v)
                .setStyle(Styles.lifeFlasks).print()
        );

        manaFlasks.forEach((k, v) -> Show.block()
                .addPropperty("ItemLevel < " + k.toString())
                .baseType(v)
                .setStyle(Styles.manaFlasks).print()
        );



        var meleeLeveling2h = List.of(TwoHandAxes, TwoHandSwords, TwoHandAxes, Warstaves);

        var meleeLeveling1h = List.of(OneHandAxes, OneHandSwords, Claws, Daggers);


        Show.block()
                .addPropperty("ItemLevel < 16")
                .poeClass(Rings)
                .setStyle(Styles.levleling).print();
        Show.block()
                .poeClass(meleeLeveling2h)
                .addPropperty("DropLevel > 5")
                .addPropperty("ItemLevel < 10")
                .setStyle(Styles.levleling).print();
        Show.block()
                .poeClass(meleeLeveling1h)
                .addPropperty("DropLevel > 5")
                .addPropperty("ItemLevel < 10")
                .setStyle(Styles.levleling).print();



        for (int i = 10; i <= 60; i += 10) {
            Show.block()
                    .poeClass(meleeLeveling2h)
                    .addPropperty("DropLevel > " + i)
                    .addPropperty("ItemLevel < " + (i + 10))
                    .setStyle(Styles.levleling).print();

        }

        Show.block()
                .addPropperty("ItemLevel < 68")
                .poeClass(UtilityFlasks)
                .setStyle(Styles.levlelingFasks).print();
        Show.block()
                .addPropperty("ItemLevel < 35")
                .baseType(List.of(RusticSash, SharktoothArrowQuiver))
                .setStyle(Styles.levleling).print();
        Show.block()
                .addPropperty("DropLevel < 25")
                .rarity(Rarity.Magic)
                .baseType(Boots)
                .setStyle(Styles.levleling).print();

        Show.block()
                .addPropperty("ItemLevel < 68")
                .rarity(Rarity.Rare).print();
        Show.block()
                .addPropperty("ItemLevel < 25")
                .rarity(Rarity.Magic)
                .poeClass(List.of(Rings, Amulets, Belts));
        Show.block()
                .addPropperty("ItemLevel < 15")
                .rarity(Rarity.Magic).print();
        Show.block()
                .addPropperty("ItemLevel < 3")
                .rarity(Rarity.Normal).print();


        Hide.block()
                .rarity(Rarity.Normal).print();
        Hide.block()
                .rarity(Rarity.Magic).print();
        Hide.block()
                .rarity(Rarity.Rare).print();
        Hide.block()
                .poeClass(SupportSkillGems).print();
        Hide.block()
                .poeClass(ActiveSkillGems).print();
        Hide.block()
                .poeClass(StackableCurrency)
                .baseType(List.of(ScrollofWisdom, PortalScroll, ArmourersScrap, BlacksmithsWhetstone)).print();


    }


    public static void main(String[] args) throws IOException, URISyntaxException {
        new Main();
    }
}








