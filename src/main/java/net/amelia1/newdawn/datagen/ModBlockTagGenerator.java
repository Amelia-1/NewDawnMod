package net.amelia1.newdawn.datagen;

import net.amelia1.newdawn.NewDawn;
import net.amelia1.newdawn.block.ModBlocks;
import net.amelia1.newdawn.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, NewDawn.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECOR_VALUABLES)
                .add(ModBlocks.LEAD_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SOUND_BLOCK.get(),
                    ModBlocks.LEAD_ORE.get(),
                    ModBlocks.STEEL_BLOCK.get());



        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.LEAD_ORE.get());


        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);


        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SOUND_BLOCK.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

    }
}
