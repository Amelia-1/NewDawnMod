package net.amelia1.newdawn.util;

import net.amelia1.newdawn.NewDawn;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> METAL_DETECOR_VALUABLES = tag("metal_detector_valuables");


        private static TagKey<Block> tag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(NewDawn.MOD_ID, name));
        }
    }

    public static class Items{

    }
}
