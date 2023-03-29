package net.mrlolf.compressedblocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.mrlolf.compressedblocks.CompressedBlocks;


public class compressedblocks {
    //
    // Blocks
    //
    public static final Block COMPRESSED_COBBLESTONE = registerBlock("compressed_cobblestone_x1",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLESTONE2 = registerBlock("compressed_cobblestone_x2",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLESTONE3 = registerBlock("compressed_cobblestone_x3",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLESTONE4 = registerBlock("compressed_cobblestone_x4",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLESTONE5 = registerBlock("compressed_cobblestone_x5",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLESTONE6 = registerBlock("compressed_cobblestone_x6",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLESTONE7 = registerBlock("compressed_cobblestone_x7",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLESTONE8 = registerBlock("compressed_cobblestone_x8",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_STONE = registerBlock("compressed_stone_x1",
            new Block(FabricBlockSettings.copy(Blocks.STONE).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_STONE2 = registerBlock("compressed_stone_x2",
            new Block(FabricBlockSettings.copy(Blocks.STONE).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_STONE3 = registerBlock("compressed_stone_x3",
            new Block(FabricBlockSettings.copy(Blocks.STONE).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_STONE4 = registerBlock("compressed_stone_x4",
            new Block(FabricBlockSettings.copy(Blocks.STONE).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_STONE5 = registerBlock("compressed_stone_x5",
            new Block(FabricBlockSettings.copy(Blocks.STONE).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_STONE6 = registerBlock("compressed_stone_x6",
            new Block(FabricBlockSettings.copy(Blocks.STONE).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_STONE7 = registerBlock("compressed_stone_x7",
            new Block(FabricBlockSettings.copy(Blocks.STONE).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_STONE8 = registerBlock("compressed_stone_x8",
            new Block(FabricBlockSettings.copy(Blocks.STONE).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_TERRACOTTA = registerBlock("compressed_terracotta_x1",
            new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_TERRACOTTA2 = registerBlock("compressed_terracotta_x2",
            new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_TERRACOTTA3 = registerBlock("compressed_terracotta_x3",
            new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_TERRACOTTA4 = registerBlock("compressed_terracotta_x4",
            new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_TERRACOTTA5 = registerBlock("compressed_terracotta_x5",
            new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_TERRACOTTA6 = registerBlock("compressed_terracotta_x6",
            new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_TERRACOTTA7 = registerBlock("compressed_terracotta_x7",
            new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_TERRACOTTA8 = registerBlock("compressed_terracotta_x8",
            new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_END_STONE = registerBlock("compressed_end_stone_x1",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_END_STONE2 = registerBlock("compressed_end_stone_x2",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_END_STONE3 = registerBlock("compressed_end_stone_x3",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_END_STONE4 = registerBlock("compressed_end_stone_x4",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_END_STONE5 = registerBlock("compressed_end_stone_x5",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_END_STONE6 = registerBlock("compressed_end_stone_x6",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_END_STONE7 = registerBlock("compressed_end_stone_x7",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_END_STONE8 = registerBlock("compressed_end_stone_x8",
            new Block(FabricBlockSettings.copy(Blocks.END_STONE).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIRT = registerBlock("compressed_dirt_x1",
            new Block(FabricBlockSettings.copy(Blocks.DIRT).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIRT2 = registerBlock("compressed_dirt_x2",
            new Block(FabricBlockSettings.copy(Blocks.DIRT).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIRT3 = registerBlock("compressed_dirt_x3",
            new Block(FabricBlockSettings.copy(Blocks.DIRT).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIRT4 = registerBlock("compressed_dirt_x4",
            new Block(FabricBlockSettings.copy(Blocks.DIRT).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIRT5 = registerBlock("compressed_dirt_x5",
            new Block(FabricBlockSettings.copy(Blocks.DIRT).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIRT6 = registerBlock("compressed_dirt_x6",
            new Block(FabricBlockSettings.copy(Blocks.DIRT).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIRT7 = registerBlock("compressed_dirt_x7",
            new Block(FabricBlockSettings.copy(Blocks.DIRT).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIRT8 = registerBlock("compressed_dirt_x8",
            new Block(FabricBlockSettings.copy(Blocks.DIRT).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRAVEL = registerBlock("compressed_gravel_x1",
            new FallingBlock(FabricBlockSettings.copy(Blocks.GRAVEL).strength(3, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRAVEL2 = registerBlock("compressed_gravel_x2",
            new FallingBlock(FabricBlockSettings.copy(Blocks.GRAVEL).strength(4, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRAVEL3 = registerBlock("compressed_gravel_x3",
            new FallingBlock(FabricBlockSettings.copy(Blocks.GRAVEL).strength(6, 150).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRAVEL4 = registerBlock("compressed_gravel_x4",
            new FallingBlock(FabricBlockSettings.copy(Blocks.GRAVEL).strength(8, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRAVEL5 = registerBlock("compressed_gravel_x5",
            new FallingBlock(FabricBlockSettings.copy(Blocks.GRAVEL).strength(10, 500).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRAVEL6 = registerBlock("compressed_gravel_x6",
            new FallingBlock(FabricBlockSettings.copy(Blocks.GRAVEL).strength(12, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRAVEL7 = registerBlock("compressed_gravel_x7",
            new FallingBlock(FabricBlockSettings.copy(Blocks.GRAVEL).strength(16, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRAVEL8 = registerBlock("compressed_gravel_x8",
            new FallingBlock(FabricBlockSettings.copy(Blocks.GRAVEL).strength(20, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SAND = registerBlock("compressed_sand_x1",
            new FallingBlock(FabricBlockSettings.copy(Blocks.SAND).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SAND2 = registerBlock("compressed_sand_x2",
            new FallingBlock(FabricBlockSettings.copy(Blocks.SAND).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SAND3 = registerBlock("compressed_sand_x3",
            new FallingBlock(FabricBlockSettings.copy(Blocks.SAND).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SAND4 = registerBlock("compressed_sand_x4",
            new FallingBlock(FabricBlockSettings.copy(Blocks.SAND).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SAND5 = registerBlock("compressed_sand_x5",
            new FallingBlock(FabricBlockSettings.copy(Blocks.SAND).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SAND6 = registerBlock("compressed_sand_x6",
            new FallingBlock(FabricBlockSettings.copy(Blocks.SAND).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SAND7 = registerBlock("compressed_sand_x7",
            new FallingBlock(FabricBlockSettings.copy(Blocks.SAND).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SAND8 = registerBlock("compressed_sand_x8",
            new FallingBlock(FabricBlockSettings.copy(Blocks.SAND).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERRACK = registerBlock("compressed_netherrack_x1",
            new NetherrackBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERRACK2 = registerBlock("compressed_netherrack_x2",
            new NetherrackBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERRACK3 = registerBlock("compressed_netherrack_x3",
            new NetherrackBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERRACK4 = registerBlock("compressed_netherrack_x4",
            new NetherrackBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERRACK5 = registerBlock("compressed_netherrack_x5",
            new NetherrackBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERRACK6 = registerBlock("compressed_netherrack_x6",
            new NetherrackBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERRACK7 = registerBlock("compressed_netherrack_x7",
            new NetherrackBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERRACK8 = registerBlock("compressed_netherrack_x8",
            new NetherrackBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).strength(4, 50000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_CLAY = registerBlock("compressed_clay_x1",
            new Block(FabricBlockSettings.copy(Blocks.CLAY).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_CLAY2 = registerBlock("compressed_clay_x2",
            new Block(FabricBlockSettings.copy(Blocks.CLAY).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_CLAY3 = registerBlock("compressed_clay_x3",
            new Block(FabricBlockSettings.copy(Blocks.CLAY).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_CLAY4 = registerBlock("compressed_clay_x4",
            new Block(FabricBlockSettings.copy(Blocks.CLAY).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_CLAY5 = registerBlock("compressed_clay_x5",
            new Block(FabricBlockSettings.copy(Blocks.CLAY).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_CLAY6 = registerBlock("compressed_clay_x6",
            new Block(FabricBlockSettings.copy(Blocks.CLAY).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_CLAY7 = registerBlock("compressed_clay_x7",
            new Block(FabricBlockSettings.copy(Blocks.CLAY).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_CLAY8 = registerBlock("compressed_clay_x8",
            new Block(FabricBlockSettings.copy(Blocks.CLAY).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SLIME = registerBlock("compressed_slime_x1",
            new SlimeBlock(FabricBlockSettings.copy(Blocks.SLIME_BLOCK).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SLIME2 = registerBlock("compressed_slime_x2",
            new SlimeBlock(FabricBlockSettings.copy(Blocks.SLIME_BLOCK).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SLIME3 = registerBlock("compressed_slime_x3",
            new SlimeBlock(FabricBlockSettings.copy(Blocks.SLIME_BLOCK).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SLIME4 = registerBlock("compressed_slime_x4",
            new SlimeBlock(FabricBlockSettings.copy(Blocks.SLIME_BLOCK).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SLIME5 = registerBlock("compressed_slime_x5",
            new SlimeBlock(FabricBlockSettings.copy(Blocks.SLIME_BLOCK).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SLIME6 = registerBlock("compressed_slime_x6",
            new SlimeBlock(FabricBlockSettings.copy(Blocks.SLIME_BLOCK).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SLIME7 = registerBlock("compressed_slime_x7",
            new SlimeBlock(FabricBlockSettings.copy(Blocks.SLIME_BLOCK).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SLIME8 = registerBlock("compressed_slime_x8",
            new SlimeBlock(FabricBlockSettings.copy(Blocks.SLIME_BLOCK).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ANDESITE = registerBlock("compressed_andesite_x1",
            new Block(FabricBlockSettings.copy(Blocks.ANDESITE).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ANDESITE2 = registerBlock("compressed_andesite_x2",
            new Block(FabricBlockSettings.copy(Blocks.ANDESITE).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ANDESITE3 = registerBlock("compressed_andesite_x3",
            new Block(FabricBlockSettings.copy(Blocks.ANDESITE).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ANDESITE4 = registerBlock("compressed_andesite_x4",
            new Block(FabricBlockSettings.copy(Blocks.ANDESITE).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ANDESITE5 = registerBlock("compressed_andesite_x5",
            new Block(FabricBlockSettings.copy(Blocks.ANDESITE).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ANDESITE6 = registerBlock("compressed_andesite_x6",
            new Block(FabricBlockSettings.copy(Blocks.ANDESITE).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ANDESITE7 = registerBlock("compressed_andesite_x7",
            new Block(FabricBlockSettings.copy(Blocks.ANDESITE).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ANDESITE8 = registerBlock("compressed_andesite_x8",
            new Block(FabricBlockSettings.copy(Blocks.ANDESITE).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DEEPSLATE = registerBlock("compressed_deepslate_x1",
            new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DEEPSLATE2 = registerBlock("compressed_deepslate_x2",
            new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DEEPSLATE3 = registerBlock("compressed_deepslate_x3",
            new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DEEPSLATE4 = registerBlock("compressed_deepslate_x4",
            new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DEEPSLATE5 = registerBlock("compressed_deepslate_x5",
            new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DEEPSLATE6 = registerBlock("compressed_deepslate_x6",
            new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DEEPSLATE7 = registerBlock("compressed_deepslate_x7",
            new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DEEPSLATE8 = registerBlock("compressed_deepslate_x8",
            new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLED_DEEPSLATE = registerBlock("compressed_cobbled_deepslate_x1",
            new Block(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLED_DEEPSLATE2 = registerBlock("compressed_cobbled_deepslate_x2",
            new Block(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLED_DEEPSLATE3 = registerBlock("compressed_cobbled_deepslate_x3",
            new Block(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLED_DEEPSLATE4 = registerBlock("compressed_cobbled_deepslate_x4",
            new Block(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLED_DEEPSLATE5 = registerBlock("compressed_cobbled_deepslate_x5",
            new Block(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLED_DEEPSLATE6 = registerBlock("compressed_cobbled_deepslate_x6",
            new Block(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLED_DEEPSLATE7 = registerBlock("compressed_cobbled_deepslate_x7",
            new Block(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COBBLED_DEEPSLATE8 = registerBlock("compressed_cobbled_deepslate_x8",
            new Block(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIORITE = registerBlock("compressed_diorite_x1",
            new Block(FabricBlockSettings.copy(Blocks.DIORITE).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIORITE2 = registerBlock("compressed_diorite_x2",
            new Block(FabricBlockSettings.copy(Blocks.DIORITE).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIORITE3 = registerBlock("compressed_diorite_x3",
            new Block(FabricBlockSettings.copy(Blocks.DIORITE).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIORITE4 = registerBlock("compressed_diorite_x4",
            new Block(FabricBlockSettings.copy(Blocks.DIORITE).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIORITE5 = registerBlock("compressed_diorite_x5",
            new Block(FabricBlockSettings.copy(Blocks.DIORITE).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIORITE6 = registerBlock("compressed_diorite_x6",
            new Block(FabricBlockSettings.copy(Blocks.DIORITE).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIORITE7 = registerBlock("compressed_diorite_x7",
            new Block(FabricBlockSettings.copy(Blocks.DIORITE).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIORITE8 = registerBlock("compressed_diorite_x8",
            new Block(FabricBlockSettings.copy(Blocks.DIORITE).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRANITE = registerBlock("compressed_granite_x1",
            new Block(FabricBlockSettings.copy(Blocks.GRANITE).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRANITE2 = registerBlock("compressed_granite_x2",
            new Block(FabricBlockSettings.copy(Blocks.GRANITE).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRANITE3 = registerBlock("compressed_granite_x3",
            new Block(FabricBlockSettings.copy(Blocks.GRANITE).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRANITE4 = registerBlock("compressed_granite_x4",
            new Block(FabricBlockSettings.copy(Blocks.GRANITE).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRANITE5 = registerBlock("compressed_granite_x5",
            new Block(FabricBlockSettings.copy(Blocks.GRANITE).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRANITE6 = registerBlock("compressed_granite_x6",
            new Block(FabricBlockSettings.copy(Blocks.GRANITE).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRANITE7 = registerBlock("compressed_granite_x7",
            new Block(FabricBlockSettings.copy(Blocks.GRANITE).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GRANITE8 = registerBlock("compressed_granite_x8",
            new Block(FabricBlockSettings.copy(Blocks.GRANITE).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OBSIDIAN = registerBlock("compressed_obsidian_x1",
            new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OBSIDIAN2 = registerBlock("compressed_obsidian_x2",
            new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OBSIDIAN3 = registerBlock("compressed_obsidian_x3",
            new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OBSIDIAN4 = registerBlock("compressed_obsidian_x4",
            new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OBSIDIAN5 = registerBlock("compressed_obsidian_x5",
            new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OBSIDIAN6 = registerBlock("compressed_obsidian_x6",
            new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OBSIDIAN7 = registerBlock("compressed_obsidian_x7",
            new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OBSIDIAN8 = registerBlock("compressed_obsidian_x8",
            new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_QUARTZ = registerBlock("compressed_quartz_x1",
            new Block(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_QUARTZ2 = registerBlock("compressed_quartz_x2",
            new Block(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_QUARTZ3 = registerBlock("compressed_quartz_x3",
            new Block(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_QUARTZ4 = registerBlock("compressed_quartz_x4",
            new Block(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_QUARTZ5 = registerBlock("compressed_quartz_x5",
            new Block(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_QUARTZ6 = registerBlock("compressed_quartz_x6",
            new Block(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_QUARTZ7 = registerBlock("compressed_quartz_x7",
            new Block(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_QUARTZ8 = registerBlock("compressed_quartz_x8",
            new Block(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GLASS = registerBlock("compressed_glass_x1",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(2, 40).requiresTool().nonOpaque()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GLASS2 = registerBlock("compressed_glass_x2",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(2, 100).requiresTool().nonOpaque()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GLASS3 = registerBlock("compressed_glass_x3",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(2, 200).requiresTool().nonOpaque()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GLASS4 = registerBlock("compressed_glass_x4",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(2, 1000).requiresTool().nonOpaque()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GLASS5 = registerBlock("compressed_glass_x5",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(3, 2000).requiresTool().nonOpaque()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GLASS6 = registerBlock("compressed_glass_x6",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(3, 5000).requiresTool().nonOpaque()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GLASS7 = registerBlock("compressed_glass_x7",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4, 10000).requiresTool().nonOpaque()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GLASS8 = registerBlock("compressed_glass_x8",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_WOOL = registerBlock("compressed_wool_x1",
            new GlassBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).strength(2, 40)), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_WOOL2 = registerBlock("compressed_wool_x2",
            new GlassBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).strength(2, 100)), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_WOOL3 = registerBlock("compressed_wool_x3",
            new GlassBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).strength(2, 200)), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_WOOL4 = registerBlock("compressed_wool_x4",
            new GlassBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).strength(2, 1000)), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_WOOL5 = registerBlock("compressed_wool_x5",
            new GlassBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).strength(3, 2000)), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_WOOL6 = registerBlock("compressed_wool_x6",
            new GlassBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).strength(3, 5000)), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_WOOL7 = registerBlock("compressed_wool_x7",
            new GlassBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).strength(4, 10000)), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_WOOL8 = registerBlock("compressed_wool_x8",
            new GlassBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).strength(4, 100000)), ItemGroups.BUILDING_BLOCKS);
    //
    //Ores
    //
    public static final Block COMPRESSED_AMETHYST = registerBlock("compressed_amethyst_x1",
            new AmethystBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_AMETHYST2 = registerBlock("compressed_amethyst_x2",
            new AmethystBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_AMETHYST3 = registerBlock("compressed_amethyst_x3",
            new AmethystBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_AMETHYST4 = registerBlock("compressed_amethyst_x4",
            new AmethystBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_AMETHYST5 = registerBlock("compressed_amethyst_x5",
            new AmethystBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_AMETHYST6 = registerBlock("compressed_amethyst_x6",
            new AmethystBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_AMETHYST7 = registerBlock("compressed_amethyst_x7",
            new AmethystBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_AMETHYST8 = registerBlock("compressed_amethyst_x8",
            new AmethystBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK).strength(4, 50000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COAL = registerBlock("compressed_coal_x1",
            new Block(FabricBlockSettings.copy(Blocks.COAL_BLOCK).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COAL2 = registerBlock("compressed_coal_x2",
            new Block(FabricBlockSettings.copy(Blocks.COAL_BLOCK).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COAL3 = registerBlock("compressed_coal_x3",
            new Block(FabricBlockSettings.copy(Blocks.COAL_BLOCK).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COAL4 = registerBlock("compressed_coal_x4",
            new Block(FabricBlockSettings.copy(Blocks.COAL_BLOCK).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COAL5 = registerBlock("compressed_coal_x5",
            new Block(FabricBlockSettings.copy(Blocks.COAL_BLOCK).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COAL6 = registerBlock("compressed_coal_x6",
            new Block(FabricBlockSettings.copy(Blocks.COAL_BLOCK).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COAL7 = registerBlock("compressed_coal_x7",
            new Block(FabricBlockSettings.copy(Blocks.COAL_BLOCK).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COAL8 = registerBlock("compressed_coal_x8",
            new Block(FabricBlockSettings.copy(Blocks.COAL_BLOCK).strength(4, 50000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COPPER = registerBlock("compressed_copper_x1",
            new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COPPER2 = registerBlock("compressed_copper_x2",
            new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COPPER3 = registerBlock("compressed_copper_x3",
            new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COPPER4 = registerBlock("compressed_copper_x4",
            new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COPPER5 = registerBlock("compressed_copper_x5",
            new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COPPER6 = registerBlock("compressed_copper_x6",
            new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COPPER7 = registerBlock("compressed_copper_x7",
            new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_COPPER8 = registerBlock("compressed_copper_x8",
            new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).strength(4, 50000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIAMOND = registerBlock("compressed_diamond_x1",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIAMOND2 = registerBlock("compressed_diamond_x2",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIAMOND3 = registerBlock("compressed_diamond_x3",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIAMOND4 = registerBlock("compressed_diamond_x4",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIAMOND5 = registerBlock("compressed_diamond_x5",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIAMOND6 = registerBlock("compressed_diamond_x6",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIAMOND7 = registerBlock("compressed_diamond_x7",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DIAMOND8 = registerBlock("compressed_diamond_x8",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(4, 50000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_EMERALD = registerBlock("compressed_emerald_x1",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_EMERALD2 = registerBlock("compressed_emerald_x2",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_EMERALD3 = registerBlock("compressed_emerald_x3",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_EMERALD4 = registerBlock("compressed_emerald_x4",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_EMERALD5 = registerBlock("compressed_emerald_x5",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_EMERALD6 = registerBlock("compressed_emerald_x6",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_EMERALD7 = registerBlock("compressed_emerald_x7",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_EMERALD8 = registerBlock("compressed_emerald_x8",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).strength(4, 50000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GOLD = registerBlock("compressed_gold_x1",
            new Block(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GOLD2 = registerBlock("compressed_gold_x2",
            new Block(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GOLD3 = registerBlock("compressed_gold_x3",
            new Block(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GOLD4 = registerBlock("compressed_gold_x4",
            new Block(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GOLD5 = registerBlock("compressed_gold_x5",
            new Block(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GOLD6 = registerBlock("compressed_gold_x6",
            new Block(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GOLD7 = registerBlock("compressed_gold_x7",
            new Block(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_GOLD8 = registerBlock("compressed_gold_x8",
            new Block(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).strength(4, 50000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_IRON = registerBlock("compressed_iron_x1",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_IRON2 = registerBlock("compressed_iron_x2",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_IRON3 = registerBlock("compressed_iron_x3",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_IRON4 = registerBlock("compressed_iron_x4",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_IRON5 = registerBlock("compressed_iron_x5",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_IRON6 = registerBlock("compressed_iron_x6",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_IRON7 = registerBlock("compressed_iron_x7",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_IRON8 = registerBlock("compressed_iron_x8",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK).strength(4, 50000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_LAPIS = registerBlock("compressed_lapis_x1",
            new Block(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_LAPIS2 = registerBlock("compressed_lapis_x2",
            new Block(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_LAPIS3 = registerBlock("compressed_lapis_x3",
            new Block(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_LAPIS4 = registerBlock("compressed_lapis_x4",
            new Block(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_LAPIS5 = registerBlock("compressed_lapis_x5",
            new Block(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_LAPIS6 = registerBlock("compressed_lapis_x6",
            new Block(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_LAPIS7 = registerBlock("compressed_lapis_x7",
            new Block(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_LAPIS8 = registerBlock("compressed_lapis_x8",
            new Block(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK).strength(4, 50000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_REDSTONE = registerBlock("compressed_redstone_x1",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_REDSTONE2 = registerBlock("compressed_redstone_x2",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_REDSTONE3 = registerBlock("compressed_redstone_x3",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_REDSTONE4 = registerBlock("compressed_redstone_x4",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_REDSTONE5 = registerBlock("compressed_redstone_x5",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_REDSTONE6 = registerBlock("compressed_redstone_x6",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_REDSTONE7 = registerBlock("compressed_redstone_x7",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_REDSTONE8 = registerBlock("compressed_redstone_x8",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK).strength(4, 50000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERITE = registerBlock("compressed_netherite_x1",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERITE2 = registerBlock("compressed_netherite_x2",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERITE3 = registerBlock("compressed_netherite_x3",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERITE4 = registerBlock("compressed_netherite_x4",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERITE5 = registerBlock("compressed_netherite_x5",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERITE6 = registerBlock("compressed_netherite_x6",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERITE7 = registerBlock("compressed_netherite_x7",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_NETHERITE8 = registerBlock("compressed_netherite_x8",
            new RedstoneBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).strength(4, 50000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    //
    // Wood
    //
    public static final Block COMPRESSED_ACACIA = registerBlock("compressed_acacia_x1",
            new PillarBlock(FabricBlockSettings.copy(Blocks.ACACIA_LOG).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ACACIA2 = registerBlock("compressed_acacia_x2",
            new PillarBlock(FabricBlockSettings.copy(Blocks.ACACIA_LOG).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ACACIA3 = registerBlock("compressed_acacia_x3",
            new PillarBlock(FabricBlockSettings.copy(Blocks.ACACIA_LOG).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ACACIA4 = registerBlock("compressed_acacia_x4",
            new PillarBlock(FabricBlockSettings.copy(Blocks.ACACIA_LOG).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ACACIA5 = registerBlock("compressed_acacia_x5",
            new PillarBlock(FabricBlockSettings.copy(Blocks.ACACIA_LOG).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ACACIA6 = registerBlock("compressed_acacia_x6",
            new PillarBlock(FabricBlockSettings.copy(Blocks.ACACIA_LOG).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ACACIA7 = registerBlock("compressed_acacia_x7",
            new PillarBlock(FabricBlockSettings.copy(Blocks.ACACIA_LOG).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_ACACIA8 = registerBlock("compressed_acacia_x8",
            new PillarBlock(FabricBlockSettings.copy(Blocks.ACACIA_LOG).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_BIRCH = registerBlock("compressed_birch_x1",
            new PillarBlock(FabricBlockSettings.copy(Blocks.BIRCH_LOG).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_BIRCH2 = registerBlock("compressed_birch_x2",
            new PillarBlock(FabricBlockSettings.copy(Blocks.BIRCH_LOG).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_BIRCH3 = registerBlock("compressed_birch_x3",
            new PillarBlock(FabricBlockSettings.copy(Blocks.BIRCH_LOG).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_BIRCH4 = registerBlock("compressed_birch_x4",
            new PillarBlock(FabricBlockSettings.copy(Blocks.BIRCH_LOG).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_BIRCH5 = registerBlock("compressed_birch_x5",
            new PillarBlock(FabricBlockSettings.copy(Blocks.BIRCH_LOG).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_BIRCH6 = registerBlock("compressed_birch_x6",
            new PillarBlock(FabricBlockSettings.copy(Blocks.BIRCH_LOG).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_BIRCH7 = registerBlock("compressed_birch_x7",
            new PillarBlock(FabricBlockSettings.copy(Blocks.BIRCH_LOG).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_BIRCH8 = registerBlock("compressed_birch_x8",
            new PillarBlock(FabricBlockSettings.copy(Blocks.BIRCH_LOG).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DARK_OAK = registerBlock("compressed_dark_oak_x1",
            new PillarBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_LOG).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DARK_OAK2 = registerBlock("compressed_dark_oak_x2",
            new PillarBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_LOG).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DARK_OAK3 = registerBlock("compressed_dark_oak_x3",
            new PillarBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_LOG).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DARK_OAK4 = registerBlock("compressed_dark_oak_x4",
            new PillarBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_LOG).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DARK_OAK5 = registerBlock("compressed_dark_oak_x5",
            new PillarBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_LOG).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DARK_OAK6 = registerBlock("compressed_dark_oak_x6",
            new PillarBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_LOG).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DARK_OAK7 = registerBlock("compressed_dark_oak_x7",
            new PillarBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_LOG).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_DARK_OAK8 = registerBlock("compressed_dark_oak_x8",
            new PillarBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_LOG).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_JUNGLE = registerBlock("compressed_jungle_x1",
            new PillarBlock(FabricBlockSettings.copy(Blocks.JUNGLE_LOG).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_JUNGLE2 = registerBlock("compressed_jungle_x2",
            new PillarBlock(FabricBlockSettings.copy(Blocks.JUNGLE_LOG).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_JUNGLE3 = registerBlock("compressed_jungle_x3",
            new PillarBlock(FabricBlockSettings.copy(Blocks.JUNGLE_LOG).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_JUNGLE4 = registerBlock("compressed_jungle_x4",
            new PillarBlock(FabricBlockSettings.copy(Blocks.JUNGLE_LOG).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_JUNGLE5 = registerBlock("compressed_jungle_x5",
            new PillarBlock(FabricBlockSettings.copy(Blocks.JUNGLE_LOG).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_JUNGLE6 = registerBlock("compressed_jungle_x6",
            new PillarBlock(FabricBlockSettings.copy(Blocks.JUNGLE_LOG).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_JUNGLE7 = registerBlock("compressed_jungle_x7",
            new PillarBlock(FabricBlockSettings.copy(Blocks.JUNGLE_LOG).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_JUNGLE8 = registerBlock("compressed_jungle_x8",
            new PillarBlock(FabricBlockSettings.copy(Blocks.JUNGLE_LOG).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OAK = registerBlock("compressed_oak_x1",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OAK2 = registerBlock("compressed_oak_x2",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OAK3 = registerBlock("compressed_oak_x3",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OAK4 = registerBlock("compressed_oak_x4",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OAK5 = registerBlock("compressed_oak_x5",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OAK6 = registerBlock("compressed_oak_x6",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OAK7 = registerBlock("compressed_oak_x7",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_OAK8 = registerBlock("compressed_oak_x8",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SPRUCE = registerBlock("compressed_spruce_x1",
            new PillarBlock(FabricBlockSettings.copy(Blocks.SPRUCE_LOG).strength(2, 40).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SPRUCE2 = registerBlock("compressed_spruce_x2",
            new PillarBlock(FabricBlockSettings.copy(Blocks.SPRUCE_LOG).strength(2, 100).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SPRUCE3 = registerBlock("compressed_spruce_x3",
            new PillarBlock(FabricBlockSettings.copy(Blocks.SPRUCE_LOG).strength(2, 200).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SPRUCE4 = registerBlock("compressed_spruce_x4",
            new PillarBlock(FabricBlockSettings.copy(Blocks.SPRUCE_LOG).strength(2, 1000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SPRUCE5 = registerBlock("compressed_spruce_x5",
            new PillarBlock(FabricBlockSettings.copy(Blocks.SPRUCE_LOG).strength(3, 2000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SPRUCE6 = registerBlock("compressed_spruce_x6",
            new PillarBlock(FabricBlockSettings.copy(Blocks.SPRUCE_LOG).strength(3, 5000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SPRUCE7 = registerBlock("compressed_spruce_x7",
            new PillarBlock(FabricBlockSettings.copy(Blocks.SPRUCE_LOG).strength(4, 10000).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block COMPRESSED_SPRUCE8 = registerBlock("compressed_spruce_x8",
            new PillarBlock(FabricBlockSettings.copy(Blocks.SPRUCE_LOG).strength(4, 100000).requiresTool()), ItemGroups.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(CompressedBlocks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(block));
        return Registry.register(Registries.ITEM, new Identifier(CompressedBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        CompressedBlocks.LOGGER.info("Registering Blocks for " + CompressedBlocks.MOD_ID);
    }
}
