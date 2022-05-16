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
