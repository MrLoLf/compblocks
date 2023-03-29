package net.mrlolf.compressedblocks.util;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.mrlolf.compressedblocks.CompressedBlocks;

public class ModTags {
    public class Blocks{
        public static final Tag.Identified<Block> createTag(String name){
            return TagFactory.BLOCK.create(new Identifier(CompressedBlocks.MOD_ID, name));
        }
        public static final Tag.Identified<Block> createCommonTag(String name){
            return TagFactory.BLOCK.create(new Identifier("c", name));
        }
    }

    public class Items{

        public static final Tag.Identified<Item> createTag(String name){
            return TagFactory.ITEM.create(new Identifier(CompressedBlocks.MOD_ID, name));
        }
        public static final Tag.Identified<Item> createCommonTag(String name){
            return TagFactory.ITEM.create(new Identifier("c", name));
        }

    }
}