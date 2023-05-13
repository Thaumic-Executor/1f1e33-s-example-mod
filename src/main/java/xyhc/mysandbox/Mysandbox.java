package xyhc.mysandbox;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import xyhc.mysandbox.common.registries.Registration;
import xyhc.mysandbox.setup.ModSetup;

@Mod(Mysandbox.MOD_ID)
public class Mysandbox {
    public static final String MOD_ID="mysandbox";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Mysandbox() {
        LOGGER.warn("Starting!!!");
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        MinecraftForge.EVENT_BUS.register(this);
        Registration.ITEMS.register(modbus);
        Registration.BLOCKS.register(modbus);
    }
}
