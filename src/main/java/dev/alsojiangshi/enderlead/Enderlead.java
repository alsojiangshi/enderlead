package dev.alsojiangshi.enderlead;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("enderlead")
public class Enderlead {
    public Enderlead() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register();
        ModCreativeModeTabs.register(modEventBus);
    }
}
