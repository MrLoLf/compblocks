package net.mrlolf.compressedblocks.block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mrlolf.compressedblocks.CompressedBlocks;


public class compressedblocks{

	public static final Block COMPRESSED_COBBLESTONE = registerBlock("compressed_cobblestone_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COBBLESTONE2 = registerBlock("compressed_cobblestone_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COBBLESTONE3 = registerBlock("compressed_cobblestone_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(6,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COBBLESTONE4 = registerBlock("compressed_cobblestone_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(8,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COBBLESTONE5 = registerBlock("compressed_cobblestone_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(10,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COBBLESTONE6 = registerBlock("compressed_cobblestone_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(12,100000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COBBLESTONE7 = registerBlock("compressed_cobblestone_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(16,18000000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COBBLESTONE8 = registerBlock("compressed_cobblestone_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(20,18000000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIRT = registerBlock("compressed_dirt_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIRT2 = registerBlock("compressed_dirt_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIRT3 = registerBlock("compressed_dirt_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIRT4 = registerBlock("compressed_dirt_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIRT5 = registerBlock("compressed_dirt_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIRT6 = registerBlock("compressed_dirt_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIRT7 = registerBlock("compressed_dirt_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIRT8 = registerBlock("compressed_dirt_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,100000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GRAVEL = registerBlock("compressed_gravel_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GRAVEL2 = registerBlock("compressed_gravel_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GRAVEL3 = registerBlock("compressed_gravel_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(6,150).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GRAVEL4 = registerBlock("compressed_gravel_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(8,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GRAVEL5 = registerBlock("compressed_gravel_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(10,500).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GRAVEL6 = registerBlock("compressed_gravel_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(12,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GRAVEL7 = registerBlock("compressed_gravel_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(16,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GRAVEL8 = registerBlock("compressed_gravel_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(20,100000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SAND = registerBlock("compressed_sand_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SAND2 = registerBlock("compressed_sand_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SAND3 = registerBlock("compressed_sand_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SAND4 = registerBlock("compressed_sand_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SAND5 = registerBlock("compressed_sand_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SAND6 = registerBlock("compressed_sand_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SAND7 = registerBlock("compressed_sand_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SAND8 = registerBlock("compressed_sand_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,100000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_NETHERRACK = registerBlock("compressed_netherrack_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_NETHERRACK2 = registerBlock("compressed_netherrack_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_NETHERRACK3 = registerBlock("compressed_netherrack_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_NETHERRACK4 = registerBlock("compressed_netherrack_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_NETHERRACK5 = registerBlock("compressed_netherrack_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_NETHERRACK6 = registerBlock("compressed_netherrack_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_NETHERRACK7 = registerBlock("compressed_netherrack_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_NETHERRACK8 = registerBlock("compressed_netherrack_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,50000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_CLAY = registerBlock("compressed_clay_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_CLAY2 = registerBlock("compressed_clay_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_CLAY3 = registerBlock("compressed_clay_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_CLAY4 = registerBlock("compressed_clay_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_CLAY5 = registerBlock("compressed_clay_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_CLAY6 = registerBlock("compressed_clay_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_CLAY7 = registerBlock("compressed_clay_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_CLAY8 = registerBlock("compressed_clay_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,100000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SLIME = registerBlock("compressed_slime_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SLIME2 = registerBlock("compressed_slime_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SLIME3 = registerBlock("compressed_slime_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SLIME4 = registerBlock("compressed_slime_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SLIME5 = registerBlock("compressed_slime_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SLIME6 = registerBlock("compressed_slime_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SLIME7 = registerBlock("compressed_slime_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SLIME8 = registerBlock("compressed_slime_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,100000).requiresTool()), ItemGroup.MATERIALS);
	//Ores
	public static final Block COMPRESSED_AMETHYST = registerBlock("compressed_amethyst_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_AMETHYST2 = registerBlock("compressed_amethyst_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_AMETHYST3 = registerBlock("compressed_amethyst_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_AMETHYST4 = registerBlock("compressed_amethyst_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_AMETHYST5 = registerBlock("compressed_amethyst_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_AMETHYST6 = registerBlock("compressed_amethyst_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_AMETHYST7 = registerBlock("compressed_amethyst_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_AMETHYST8 = registerBlock("compressed_amethyst_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,50000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COAL = registerBlock("compressed_coal_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COAL2 = registerBlock("compressed_coal_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COAL3 = registerBlock("compressed_coal_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COAL4 = registerBlock("compressed_coal_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COAL5 = registerBlock("compressed_coal_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COAL6 = registerBlock("compressed_coal_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COAL7 = registerBlock("compressed_coal_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COAL8 = registerBlock("compressed_coal_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,50000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COPPER = registerBlock("compressed_copper_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COPPER2 = registerBlock("compressed_copper_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COPPER3 = registerBlock("compressed_copper_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COPPER4 = registerBlock("compressed_copper_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COPPER5 = registerBlock("compressed_copper_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COPPER6 = registerBlock("compressed_copper_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COPPER7 = registerBlock("compressed_copper_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_COPPER8 = registerBlock("compressed_copper_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,50000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIAMOND = registerBlock("compressed_diamond_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIAMOND2 = registerBlock("compressed_diamond_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIAMOND3 = registerBlock("compressed_diamond_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIAMOND4 = registerBlock("compressed_diamond_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIAMOND5 = registerBlock("compressed_diamond_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIAMOND6 = registerBlock("compressed_diamond_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIAMOND7 = registerBlock("compressed_diamond_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DIAMOND8 = registerBlock("compressed_diamond_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,50000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_EMERALD = registerBlock("compressed_emerald_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_EMERALD2 = registerBlock("compressed_emerald_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_EMERALD3 = registerBlock("compressed_emerald_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_EMERALD4 = registerBlock("compressed_emerald_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_EMERALD5 = registerBlock("compressed_emerald_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_EMERALD6 = registerBlock("compressed_emerald_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_EMERALD7 = registerBlock("compressed_emerald_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_EMERALD8 = registerBlock("compressed_emerald_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,50000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GOLD = registerBlock("compressed_gold_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GOLD2 = registerBlock("compressed_gold_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GOLD3 = registerBlock("compressed_gold_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GOLD4 = registerBlock("compressed_gold_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GOLD5 = registerBlock("compressed_gold_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GOLD6 = registerBlock("compressed_gold_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GOLD7 = registerBlock("compressed_gold_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_GOLD8 = registerBlock("compressed_gold_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,50000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_IRON = registerBlock("compressed_iron_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_IRON2 = registerBlock("compressed_iron_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_IRON3 = registerBlock("compressed_iron_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_IRON4 = registerBlock("compressed_iron_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_IRON5 = registerBlock("compressed_iron_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_IRON6 = registerBlock("compressed_iron_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_IRON7 = registerBlock("compressed_iron_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_IRON8 = registerBlock("compressed_iron_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,50000).requiresTool()), ItemGroup.MATERIALS);
	// Wood
	public static final Block COMPRESSED_ACACIA = registerBlock("compressed_acacia_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_ACACIA2 = registerBlock("compressed_acacia_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_ACACIA3 = registerBlock("compressed_acacia_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_ACACIA4 = registerBlock("compressed_acacia_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_ACACIA5 = registerBlock("compressed_acacia_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_ACACIA6 = registerBlock("compressed_acacia_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_ACACIA7 = registerBlock("compressed_acacia_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_ACACIA8 = registerBlock("compressed_acacia_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,100000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_BIRCH = registerBlock("compressed_birch_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_BIRCH2 = registerBlock("compressed_birch_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_BIRCH3 = registerBlock("compressed_birch_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_BIRCH4 = registerBlock("compressed_birch_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_BIRCH5 = registerBlock("compressed_birch_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_BIRCH6 = registerBlock("compressed_birch_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_BIRCH7 = registerBlock("compressed_birch_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_BIRCH8 = registerBlock("compressed_birch_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,100000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DARK_OAK = registerBlock("compressed_dark_oak_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DARK_OAK2 = registerBlock("compressed_dark_oak_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DARK_OAK3 = registerBlock("compressed_dark_oak_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DARK_OAK4 = registerBlock("compressed_dark_oak_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DARK_OAK5 = registerBlock("compressed_dark_oak_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DARK_OAK6 = registerBlock("compressed_dark_oak_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DARK_OAK7 = registerBlock("compressed_dark_oak_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_DARK_OAK8 = registerBlock("compressed_dark_oak_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,100000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_JUNGLE = registerBlock("compressed_jungle_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_JUNGLE2 = registerBlock("compressed_jungle_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_JUNGLE3 = registerBlock("compressed_jungle_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_JUNGLE4 = registerBlock("compressed_jungle_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_JUNGLE5 = registerBlock("compressed_jungle_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_JUNGLE6 = registerBlock("compressed_jungle_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_JUNGLE7 = registerBlock("compressed_jungle_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_JUNGLE8 = registerBlock("compressed_jungle_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,100000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_OAK = registerBlock("compressed_oak_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_OAK2 = registerBlock("compressed_oak_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_OAK3 = registerBlock("compressed_oak_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_OAK4 = registerBlock("compressed_oak_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_OAK5 = registerBlock("compressed_oak_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_OAK6 = registerBlock("compressed_oak_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_OAK7 = registerBlock("compressed_oak_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_OAK8 = registerBlock("compressed_oak_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,100000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SPRUCE = registerBlock("compressed_spruce_x1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,40).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SPRUCE2 = registerBlock("compressed_spruce_x2",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,100).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SPRUCE3 = registerBlock("compressed_spruce_x3",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,200).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SPRUCE4 = registerBlock("compressed_spruce_x4",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2,1000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SPRUCE5 = registerBlock("compressed_spruce_x5",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,2000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SPRUCE6 = registerBlock("compressed_spruce_x6",
			new Block(FabricBlockSettings.of(Material.STONE).strength(3,5000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SPRUCE7 = registerBlock("compressed_spruce_x7",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,10000).requiresTool()), ItemGroup.MATERIALS);
	public static final Block COMPRESSED_SPRUCE8 = registerBlock("compressed_spruce_x8",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4,100000).requiresTool()), ItemGroup.MATERIALS);

		private static Block registerBlock(String name, Block block, ItemGroup group){
			registerBlockItem(name, block, group);
			return Registry.register(Registry.BLOCK, new Identifier(CompressedBlocks.MOD_ID, name), block);
		}

		private static Item registerBlockItem(String name, Block block, ItemGroup group){
			return Registry.register(Registry.ITEM, new Identifier(CompressedBlocks.MOD_ID, name),
					new BlockItem(block, new FabricItemSettings().group(group)));
		}

		public static void registerBlocks(){
			CompressedBlocks.LOGGER.info("Registering Blocks for "+ CompressedBlocks.MOD_ID);
		}
}
