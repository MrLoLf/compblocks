package net.mrlolf.compressedblocks.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mrlolf.compressedblocks.CompressedBlocks;

public class ModTags {
    public class Blocks{
        public static final TagKey<Block> createTag(String name){
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(CompressedBlocks.MOD_ID, name));
        }
        public static final TagKey<Block> createCommonTag(String name){
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }

    public class Items{

        public static final TagKey<Item> createTag(String name){
            return TagKey.of(Registry.ITEM_KEY, new Identifier(CompressedBlocks.MOD_ID, name));
        }
        public static final TagKey<Item> createCommonTag(String name){
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }

    }
}