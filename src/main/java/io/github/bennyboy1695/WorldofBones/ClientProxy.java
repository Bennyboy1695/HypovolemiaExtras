package io.github.bennyboy1695.WorldofBones;

import cpw.mods.fml.client.registry.RenderingRegistry;
import io.github.bennyboy1695.entities.MobCaithleen;
import io.github.bennyboy1695.entities.RenderMobCaithleen;
import net.minecraft.client.model.ModelZombie;

public class ClientProxy extends ServerProxy{

    @Override
	public void registerRenderInfo(){
        RenderingRegistry.registerEntityRenderingHandler(MobCaithleen.class, new RenderMobCaithleen(new ModelZombie(), 3.0F));
    }
}
