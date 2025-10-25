package com.treetop.tutorialmod.item;

import com.treetop.tutorialmod.TutorialMod;
import com.treetop.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> OBSIDIAN_NEW = CREATIVE_MODE_TABS.register("obisdiannewtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OBSIDIANSHARD.get()))
                    .title(Component.translatable("creativetab.tutorialmod.obisdiannewitems"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.OBSIDIANSHARD.get());
                        output.accept(ModItems.OBSIDIANSCALP.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> OBSIDIAN_NEW_BLOCKS = CREATIVE_MODE_TABS.register("obisdiannewblockstab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MAHOGANYOBSIDIAN.get()))
                    .withTabsBefore(OBSIDIAN_NEW.getId())
                    .title(Component.translatable("creativetab.tutorialmod.obisdiannewblocksitems"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.MAHOGANYOBSIDIAN.get());
                        output.accept(ModBlocks.MAHOGANYOBSIDIANPOLISHED.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
