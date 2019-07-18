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


public class Main {

    private Main() throws URISyntaxException, IOException {
        var vials = List.of(
                "Vial of Consequence", "Vial of Dominance", "Vial of Fate", "Vial of Summoning", "Vial of the Ritual",
                "Vial of Transcendence", "Vial of Sacrifice", "Vial of Awakening", "Vial of the Ghost"
        );

        var fossils = List.of(
                "Aberrant Fossil", "Aetheric Fossil", "Bloodstained Fossil", "Bound Fossil", "Corroded Fossil",
                "Dense Fossil", "Enchanted Fossil", "Encrusted Fossil", "Faceted Fossil", "Fractured Fossil",
                "Frigid Fossil", "Gilded Fossil", "Glyphic Fossil", "Hollow Fossil", "Jagged Fossil", "Lucent Fossil",
                "Metallic Fossil", "Perfect Fossil", "Prismatic Fossil", "Pristine Fossil", "Sanctified Fossil", "Scorched Fossil"
                ,"Serrated Fossil", "Shuddering Fossil", "Tangled Fossil")
                ;

        var blueMods = List.of("of the Underground", "Subterranean", "of Crafting", "of Spellcraft", "of Weaponcraft",
                "Citaqualotl", "Guatelitzi", "Matatl", "Puhuarte", "Tacati", "Topotante", "Xopec"
                );

        var rareMapFragments = List.of("Fragment of the Chimera", "Fragment of the Hydra", "Fragment of the Minotaur", "Fragment of the Phoenix",
                "Offering to the Goddess", "Divine Vessel", "Mortal Grief", "Mortal Hope", "Mortal Rage", "Mortal Ignorance",
                "Sacrifice at Midnight", "Eber's Key", "Yriel's Key", "Inya's Key", "Volkuur's Key", "Scarab", "Breachstone", "Emblem"
        );

        var topCurrency = List.of("Mirror of Kalandra", "Eternal Orb", "Divine Orb", "Exalted Orb", "Albino Rhoa Feather", "Harbinger's Orb", "Orb of Annulment" , "Mirror Shard");

        var goodCurrency = List.of("Blessed Orb", "Orb of Fusing", "Orb of Scouring", "Orb of Alchemy", "Cartographer's Chisel",
                "Glassblower's Bauble", "Sextant", "Silver Coin", "Regal Orb", "Orb of Regret", "Chaos Orb",
                "Gemcutter's Prism", "Vaal Orb", "Engineer's Orb", "Ancient Orb", "Orb of Binding", "Stacked Deck", "Bestiary Orb",
                "Orb of Horizons"
        );

        var mehCurrency = List.of("Orb of Chance", "Orb of Alteration", "Chromatic Orb", "Jeweller's Orb",
                "Annulment Shard", "Binding Shard", "Horizon Shard", "Harbinger's Shard", "Engineer's Shard", "Ancient Shard", "Chaos Shard"
        );

        var scarbCurrency = List.of("Armourer's Scrap", "Blacksmith's Whetstone", "Orb of Augmentation", "Orb of Transmutation");

        var scrolls = List.of("Scroll");

        var topUniqs = List.of("Quartz Flask", "Ruby Flask", "Sapphire Flask", "Silver Flask", "Stibnite Flask", "Glorious Plate");

        var topDivCards = List.of(
                "Abandoned Wealth", "Alluring Bounty", "Beauty Through Death", "Burning Blood", "House of Mirrors", "Hunter's Reward",
                "Immortal Resolve", "Pride Before the Fall", "Pride of the First Ones", "Seven Years Bad Luck", "The Celestial Stone",
                "The Doctor", "The Dragon's Heart", "The Fiend", "The Immortal", "The Iron Bard", "The King's Heart", "The Last One Standing",
                "The Life Thief", "The Nurse", "The Queen", "The Risk", "The Saint's Treasure", "The Samurai's Eye", "The Spark and the Flame",
                "The Undaunted", "The Undisputed", "The Wolven King's Bite", "The World Eater", "Wealth and Power", "Chaotic Disposition",
                "Dark Dreams", "The Cartographer", "The Celestial Justicar", "The Enlightened", "The Mayor", "The Professor", "The Valkyrie",
                "The Void", "The Wind", "The Wolf"
        );

        var topIncubators = List.of("Time-Lost Incubator", "Eldritch Incubator", "Foreboding Incubator", "Geomancer's Incubator", "Thaumaturge's Incubator");


        var goodBodyArmors = List.of("Astral Plate", "Glorious Plate", "Gladiator Plate", "Assassin's Garb", "Vaal Regalia", "Sacrificial Garb");
        var goodWeapons = List.of("Behemoth Mace", "Coronal Maul", "Siege Axe", "Vaal Axe", "Fleshripper", "Vaal Blade", "Eternal Sword", "Jewelled Foil", "Vaal Rapier",
                "Exquisite Blade", "Gemini Claw", "Imperial Claw", "Ambusher", "Sai", "Imperial Staff", "Imbued Wand");
        var goodArmor = List.of("Fingerless Silk Gloves", "Two-Toned Boots", "Titan Greaves", "Spiked Gloves", "Gripped Gloves", "Royal Burgonet", "Hubris Circlet");
        var goodshields = List.of("Pinnacle Tower Shield", "Colossal Tower Shield", "Ezomyte Tower Shield", "Titanium Spirit Shield");


        var goodRares = new LinkedList<>(goodBodyArmors);
        goodRares.addAll(goodWeapons);
        goodRares.addAll(goodArmor);
        goodRares.addAll(goodshields);



        var craftingBases = List.of("Astral Plate", "Vaal Regalia", "Titanium Spirit Shield", "Hubris Circlet", "Royal Burgonet",
                "Two-Stone Ring", "Diamond Ring", "Siege Axe", "Vaal Axe", "Jewelled Foil", "Vaal Rapier",
                "Fleshripper", "Gemini Claw", "Coronal Maul", "Sai", "Ambusher", "Imperial Staff"
        );

        var atlasBases = List.of("Opal Ring", "Crystal Belt", "Spiked Gloves", "Gripped Gloves", "Fingerless Silk Gloves", "Vanguard Belt",
                "Bone Helmet", "Blue Pearl Amulet", "Marble Amulet", "Steel Ring");




        //Legion
        Show.block()
                .poeClass("Incubator")
                .baseType(topIncubators)
                .setStyle(Styles.currencyExalt).print();
        Show.block()
                .poeClass("Incubator")
                .setStyle(Styles.splinters).print();

        //incursion
        Show.block()
                .baseType("Stone of Passage")
                .setStyle(Styles.questItems).print();
        Show.block()
                .baseType(vials)
                .setStyle(Styles.mapFragmentRare).print();
        //delve
        Show.block()
                .baseType("Timeworn Reliquary Key")
                .setStyle(Styles.currencyExalt).print();
        Show.block()
                .poeClass("Currency")
                .baseType(fossils)
                .setStyle(Styles.currecyChaos).print();
        Show.block()
                .poeClass("Currency")
                .baseType("Resonator")
                .setStyle(Styles.currecyChaos).print();
       //misc
        Show.block()
                .hasExplicitMod(blueMods)
                .setStyle(Styles.blueWithMod).print();
        Show.block()
                .poeClass("Stackable Currency")
                .baseType("Perandus Coin")
                .setStyle(Styles.splinters).print();
        Show.block()
                .poeClass("Stackable Currency")
                .baseType("Splinter")
                .setStyle(Styles.splinters).print();
        Show.block()
                .poeClass("Jewel")
                .rarity(Rarity.Rare)
                .setStyle(Styles.jewelRare).print();
        Show.block()
                .poeClass("Jewel")
                .rarity(Rarity.Magic)
                .setStyle(Styles.jewelMagic).print();
        Show.block()
                .poeClass("Stackable Currency")
                .baseType("Blessing")
                .setStyle(Styles.mapFragmentRare).print();
        Show.block()
                .poeClass("Amulets")
                .baseType("Talisman")
                .setStyle(new Style()
                        .setBackgroundColor(Color.black)
                        .setBorderColor(new Color(50, 230, 100))
                        .setFontSize(45)
                ).print();
        Show.block()
                .poeClass("Stackable Currency")
                .baseType("Prophecy")
                .setStyle(Styles.prophecy).print();
        Show.block()
                .poeClass("Piece")
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
                .poeClass("Map Fragments")
                .setStyle(Styles.mapFragmentCommon).print();
        Show.block()
                .poeClass("Maps")
                .rarity(Rarity.Unique)
                .setStyle(Styles.uniqueChaos).print();
        Show.block()
                .poeClass("Maps")
                .addPropperty("MapTier > 14")
                .setStyle(Styles.mapRedend).print();
        Show.block()
                .poeClass("Maps")
                .addPropperty("MapTier > 10")
                .setStyle(Styles.mapRed).print();
        Show.block()
                .poeClass("Maps")
                .addPropperty("MapTier > 5")
                .setStyle(Styles.mapYellow).print();
        Show.block()
                .poeClass("Maps")
                .addPropperty("MapTier < 5")
                .setStyle(Styles.mapWhite).print();

        //currency
        Show.block()
                .poeClass("Currency")
                .baseType(topCurrency)
                .setStyle(Styles.currencyExalt).print();
        Show.block()
                .poeClass("Currency")
                .baseType(goodCurrency)
                .setStyle(Styles.currecyChaos).print();
        Show.block()
                .poeClass("Currency")
                .baseType(mehCurrency)
                .setStyle(Styles.currencyAlt).print();
        Hide.block()
                .poeClass("Currency")
                .baseType(scarbCurrency)
                .setStyle(Styles.currencyAlt).print();
        Hide.block()
                .poeClass("Currency")
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
                .poeClass("Divination Card")
                .baseType(topDivCards)
                .setStyle(Styles.divcardExalt).print();
        Show.block()
                .poeClass("Divination Card")
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
                .poeClass(List.of("Life Flask", "Mana Flask"))
                .baseType(List.of("Grand", "Greater", "Large", "Medium", "Small")).print();
         Hide.block()
                .addPropperty("ItemLevel >= 53")
                 .poeClass(List.of("Life Flask", "Mana Flask"))
                .baseType(List.of("Colossal" ,"Giant" ,"Sacred")).print();
         Hide.block()
                .addPropperty("ItemLevel >= 67")
                 .poeClass(List.of("Life Flask", "Mana Flask"))
                .baseType(List.of("Divine", "Eternal", "Hallowed", "Sanctified")).print();

         String lvl_flask = new String(Files.readAllBytes(Paths.get(getClass().getResource("/lvling_flasks").toURI())));
         System.out.println(lvl_flask);


        Hide.block()
                .rarity(Rarity.Rare).print();
        Hide.block()
                .rarity(Rarity.Magic).print();
        Hide.block()
                .rarity(Rarity.Normal).print();




































    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        new Main();
    }
}












    /* *

A Dab of Ink
A Mother's Parting Gift
Abandoned Wealth
Aberrant Fossil
Abyssal Axe
Abyssal Cry
Abyssal Incubator
Abyssal Sceptre
Academy Map
Acid Caverns Map
Added Chaos Damage Support
Added Cold Damage Support
Added Fire Damage Support
Added Lightning Damage Support
Additional Accuracy Support
Advanced Traps Support
Aetheric Fossil
Agate Amulet
Albino Rhoa Feather
Alchemy Shard
Alder Spiked Shield
Alira's Amulet
Alleyways Map
Allflame
Alloyed Spiked Shield
Alluring Bounty
Alone in the Darkness
Alteration Shard
Amber Amulet
Ambush Boots
Ambush Leaguestone
Ambush Mitts
Ambusher
Amethyst Flask
Amethyst Ring
Ammonite Glyph
Anarchy Leaguestone
Anarchy's Price
Ancestral Call Support
Ancestral Club
Ancestral Protector
Ancestral Warchief
Ancient City Map
Ancient Gauntlets
Ancient Greaves
Ancient Orb
Ancient Reliquary Key
Ancient Shard
Ancient Spirit Shield
Ancient Sword
Angelic Kite Shield
Anger
Animate Guardian
Animate Weapon
Ankh of Eternity
Annulment Shard
Antique Gauntlets
Antique Greaves
Antique Rapier
Apex Rapier
Apprentice Cartographer's Seal
Apprentice Cartographer's Sextant
Aquamarine Flask
Arachnid Nest Map
Arachnid Tomb Map
Arc
Arcade Map
Arcane Surge Support
Arcanist Gloves
Arcanist Slippers
Archon Kite Shield
Archon Kite Shield Piece
Arctic Armour
Arctic Breath
Arena Map
Arena Plate
Arid Lake Map
Armageddon Brand
Arming Axe
Armourer's Scrap
Armoury Map
Arrogance of the Vaal
Arsenal Map
Ashen Wood Map
Ashscale Talisman
Assassin Bow
Assassin's Boots
Assassin's Favour
Assassin's Garb
Assassin's Mark
Assassin's Mitts
Astral Plate
Atoll Map
Atziri's Arsenal
Audacity
Auric Mace
Aventail Helmet
Avian Slippers
Avian Twins Talisman
Awl
Baleful Gem
Ball Lightning
Bane
Bane of the Loyal
Barbed Club
Barbute Helmet
Baroque Round Shield
Barrage
Barrows Map
Basalt Flask
Baselard
Basilica Map
Basilisk Acid
Basket Rapier
Bastard Sword
Battered Foil
Battered Helm
Battle Buckler
Battle Hammer
Battle Lamellar
Battle Plate
Battle Sword
Bazaar Map
Beach Map
Bear Trap
Beauty Through Death
Behemoth Mace
Belfry Map
Berserk
Bestel's Manuscript
Bestiary Orb
Beyond Leaguestone
Binding Shard
Birth of the Three
Bismuth Flask
Black Maw Talisman
Black Rose of Anarchy
Black Venom
Blacksmith's Whetstone
Blade Flurry
Blade Vortex
Bladed Mace
Bladefall
Bladestorm
Blasphemy Support
Blast Rain
Blessed Orb
Blessing of Chayula
Blessing of Esh
Blessing of God
Blessing of Tul
Blessing of Uul-Netol
Blessing of Xoph
Blight
Blind Support
Blind Venture
Blinder
Blink Arrow
Block Chance Reduction Support
Blood and Sand
Blood Magic Support
Blood Rage
Blood Raiment
Blood Sceptre
Bloodlines Leaguestone
Bloodlust Support
Bloodstained Fossil
Blue Pearl Amulet
Blunt Arrow Quiver
Blunt Arrow Quiver Piece
Boarding Axe
Bodyswap
Bog Map
Bone Armour
Bone Bow
Bone Circlet
Bone Crypt Map
Bone Helmet
Bone Offering
Bone Spirit Shield
Bonechill Support
Bonespire Talisman
Boon of Justice
Boon of the First Ones
Boot Blade
Boot Knife
Bottled Storm
Bound Fossil
Boundless Realms
Bowyer's Dream
Brand Recall
Branded Kite Shield
Brass Maul
Brass Spirit Shield
Breach Leaguestone
Breach Ring
Breakrib Talisman
Broad Axe
Broad Sword
Broadhead Arrow Quiver
Bronze Gauntlets
Bronze Plate
Bronze Sceptre
Bronze Tower Shield
Bronzescale Boots
Bronzescale Gauntlets
Brutality Support
Buckskin Tower Shield
Buckskin Tunic
Burial Chambers Map
Buried Treasure
Burning Arrow
Burning Blood
Burning Damage Support
Burnished Foil
Burnished Spiked Shield
Bust of Gaius Sentari
Bust of Hector Titucius
Bust of Marceus Lioneye
Butcher Axe
Butcher Knife
Butcher Sword
Cabalist Regalia
Cage Map
Caldera Map
Calendar of Fortune
Call to the First Ones
Callous Mask
Callous Mask Piece
Canyon Map
Captured Soul
Captured Soul of Arachnoxia
Captured Soul of Armala, the Widow
Captured Soul of Drek, Apex Hunter
Captured Soul of Erebix, Light's Bane
Captured Soul of Gorulis, Will-Thief
Captured Soul of Jorus, Sky's Edge
Captured Soul of Lycius, Midnight's Howl
Captured Soul of Mephod, the Earth Scorcher
Captured Soul of Nassar, Lion of the Seas
Captured Soul of Puruna, the Challenger
Captured Soul of Sebbert, Crescent's Point
Captured Soul of Shadow of the Vaal
Captured Soul of Shock and Horror
Captured Soul of Stalker of the Endless Dunes
Captured Soul of Suncaller Asha
Captured Soul of Terror of the Infinite Drifts
Captured Soul of The Forgotten Soldier
Captured Soul of Thraxia
Captured Soul of Varhesh, Shimmering Aberration
Carcass Map
Cardinal Round Shield
Carnal Armour
Carnal Boots
Carnal Mitts
Carnal Sceptre
Cartographer's Chisel
Cartographer's Delight
Cartographer's Incubator
Cartographer's Seal
Cartographer's Sextant
Carved Wand
Carving Knife
Cast On Critical Strike Support
Cast on Death Support
Cast on Melee Kill Support
Cast when Damage Taken Support
Cast when Stunned Support
Cast while Channelling
Castle Ruins Map
Cat's Paw
Caustic Arrow
Cedar Tower Shield
Celestial Armoursmith's Incubator
Celestial Blacksmith's Incubator
Celestial Jeweller's Incubator
Cells Map
Cemetery Map
Ceremonial Axe
Ceremonial Kite Shield
Ceremonial Mace
Chain Belt
Chain Boots
Chain Gloves
Chain Hauberk
Chain Support
Chainmail Doublet
Chainmail Tunic
Chainmail Vest
Champion Kite Shield
Chance to Bleed Support
Chance to Flee Support
Channel Map
Chaos Orb
Chaos Shard
Chaotic Disposition
Charan's Sword
Charged Dash
Charged Traps Support
Chateau Map
Chayula's Breachstone
Chest Splitter
Chestplate
Chiming Spirit Shield
Chitus' Plum
Chromatic Orb
Chrysalis Talisman
Citadel Bow
Citrine Amulet
City Square Map
Clarity
Clasped Boots
Clasped Mitts
Cleave
Cleaver
Close Combat Support
Close Helmet
Cloth Belt
Cloth Belt Piece
Cluster Traps Support
Clutching Talisman
Cobalt Jewel
Cogs of Disruption
Coiled Staff
Cold Penetration Support
Cold Snap
Cold to Fire Support
Colonnade Map
Colossal Hybrid Flask
Colossal Life Flask
Colossal Mana Flask
Colossal Tower Shield
Colosseum Map
Colosseum Plate
Colossus Mallet
Combustion Support
Commander's Brigandine
Composite Bow
Compound Bow
Compound Spiked Shield
Concentrated Effect Support
Conductive Quiver
Conductivity
Cone Helmet
Conjurer Boots
Conjurer Gloves
Conjurer's Vestment
Conquest Chainmail
Consecrated Path
Conservatory Map
Contagion
Controlled Destruction Support
Conversion Trap
Convocation
Copper Kris
Copper Plate
Copper Sword
Copper Tower Shield
Coral Amulet
Coral Ring
Coral Ruins Map
Core Map
Coronal Leather
Coronal Maul
Corroded Blade
Corroded Fossil
Corroded Tower Shield
Corrugated Buckler
Corsair Sword
Courtesan Sword
Courthouse Map
Courtyard Map
Coves Map
Coveted Possession
Crater Map
Cremation
Crescent Staff
Crested Tower Shield
Crimson Jewel
Crimson Raiment
Crimson Round Shield
Crimson Temple Map
Crude Bow
Crusader Boots
Crusader Buckler
Crusader Chainmail
Crusader Gloves
Crusader Helmet
Crusader Plate
Crypt Armour
Crystal Belt
Crystal Ore Map
Crystal Sceptre
Crystal Wand
Cube Of Absorption
Culling Strike Support
Cured Quiver
Curse On Hit Support
Cursed Crypt Map
Curved Blade
Cutlass
Cutthroat's Garb
Cyclone
Dagger Axe
Damage on Full Life Support
Dark Dreams
Dark Forest Map
Dark Pact
Dark Temptation
Darkwood Sceptre
Dash
Deadhand Talisman
Deadly Ailments Support
Deafening Essence
Deafening Essence of Anger
Deafening Essence of Anguish
Deafening Essence of Contempt
Deafening Essence of Doubt
Deafening Essence of Dread
Deafening Essence of Envy
Deafening Essence of Fear
Deafening Essence of Greed
Deafening Essence of Hatred
Deafening Essence of Loathing
Deafening Essence of Misery
Deafening Essence of Rage
Deafening Essence of Scorn
Deafening Essence of Sorrow
Deafening Essence of Spite
Deafening Essence of Suffering
Deafening Essence of Torment
Deafening Essence of Woe
Deafening Essence of Wrath
Deafening Essence of Zeal
Death
Death Bow
Decadent Incubator
Decanter Spiritus
Decay Support
Decimation Bow
Decorative Axe
Decoy Totem
Decurve Bow
Deep One Talisman
Deerskin Boots
Deerskin Gloves
Defiled Cathedral Map
Deicide Mask
Demigod's Wager
Demon Dagger
Demon's Horn
Dense Fossil
Desecrate
Desert Brigandine
Desert Map
Desert Spring Map
Deshret's Banner
Despair
Despot Axe
Destined to Crumble
Destiny Leather
Destroyer Regalia
Determination
Detonate Dead
Detonate Mines
Devouring Totem
Devout Chainmail
Dialla's Subjugation
Diamond Flask
Diamond Ring
Dig Map
Discharge
Discipline
Divine Ire
Divine Life Flask
Divine Mana Flask
Divine Orb
Divine Vessel
Diviner's Incubator
Doedre's Madness
Dominating Blow
Domination Leaguestone
Double Axe
Double Claw
Double Strike
Dragon Mace
Dragonbone Rapier
Dragonscale Boots
Dragonscale Doublet
Dragonscale Gauntlets
Dragoon Sword
Dread Banner
Dread Maul
Dream Mace
Driftwood Club
Driftwood Maul
Driftwood Sceptre
Driftwood Spiked Shield
Driftwood Wand
Dual Strike
Dunes Map
Dungeon Map
Dusk Blade
Dying Anguish
Eagle Claw
Earth Drinker
Earthquake
Eber's Key
Ebony Tower Shield
Echoes of Love
Eclipse Staff
Eelskin Boots
Eelskin Gloves
Eelskin Tunic
Efficacy Support
Elder Sword
Elder's Orb
Eldritch Incubator
Elegant Foil
Elegant Ringmail
Elegant Round Shield
Elegant Sword
Elemental Damage with Attacks Support
Elemental Focus Support
Elemental Hit
Elemental Proliferation Support
Elemental Weakness
Elixir of Allure
Embroidered Gloves
Emperor of Purity
Emperor's Luck
Empower Support
Enameled Buckler
Enchanted Fossil
Enchanted Incubator
Encrusted Fossil
Endurance Charge on Melee Stun Support
Enduring Cry
Energy Leech Support
Enfeeble
Engineer's Orb
Engineer's Shard
Engraved Greatsword
Engraved Hatchet
Engraved Wand
Enhance Support
Enlighten Support
Esh's Breachstone
Essence Drain
Essence Leaguestone
Essence of Anger
Essence of Anguish
Essence of Contempt
Essence of Delirium
Essence of Doubt
Essence of Dread
Essence of Envy
Essence of Fear
Essence of Greed
Essence of Hatred
Essence of Horror
Essence of Hysteria
Essence of Insanity
Essence of Loathing
Essence of Misery
Essence of Rage
Essence of Scorn
Essence of Sorrow
Essence of Spite
Essence of Suffering
Essence of Torment
Essence of Woe
Essence of Wrath
Essence of Zeal
Estoc
Estuary Map
Etched Greatsword
Etched Hatchet
Etched Kite Shield
Eternal Burgonet
Eternal Life Flask
Eternal Mana Flask
Eternal Orb
Eternal Sword
Ethereal Knives
Exalted Orb
Exalted Shard
Excavation Map
Explosive Arrow
Explosive Trap
Exquisite Blade
Exquisite Leather
Eye Gouger
Eye of Conquest
Eyes of Zeal
Ezomyte Axe
Ezomyte Blade
Ezomyte Burgonet
Ezomyte Dagger
Ezomyte Spiked Shield
Ezomyte Staff
Ezomyte Tower Shield
Faceted Fossil
Factory Map
Fancy Foil
Fangjaw Talisman
Faster Attacks Support
Faster Casting Support
Faster Projectiles Support
Faun's Horn
Fencer Helm
Festival Mask
Field Lamellar
Fields Map
Fiend Dagger
Fine Incubator
Fingerless Silk Gloves
Fir Round Shield
Fire Arrow Quiver
Fire Nova Mine
Fire Penetration Support
Fire Trap
Fireball
Firefly
Firestorm
Fishing Rod
Fishscale Gauntlets
Flame Dash
Flame Surge
Flame Totem
Flameblast
Flamethrower Trap
Flammability
Flanged Mace
Flashpowder Keg
Flaying Knife
Flesh and Stone
Flesh Offering
Fleshripper
Flicker Strike
Flooded Mine Map
Fluted Bascinet
Footman Sword
Forbidden Power
Foreboding Incubator
Forge of the Phoenix Map
Fork Support
Fortify Support
Fossilised Incubator
Fossilised Spirit Shield
Foul Staff
Fractured Fossil
Fragment of the Chimera
Fragment of the Hydra
Fragment of the Minotaur
Fragment of the Phoenix
Fragmented Incubator
Freeze Mine
Freezing Pulse
Frenzy
Fright Claw
Fright Maul
Frigid Fossil
Frontier Leather
Frost Blades
Frost Bomb
Frost Wall
Frostbite
Frostblink
Frostbolt
Full Chainmail
Full Dragonscale
Full Leather
Full Plate
Full Ringmail
Full Scale Armour
Full Wyrmscale
Fungal Hollow Map
Gardens Map
Gavel
Gemcutter's Incubator
Gemcutter's Prism
Gemcutter's Promise
Gemini Claw
Gemstone Sword
General's Brigandine
Generosity Support
Geode Map
Geomancer's Incubator
Ghastly Eye Jewel
Ghetto Map
Giant Life Flask
Giant Mana Flask
Gift of the Gemling Queen
Gilded Ambush Scarab
Gilded Axe
Gilded Bestiary Scarab
Gilded Breach Scarab
Gilded Buckler
Gilded Cartography Scarab
Gilded Divination Scarab
Gilded Elder Scarab
Gilded Fossil
Gilded Harbinger Scarab
Gilded Perandus Scarab
Gilded Reliquary Scarab
Gilded Sallet
Gilded Shaper Scarab
Gilded Sulphite Scarab
Gilded Torment Scarab
Girded Tower Shield
Glacial Cascade
Glacial Hammer
Glacier Map
Gladiator Helmet
Gladiator Plate
Gladius
Glass Shank
Glassblower's Bauble
Glimmer of Hope
Glorious Leather
Glorious Plate
Glyphic Fossil
Gnarled Branch
Goat's Horn
Goathide Boots
Goathide Buckler
Goathide Gloves
Gold Amulet
Gold Ring
Golden Bracers
Golden Buckler
Golden Caligae
Golden Flame
Golden Hand
Golden Hoop
Golden Key
Golden Kris
Golden Mantle
Golden Mask
Golden Obi
Golden Page
Golden Plate
Golden Wreath
Goliath Gauntlets
Goliath Greaves
Gouger
Grace
Graceful Sword
Grand Life Flask
Grand Mana Flask
Granite Flask
Grappler
Grave Knowledge
Graveyard Map
Great Crown
Great Helmet
Great Mallet
Great White Claw
Greater Life Flask
Greater Mana Flask
Greater Multiple Projectiles Support
Greatwolf Talisman
Greust's Necklace
Grinning Fetish
Gripped Gloves
Grotto Map
Ground Slam
Grove Bow
Gut Ripper
Gutting Knife
Haliotis Glyph
Hallowed Hybrid Flask
Hallowed Life Flask
Hallowed Mana Flask
Hammered Buckler
Harbinger Bow
Harbinger Map
Harbinger's Orb
Harbinger's Shard
Harlequin Mask
Harmonic Spirit Shield
Harmony of Souls
Harpy Rapier
Haste
Hatred
Haunted Mansion Map
Headman's Sword
Headsman Axe
Heart of the Gargoyle
Heathen Wand
Heavy Belt
Heavy Quiver
Heavy Strike
Hellion's Paw
Her Mask
Herald of Agony
Herald of Ash
Herald of Ice
Herald of Purity
Herald of Thunder
Heterochromia
Hexclaw Talisman
Highborn Bow
Highborn Staff
Highland Blade
Hinekora's Hair
Hollow Fossil
Holy Chainmail
Hook Sword
Hope
Horizon Shard
Horned Sceptre
Horned Talisman
House of Mirrors
Hubris
Hubris Circlet
Humility
Hunter Hood
Hunter's Resolve
Hunter's Reward
Hussar Brigandine
Hydrascale Boots
Hydrascale Gauntlets
Hypnotic Eye Jewel
Hypothermia Support
Ice Bite Support
Ice Crash
Ice Nova
Ice Shot
Ice Spear
Ice Trap
Iceberg Map
Ignite Proliferation Support
Imbued Wand
Immolate Support
Immortal Call
Immortal Resolve
Imp Dagger
Impale Support
Imperial Bow
Imperial Buckler
Imperial Claw
Imperial Legacy
Imperial Maul
Imperial Skean
Imperial Staff
Imperial Staff Piece
Imprinted Bestiary Orb
Incinerate
Increased Area of Effect Support
Increased Critical Damage Support
Increased Critical Strikes Support
Increased Duration Support
Infantry Brigandine
Infernal Axe
Infernal Blow
Infernal Sword
Infested Valley Map
Infused Channelling Support
Infused Incubator
Innervate Support
Intensify Support
Invasion Leaguestone
Inya's Key
Iron Circlet
Iron Gauntlets
Iron Greaves
Iron Grip Support
Iron Hat
Iron Mask
Iron Ring
Iron Sceptre
Iron Staff
Iron Will Support
Ironscale Boots
Ironscale Gauntlets
Ironwood Buckler
Item Quantity Support
Item Rarity Support
Ivory Bow
Ivory Spirit Shield
Ivory Temple Map
Jack in the Box
Jade Amulet
Jade Chopper
Jade Flask
Jade Hatchet
Jagged Foil
Jagged Fossil
Jagged Maul
Jasper Axe
Jasper Chopper
Jet Amulet
Jet Ring
Jewelled Foil
Jeweller's Orb
Jingling Spirit Shield
Journeyman Cartographer's Seal
Journeyman Cartographer's Sextant
Judgement Staff
Jungle Valley Map
Karui Axe
Karui Chopper
Karui Maul
Karui Sceptre
Kinetic Blast
Kishara's Star
Knockback Support
Kraityn's Amulet
Laboratory Map
Labrys
Lacerate
Lacewood Spirit Shield
Lacquered Buckler
Lacquered Garb
Lacquered Helmet
Lair Map
Lair of the Hydra Map
Laminated Kite Shield
Lancing Steel
Lantador's Lost Love
Lapis Amulet
Large Hybrid Flask
Large Life Flask
Large Mana Flask
Last Hope
Lathi
Latticed Ringmail
Lava Chambers Map
Lava Lake Map
Layered Kite Shield
Lead Sceptre
Leap Slam
Leather Belt
Leather Cap
Leather Hood
Leatherscale Boots
Left to Fate
Legion Boots
Legion Gloves
Legion Hammer
Legion Sword
Legion Sword Piece
Less Duration Support
Lesser Multiple Projectiles Support
Lesser Poison Support
Leyline Map
Life Gain on Hit Support
Life Leech Support
Light and Truth
Light Brigandine
Light Quiver
Lighthouse Map
Lightning Arrow
Lightning Penetration Support
Lightning Spire Trap
Lightning Strike
Lightning Tendrils
Lightning Trap
Lightning Warp
Linden Kite Shield
Lingering Remnants
Lion Pelt
Lion Sword
Lithe Blade
Lone Antler Talisman
Long Bow
Long Staff
Longsword
Longtooth Talisman
Lookout Map
Lordly Plate
Loricated Ringmail
Lost Worlds
Loyalty
Lucent Fossil
Lucky Connections
Lucky Deck
Lunaris Circlet
Lysah's Respite
Maelström Staff
Mage's Vestment
Magistrate Crown
Magma Orb
Mahogany Tower Shield
Maim Support
Majestic Plate
Malachai's Entrails
Malachai's Heart
Malachai's Lungs
Malevolence
Malformation Map
Maligaro's Map
Maligaro's Spike
Mallet
Mana Leech Support
Mandible Talisman
Maple Round Shield
Maraketh Bow
Marble Amulet
Marshes Map
Master Cartographer's Seal
Master Cartographer's Sextant
Mausoleum Map
Mawr Blaidd
Maze Map
Maze of the Minotaur Map
Meatgrinder
Medicine Chest
Medium Hybrid Flask
Medium Life Flask
Medium Mana Flask
Melee Physical Damage Support
Melee Splash Support
Memory Fragment
Memory Fragment I
Memory Fragment II
Memory Fragment III
Memory Fragment IV
Memory Fragment IX
Memory Fragment V
Memory Fragment VI
Memory Fragment VII
Memory Fragment VIII
Memory Fragment X
Merciless Armament
Mesa Map
Mesh Boots
Mesh Gloves
Metallic Fossil
Miasmeter
Midnight Blade
Might is Right
Military Staff
Mind Cage
Minefield Support
Mineral Pools Map
Minion and Totem Elemental Resistance Support
Minion Damage Support
Minion Life Support
Minion Speed Support
Mirage Archer Support
Mirror Arrow
Mirror of Kalandra
Mirror Shard
Mirrored Spiked Shield
Mitts
Molten Shell
Molten Strike
Monkey Paw Talisman
Monkey Twins Talisman
Monochrome
Moon Orb
Moon Staff
Moon Temple Map
Moonstone Ring
Morning Star
Mortal Grief
Mortal Hope
Mortal Ignorance
Mortal Rage
Mosaic Kite Shield
Mud Geyser Map
Multiple Totems Support
Multiple Traps Support
Multistrike Support
Murder Boots
Murder Mitts
Murderous Eye Jewel
Museum Map
Muttering Essence
Muttering Essence of Anger
Muttering Essence of Contempt
Muttering Essence of Fear
Muttering Essence of Greed
Muttering Essence of Hatred
Muttering Essence of Sorrow
Muttering Essence of Torment
Muttering Essence of Woe
Mysterious Incubator
Nailed Fist
Necromancer Circlet
Necromancer Silks
Necromancy Net
Necropolis Map
Nemesis Leaguestone
Nightmare Bascinet
Nightmare Mace
No Traces
Noble Axe
Noble Claw
Noble Tricorne
Nubuck Boots
Nubuck Gloves
Oak Buckler
Oak's Amulet
Obscured Incubator
Obsidian Key
Occultist's Vestment
Ochre Sceptre
Offering to the Goddess
Oiled Coat
Oiled Vest
Omen Wand
Onslaught Leaguestone
Onslaught Support
Onyx Amulet
Opal Ring
Opal Sceptre
Opal Wand
Orb of Alchemy
Orb of Alteration
Orb of Annulment
Orb of Augmentation
Orb of Binding
Orb of Chance
Orb of Elemental Dispersion
Orb of Fusing
Orb of Horizons
Orb of Regret
Orb of Scouring
Orb of Storms
Orb of Transmutation
Orchard Map
Ornate Incubator
Ornate Mace
Ornate Ringmail
Ornate Spiked Shield
Ornate Sword
Otherworldly Incubator
Overgrown Ruin Map
Overgrown Shrine Map
Padded Jacket
Padded Vest
Pagan Wand
Painted Buckler
Painted Tower Shield
Palace Map
Park Map
Paua Amulet
Paua Ring
Pecoraro
Pen Map
Penetrating Arrow Quiver
Peninsula Map
Perandus Coin
Perandus Leaguestone
Perfect Fossil
Perfection
Perforate
Pernarch
Petrified Club
Phantasmagoria Map
Phantom Mace
Phase Run
Physical to Lightning Support
Pier Map
Pierce Support
Pig-Faced Bascinet
Piledriver
Pine Buckler
Pinnacle Tower Shield
Pit Map
Pit of the Chimera Map
Plague Mask
Plank Kite Shield
Plate Vest
Plateau Map
Plated Gauntlets
Plated Greaves
Plated Maul
Platinum Kris
Platinum Sceptre
Plaza Map
Poacher's Mark
Poignard
Point Blank Support
Poison Support
Poleaxe
Polished Ambush Scarab
Polished Bestiary Scarab
Polished Breach Scarab
Polished Cartography Scarab
Polished Divination Scarab
Polished Elder Scarab
Polished Harbinger Scarab
Polished Perandus Scarab
Polished Reliquary Scarab
Polished Shaper Scarab
Polished Spiked Shield
Polished Sulphite Scarab
Polished Torment Scarab
Port Map
Portal
Portal Scroll
Portal Shredder
Potent Alchemical Resonator
Potent Chaotic Resonator
Power Charge On Critical Support
Power Siphon
Powerful Alchemical Resonator
Powerful Chaotic Resonator
Praetor Crown
Precinct Map
Precision
Prehistoric Claw
Pride
Pride Before the Fall
Pride of the First Ones
Primal Incubator
Primal Skull Talisman
Prime Alchemical Resonator
Prime Chaotic Resonator
Primeval Rapier
Primitive Alchemical Resonator
Primitive Chaotic Resonator
Primitive Staff
Primordial Blocks Map
Primordial Pool Map
Primordial Staff
Prismatic Fossil
Prismatic Jewel
Prismatic Ring
Pristine Fossil
Profane Wand
Projectile Weakness
Promenade Map
Prong Dagger
Prophecy
Prophecy Leaguestone
Prophecy Wand
Prophet Crown
Prosperity
Pulverise Support
Puncture
Punishment
Purifying Flame
Purity of Elements
Purity of Fire
Purity of Ice
Purity of Lightning
Quarterstaff
Quartz Flask
Quartz Sceptre
Quartz Wand
Quicksilver Flask
Quilted Jacket
Racecourse Map
Rage Support
Rain of Arrows
Rain of Chaos
Rain Tempter
Raise Spectre
Raise Zombie
Rallying Cry
Rampage Leaguestone
Ramparts Map
Ranged Attack Totem Support
Ranger Bow
Rats
Raven Mask
Rawhide Boots
Rawhide Gloves
Rawhide Tower Shield
Reave
Reaver Axe
Reaver Helmet
Reaver Sword
Rebirth
Reckoning
Recurve Bow
Reduced Mana Support
Redwood Spiked Shield
Reef Map
Reflex Bow
Regal Orb
Regal Shard
Regicide Mask
Reinforced Greaves
Reinforced Iron Net
Reinforced Kite Shield
Reinforced Rope Net
Reinforced Steel Net
Reinforced Tower Shield
Rejuvenation Totem
Relic Chambers Map
Remnant of Corruption
Remote Mine Support
Residence Map
Ribbon Spool
Righteous Fire
Ringmail Boots
Ringmail Coat
Ringmail Gloves
Riposte
Ritual Sceptre
Riveted Boots
Riveted Gloves
Rock Breaker
Rod of Detonation
Roseus Glyph
Rot Head Talisman
Rotfeather Talisman
Rotted Round Shield
Royal Axe
Royal Bow
Royal Burgonet
Royal Sceptre
Royal Skean
Royal Staff
Ruby Amulet
Ruby Flask
Ruby Ring
Rugged Quiver
Runic Hatchet
Rusted Ambush Scarab
Rusted Bestiary Scarab
Rusted Breach Scarab
Rusted Cartography Scarab
Rusted Coif
Rusted Divination Scarab
Rusted Elder Scarab
Rusted Harbinger Scarab
Rusted Hatchet
Rusted Perandus Scarab
Rusted Reliquary Scarab
Rusted Shaper Scarab
Rusted Spike
Rusted Sulphite Scarab
Rusted Sword
Rusted Torment Scarab
Rustic Sash
Ruthless Support
Sabre
Sacred Hybrid Flask
Sacred Life Flask
Sacred Mana Flask
Sacrifice at Dawn
Sacrifice at Dusk
Sacrifice at Midnight
Sacrifice at Noon
Sacrificial Garb
Sadist Garb
Sage Wand
Sage's Robe
Sai
Saint's Hauberk
Saintly Chainmail
Sallet
Sambar Sceptre
Sambodhi's Vow
Samite Gloves
Samite Helmet
Samite Slippers
Sanctified Fossil
Sanctified Life Flask
Sanctified Mana Flask
Sand of Eternity
Sapphire Flask
Sapphire Ring
Satin Gloves
Satin Slippers
Savant's Robe
Scale Doublet
Scale Vest
Scare Mask
Scarlet Raiment
Scarlet Round Shield
Scholar Boots
Scholar of the Seas
Scholar's Robe
Scorched Fossil
Scorching Ray
Scourge Arrow
Screaming Essence
Screaming Essence of Anger
Screaming Essence of Anguish
Screaming Essence of Contempt
Screaming Essence of Doubt
Screaming Essence of Dread
Screaming Essence of Envy
Screaming Essence of Fear
Screaming Essence of Greed
Screaming Essence of Hatred
Screaming Essence of Loathing
Screaming Essence of Misery
Screaming Essence of Rage
Screaming Essence of Scorn
Screaming Essence of Sorrow
Screaming Essence of Spite
Screaming Essence of Suffering
Screaming Essence of Torment
Screaming Essence of Woe
Screaming Essence of Wrath
Screaming Essence of Zeal
Scriptorium Map
Scroll Fragment
Scroll of Wisdom
Searching Eye Jewel
Searing Bond
Secutor Helm
Seismic Trap
Sekhem
Sekhema Feather
Sentinel Jacket
Sepulchre Map
Serpent Wand
Serpentine Staff
Serpentscale Boots
Serpentscale Gauntlets
Serrated Arrow Quiver
Serrated Foil
Serrated Fossil
Seven Years Bad Luck
Shabby Jerkin
Shackled Boots
Shadow Axe
Shadow Sceptre
Shagreen Boots
Shagreen Gloves
Shagreen Tower Shield
Shaper's Orb
Shaper's Orb (Tier 1)
Shaper's Orb (Tier 10)
Shaper's Orb (Tier 2)
Shaper's Orb (Tier 3)
Shaper's Orb (Tier 4)
Shaper's Orb (Tier 5)
Shaper's Orb (Tier 6)
Shaper's Orb (Tier 7)
Shaper's Orb (Tier 8)
Shaper's Orb (Tier 9)
Shard of Fate
Sharkskin Boots
Sharkskin Gloves
Sharkskin Tunic
Sharktooth Arrow Quiver
Sharktooth Claw
Shattering Steel
Shield Charge
Shipyard Map
Shock Nova
Shockwave Support
Shockwave Totem
Shore Map
Short Bow
Shrapnel Shot
Shrieking Essence
Shrieking Essence of Anger
Shrieking Essence of Anguish
Shrieking Essence of Contempt
Shrieking Essence of Doubt
Shrieking Essence of Dread
Shrieking Essence of Envy
Shrieking Essence of Fear
Shrieking Essence of Greed
Shrieking Essence of Hatred
Shrieking Essence of Loathing
Shrieking Essence of Misery
Shrieking Essence of Rage
Shrieking Essence of Scorn
Shrieking Essence of Sorrow
Shrieking Essence of Spite
Shrieking Essence of Suffering
Shrieking Essence of Torment
Shrieking Essence of Woe
Shrieking Essence of Wrath
Shrieking Essence of Zeal
Shrine Map
Shuddering Fossil
Siege Axe
Siege Ballista
Siege Helmet
Siege Map
Sign of Purity
Silk Gloves
Silk Robe
Silk Slippers
Silken Garb
Silken Hood
Silken Vest
Silken Wrap
Silver Coin
Silver Flask
Silver Key
Silver Locket
Simple Iron Net
Simple Robe
Simple Rope Net
Simple Steel Net
Singular Incubator
Sinner Tricorne
Siphoning Trap
Skean
Skinning Knife
Skittering Incubator
Slaughter Knife
Sledgehammer
Sleek Coat
Slink Boots
Slink Gloves
Slower Projectiles Support
Small Hybrid Flask
Small Life Flask
Small Mana Flask
Smallsword
Smite
Smoke Mine
Sniper Bow
Solar Maul
Solaris Circlet
Soldier Boots
Soldier Gloves
Soldier Helmet
Soldier's Brigandine
Sorcerer Boots
Sorcerer Gloves
Soulrend
Sovereign Spiked Shield
Spark
Sparkling Claw
Spectral Axe
Spectral Shield Throw
Spectral Sword
Spectral Throw
Spell Cascade Support
Spell Echo Support
Spell Totem Support
Spider Forest Map
Spider Lair Map
Spidersilk Robe
Spike-Point Arrow Quiver
Spiked Bundle
Spiked Club
Spiked Gloves
Spiked Round Shield
Spine Bow
Spinefuse Talisman
Spiny Maul
Spiny Round Shield
Spiraled Foil
Spiraled Wand
Spirit Offering
Splendid Round Shield
Splinter
Splinter of Chayula
Splinter of Esh
Splinter of Tul
Splinter of Uul-Netol
Splinter of Xoph
Splintered Tower Shield
Split Arrow
Splitnewt Talisman
Stacked Deck
Stag Sceptre
Static Strike
Stealth Boots
Stealth Gloves
Steel Circlet
Steel Gauntlets
Steel Greaves
Steel Kite Shield
Steel Ring
Steelhead
Steelscale Boots
Steelscale Gauntlets
Steelskin
Steelwood Bow
Stibnite Flask
Stiletto
Stone Axe
Stone Hammer
Stone of Passage
Storm Barrier Support
Storm Blade
Storm Brand
Storm Burst
Storm Call
Strand Map
Strapped Boots
Strapped Leather
Strapped Mitts
Strong Iron Net
Strong Rope Net
Strong Steel Net
Struck by Lightning
Studded Belt
Studded Round Shield
Stun Support
Stygian Vise
Sulphur Flask
Sulphur Vents Map
Summit Map
Summon Chaos Golem
Summon Flame Golem
Summon Holy Relic
Summon Ice Golem
Summon Lightning Golem
Summon Phantasm on Kill Support
Summon Raging Spirit
Summon Skeleton
Summon Stone Golem
Sun Leather
Sun Orb
Sun Plate
Sunder
Sundering Axe
Sunken City Map
Supreme Spiked Shield
Sweep
Swift Affliction Support
Talisman Leaguestone
Talon Axe
Tangled Fossil
Tarnished Spirit Shield
Teak Round Shield
Tectonic Slam
Tempered Foil
Tempest Leaguestone
Tempest Shield
Temple Map
Temporal Chains
Tenderizer
Terrace Map
Terror Claw
Terror Maul
Thaumaturge's Incubator
Thaumaturgical Net
Thaumetic Emblem
Thaumetic Sulphite
The Admirer
The Aesthete
The Archmage's Right Hand
The Arena Champion
The Army of Blood
The Artist
The Avenger
The Battle Born
The Beast
The Betrayal
The Black Flag
The Blazing Fire
The Body
The Breach
The Brittle Emperor
The Cacophony
The Calling
The Carrion Crow
The Cartographer
The Cataclysm
The Catalyst
The Celestial Justicar
The Celestial Stone
The Chains that Bind
The Coming Storm
The Conduit
The Cursed King
The Dapper Prodigy
The Dark Mage
The Darkest Dream
The Deceiver
The Deep Ones
The Demoness
The Devastator
The Doctor
The Doppelganger
The Dragon
The Dragon's Heart
The Dreamer
The Dreamland
The Drunken Aristocrat
The Encroaching Darkness
The Endless Darkness
The Endurance
The Enlightened
The Ethereal
The Explorer
The Eye of Desire
The Eye of Fury
The Eye of the Dragon
The Fathomless Depths
The Feast
The Fiend
The Fletcher
The Flora's Gift
The Fool
The Formless Sea
The Forsaken
The Fox
The Gambler
The Garish Power
The Gemcutter
The Gentleman
The Gladiator
The Golden Era
The Hale Heart
The Harvester
The Hermit
The Hoarder
The Hunger
The Immortal
The Incantation
The Innocent
The Inoculated
The Insatiable
The Inventor
The Iron Bard
The Jester
The Jeweller's Boon
The Journey
The King's Blade
The King's Heart
The Landing
The Last One Standing
The Lich
The Life Thief
The Lion
The Lord in Black
The Lord of Celebration
The Lover
The Lunaris Priestess
The Mad King
The Master
The Master Artisan
The Mayor
The Mercenary
The Messenger
The Metalsmith's Gift
The Nurse
The Oath
The Obscured
The Offering
The One With All
The Opulent
The Pack Leader
The Pact
The Penitent
The Poet
The Polymath
The Porcupine
The Price of Protection
The Primordial
The Professor
The Puzzle
The Queen
The Rabid Rhoa
The Realm
The Risk
The Rite of Elements
The Road to Power
The Ruthless Ceinture
The Sacrifice
The Saint's Treasure
The Samurai's Eye
The Scarred Meadow
The Scavenger
The Scholar
The Seeker
The Sephirot
The Shaper's Key
The Shaper's Realm
The Sigil
The Siren
The Soul
The Spark and the Flame
The Spoiled Prince
The Staff of Purity
The Standoff
The Stormcaller
The Summoner
The Sun
The Surgeon
The Surveyor
The Survivalist
The Sword King's Salute
The Teardrop
The Thaumaturgist
The Throne
The Tower
The Traitor
The Trial
The Twilight Moon
The Twins
The Tyrant
The Undaunted
The Undisputed
The Union
The Valkyrie
The Valley of Steel Boxes
The Vast
The Visionary
The Void
The Warden
The Warlord
The Watcher
The Web
The Wilted Rose
The Wind
The Witch
The Wolf
The Wolf's Shadow
The Wolven King's Bite
The Wolverine
The World Eater
The Wrath
The Wretched
Thicket Bow
Thicket Map
Thief's Garb
Thirst for Knowledge
Thorium Spirit Shield
Thorn Rapier
Three Faces in the Dark
Three Hands Talisman
Three Rat Talisman
Three Voices
Thresher Claw
Throat Stabber
Thunderous Skies
Tiger Hook
Tiger Sword
Tiger's Paw
Timber Axe
Time-Lost Incubator
Time-Lost Relic
Timeless Eternal Empire Emblem
Timeless Eternal Empire Splinter
Timeless Karui Emblem
Timeless Karui Splinter
Timeless Maraketh Emblem
Timeless Maraketh Splinter
Timeless Templar Emblem
Timeless Templar Splinter
Timeless Vaal Emblem
Timeless Vaal Splinter
Timeworn Claw
Timeworn Reliquary Key
Titan Gauntlets
Titan Greaves
Titanium Spirit Shield
Tolman's Bracelet
Tomahawk
Topaz Flask
Topaz Ring
Torment Leaguestone
Tornado Shot
Tornado Wand
Torture Cage
Totemic Maul
Tower Key
Tower Map
Toxic Rain
Toxic Sewer Map
Tranquillity
Transmutation Shard
Trap and Mine Damage Support
Trap Support
Trapper Boots
Trapper Mitts
Trarthan Powder
Treasure Hunter
Treasure Key
Tribal Circlet
Tribal Club
Tribal Maul
Tricorne
Trisula
Triumphant Lamellar
Tropical Island Map
Tukohama's Tooth
Tul's Breachstone
Turn the Other Cheek
Turquoise Amulet
Twig Spirit Shield
Twilight Blade
Twin Claw
Two-Handed Sword
Two-Point Arrow Quiver
Two-Stone Ring
Two-Toned Boots
Tyrant's Sekhem
Unbound Ailments Support
Underground River Map
Underground Sea Map
Undying Flesh Talisman
Unearth
Unleash Support
Unset Ring
Unshaping Orb
Ursine Pelt
Uul-Netol's Breachstone
Vaal Ancestral Warchief
Vaal Arc
Vaal Axe
Vaal Blade
Vaal Blade Vortex
Vaal Blight
Vaal Breach
Vaal Buckler
Vaal Burning Arrow
Vaal Clarity
Vaal Claw
Vaal Cold Snap
Vaal Cyclone
Vaal Detonate Dead
Vaal Discipline
Vaal Double Strike
Vaal Earthquake
Vaal Fireball
Vaal Flameblast
Vaal Gauntlets
Vaal Glacial Hammer
Vaal Grace
Vaal Greatsword
Vaal Greaves
Vaal Ground Slam
Vaal Haste
Vaal Hatchet
Vaal Ice Nova
Vaal Immortal Call
Vaal Impurity of Fire
Vaal Impurity of Ice
Vaal Impurity of Lightning
Vaal Lightning Strike
Vaal Lightning Trap
Vaal Lightning Warp
Vaal Mask
Vaal Molten Shell
Vaal Orb
Vaal Power Siphon
Vaal Pyramid Map
Vaal Rain of Arrows
Vaal Rapier
Vaal Reave
Vaal Regalia
Vaal Righteous Fire
Vaal Sceptre
Vaal Spark
Vaal Spectral Throw
Vaal Spirit Shield
Vaal Storm Call
Vaal Summon Skeletons
Vaal Temple Map
Valako's Jaw
Vanguard Belt
Vanity
Variscite Blade
Varnished Coat
Vault Map
Velvet Gloves
Velvet Slippers
Vengeance
Vial of Awakening
Vial of Consequence
Vial of Dominance
Vial of Fate
Vial Of Power
Vial of Sacrifice
Vial of Summoning
Vial of the Ghost
Vial of the Ritual
Vial of Transcendence
Vicious Projectiles Support
Vigilant Strike
Vile Staff
Vile Toxins Support
Villa Map
Vine Circlet
Vinia's Token
Viper Strike
Viridian Jewel
Visored Sallet
Vitality
Void Axe
Void Manipulation Support
Void Sceptre
Volatile Dead
Volatile Power
Volcano Map
Volkuur's Key
Volley Support
Vortex
Vulnerability
Wailing Essence
Wailing Essence of Anger
Wailing Essence of Anguish
Wailing Essence of Contempt
Wailing Essence of Doubt
Wailing Essence of Fear
Wailing Essence of Greed
Wailing Essence of Hatred
Wailing Essence of Loathing
Wailing Essence of Rage
Wailing Essence of Sorrow
Wailing Essence of Spite
Wailing Essence of Suffering
Wailing Essence of Torment
Wailing Essence of Woe
Wailing Essence of Wrath
Wailing Essence of Zeal
Walnut Spirit Shield
War Axe
War Banner
War Buckler
War Hammer
War Plate
War Sword
Warbands Leaguestone
Warlord's Mark
Waste Pool Map
Wasteland Map
Waterways Map
Wave of Conviction
Waxed Garb
Wealth and Power
Weeping Essence
Weeping Essence of Anger
Weeping Essence of Contempt
Weeping Essence of Doubt
Weeping Essence of Fear
Weeping Essence of Greed
Weeping Essence of Hatred
Weeping Essence of Rage
Weeping Essence of Sorrow
Weeping Essence of Suffering
Weeping Essence of Torment
Weeping Essence of Woe
Weeping Essence of Wrath
Wereclaw Talisman
Whalebone Rapier
Wharf Map
Whirling Blades
Whispering Essence
Whispering Essence of Contempt
Whispering Essence of Greed
Whispering Essence of Hatred
Whispering Essence of Woe
Whispering Incubator
Widowsilk Robe
Wild Leather
Wild Strike
Wings of Vastiri
Winter Orb
Wither
Withering Touch Support
Wolf Pelt
Woodful Staff
Woodsplitter
Wool Gloves
Wool Shoes
Wraith Axe
Wraith Sword
Wrapped Boots
Wrapped Mitts
Wrath
Wrist Chopper
Writhing Talisman
Wyrm Mace
Wyrmbone Rapier
Wyrmscale Boots
Wyrmscale Doublet
Wyrmscale Gauntlets
Xoph's Breachstone
Yew Spirit Shield
Yriel's Key
Zealot Boots
Zealot Gloves
Zealot Helmet
Zealotry
Zodiac Leather

     * */






/*
Abyss Jewel
Active Skill Gems
Amulets
Axes
Belts
Body Armours
Boots
Bows
Claws
Currency
Daggers
Delve Socketable Currency
Divination Card
Fishing Rods
Flasks
Gems
Gloves
Helmets
Hybrid Flasks
Incubator
Incursion Item
Jewel
Labyrinth Item
Labyrinth Map Item
Labyrinth Trinket
Large Relics
Leaguestones
Life Flasks
Maces
Mana Flasks
Map Fragments
Maps
Medium Relics
Misc Map Items
One Hand Axes
One Hand Maces
One Hand Swords
Pantheon Soul
Piece
Quest Items
Quivers
Relics
Rings
Sceptres
Shields
Small Relics
Stackable Currency
Staves
Support Skill Gems
Swords
Thrusting One Hand Swords
Two Hand Axes
Two Hand Maces
Two Hand Swords
Utility Flasks
Wands

* */