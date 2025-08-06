package dev.alsojiangshi.enderlead;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "enderlead");

    public static final RegistryObject<CreativeModeTab> ENDERLEAD_TAB =
        CREATIVE_MODE_TABS.register("enderlead_tab",
            () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.enderlead"))
                .icon(() -> new ItemStack(ModItems.ENDER_LEAD.get()))
                .displayItems((parameters, output) -> {
                    output.accept(ModItems.ENDER_LEAD.get());
                })
                .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
