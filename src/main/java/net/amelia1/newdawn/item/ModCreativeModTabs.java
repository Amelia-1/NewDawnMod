package net.amelia1.newdawn.item;

import net.amelia1.newdawn.NewDawn;
import net.amelia1.newdawn.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewDawn.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NEWDAWN_TAB = CREATIVE_MODE_TABS.register("newdawn_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.STEEL_BLOCK.get()))
                    .title(Component.translatable("creativetab.newdawn_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModBlocks.STEEL_BLOCK.get());
                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.STEEL_NUGGET.get());
                        output.accept(ModItems.STEEL_DUST.get());

                        output.accept(ModItems.RAW_LEAD.get());


                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
